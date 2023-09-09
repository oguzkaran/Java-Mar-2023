
package org.csystem.app.simulation.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    public String lectureName;
    public StudentInfo [][] students;
    public double [] gradeAverages;
    public int [] successCounts;
    public int [] failCounts;
    public double average;
    public int totalSuccess;
    public int totalFail;

    public void readClassInformation()
    {
        Scanner kb = new Scanner(System.in);

        System.out.printf("Input number of class for '%s' exam:", lectureName);
        students = new StudentInfo[Integer.parseInt(kb.nextLine())][];

        for (int i = 0; i < students.length; ++i) {
            System.out.printf("Input number of student in class %d:", i + 1);
            students[i] = new StudentInfo[Integer.parseInt(kb.nextLine())];
            gradeAverages = new double[students.length];
            successCounts = new int[students.length];
            failCounts = new int[students.length];
        }
    }

    public void generateStudents()
    {
        Random random = new Random();

        StudentInfoFactory factory = new StudentInfoFactory(random);

        double totalGrades = 0;
        int allStudentsCount = 0;

        for (int i = 0; i < students.length; ++i) {
            double total = 0;
            int count = students[i].length;
            for (int k = 0; k < students[i].length; ++k) {
                students[i][k] = factory.createStudentInfo(lectureName);
                total += students[i][k].getGrade();

                if (students[i][k].success())
                    ++successCounts[i];
                else
                    ++failCounts[i];
            }
            gradeAverages[i] = total / count;
            totalGrades += total;
            allStudentsCount += count;
            totalSuccess += successCounts[i];
            totalFail += failCounts[i];
            average = totalGrades / allStudentsCount;
        }
    }

    public void doSimulation()
    {
        readClassInformation();
        generateStudents();
    }

    public ExamSimulation(String name)
    {
        lectureName = name;
    }

    public void printStudents()
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Grades");
        for (int i = 0; i < students.length; ++i) {
            System.out.printf("Class %d:%n", i + 1);
            for (int k = 0; k < students[i].length; ++k)
                System.out.printf("\"%s\"%n", students[i][k].toString());
        }

        System.out.println("-----------------------------------------------------------------------------");
    }

    public void printReport()
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Results:");
        System.out.println("Averages:");
        for (double average : gradeAverages)
            System.out.printf("%.2f ", average);

        System.out.println();

        System.out.println("Success Counts:");
        for (int value : successCounts)
            System.out.printf("%d ", value);

        System.out.println();
        System.out.println("Fail Counts:");
        for (int value : failCounts)
            System.out.printf("%d ", value);

        System.out.println();

        System.out.printf("Total Average:%.2f, Total Success:%d, Total Fail:%d%n", average, totalSuccess, totalFail);
        System.out.println("-----------------------------------------------------------------------------");
    }

    public void run()
    {
        doSimulation();
    }
}
