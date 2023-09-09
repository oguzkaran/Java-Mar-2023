package org.csystem.app.simulation.exam;

public class StudentInfo {
    public String name;
    public String lectureName;
    public int midtermGrade;
    public int finalGrade;

    public double getGrade()
    {
        return midtermGrade * 0.4 + finalGrade * 0.6;
    }

    public boolean success()
    {
        return getGrade() >= 50;
    }

    public String toString()
    {
        return String.format("%s, %d, %d, %.2f, %s", name, midtermGrade, finalGrade, getGrade(), success() ? "Success" : "Fail");
    }
}
