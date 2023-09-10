
package org.csystem.app.simulation.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    private String m_lectureName;
    private StudentInfo [][] m_students;
    private double [] m_gradeAverages;
    private int [] m_successCounts;
    private int [] m_failCounts;
    private double m_average;
    private int m_totalSuccess;
    private int m_totalFail;

    public void readClassInformation()
    {
        Scanner kb = new Scanner(System.in);

        System.out.printf("Input number of class for '%s' exam:", m_lectureName);
        m_students = new StudentInfo[Integer.parseInt(kb.nextLine())][];

        for (int i = 0; i < m_students.length; ++i) {
            System.out.printf("Input number of student in class %d:", i + 1);
            m_students[i] = new StudentInfo[Integer.parseInt(kb.nextLine())];
            m_gradeAverages = new double[m_students.length];
            m_successCounts = new int[m_students.length];
            m_failCounts = new int[m_students.length];
        }
    }

    public void generateStudents()
    {
        Random random = new Random();

        StudentInfoFactory factory = new StudentInfoFactory(random);

        double totalGrades = 0;
        int allStudentsCount = 0;

        for (int i = 0; i < m_students.length; ++i) {
            double total = 0;
            int count = m_students[i].length;
            for (int k = 0; k < m_students[i].length; ++k) {
                m_students[i][k] = factory.createStudentInfo(m_lectureName);
                total += m_students[i][k].getGrade();

                if (m_students[i][k].success())
                    ++m_successCounts[i];
                else
                    ++m_failCounts[i];
            }
            m_gradeAverages[i] = total / count;
            totalGrades += total;
            allStudentsCount += count;
            m_totalSuccess += m_successCounts[i];
            m_totalFail += m_failCounts[i];
            m_average = totalGrades / allStudentsCount;
        }
    }

    public void doSimulation()
    {
        readClassInformation();
        generateStudents();
    }

    public ExamSimulation(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public void printStudents()
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Grades");
        for (int i = 0; i < m_students.length; ++i) {
            System.out.printf("Class %d:%n", i + 1);
            for (int k = 0; k < m_students[i].length; ++k)
                System.out.printf("\"%s\"%n", m_students[i][k].toString());
        }

        System.out.println("-----------------------------------------------------------------------------");
    }

    public void printReport()
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Results:");
        System.out.println("Averages:");
        for (double average : m_gradeAverages)
            System.out.printf("%.2f ", average);

        System.out.println();

        System.out.println("Success Counts:");
        for (int value : m_successCounts)
            System.out.printf("%d ", value);

        System.out.println();
        System.out.println("Fail Counts:");
        for (int value : m_failCounts)
            System.out.printf("%d ", value);

        System.out.println();

        System.out.printf("Total Average:%.2f, Total Success:%d, Total Fail:%d%n", m_average, m_totalSuccess, m_totalFail);
        System.out.println("-----------------------------------------------------------------------------");
    }

    public void run()
    {
        doSimulation();
    }
}
