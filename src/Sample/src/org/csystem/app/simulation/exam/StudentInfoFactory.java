package org.csystem.app.simulation.exam;

import java.util.Random;

import static org.csystem.util.string.StringUtil.generateRandomTextEN;

public class StudentInfoFactory {
    public Random random;

    public StudentInfoFactory()
    {
        random = new Random();
    }

    public StudentInfoFactory(Random r)
    {
        random = r;
    }

    public StudentInfo createStudentInfo(String lectureName)
    {
        StudentInfo studentInfo = new StudentInfo();

        studentInfo.name = String.format("%s %s", generateRandomTextEN(random, random.nextInt(5, 11)),
                generateRandomTextEN(random, random.nextInt(5, 11)));
        studentInfo.lectureName = lectureName;
        studentInfo.midtermGrade = random.nextInt(0, 101);
        studentInfo.finalGrade = random.nextInt(0, 101);

        return studentInfo;
    }
}
