import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Student extends Human{

    private Faculty faculty;
    private String groupName;
    private double averageEvaluation;
    private boolean isPraepostor;
    private boolean isHere;

    public Student(int id, String firstName, String secondName, int age,
                   Gender gender, Faculty faculty, String groupName,
                   double averageEvaluation, boolean isPraepostor, boolean isHere) {
        super(id, firstName, secondName, age, gender);
        this.faculty = faculty;
        this.groupName = groupName;
        this.averageEvaluation = averageEvaluation;
        this.isPraepostor = isPraepostor;
        this.isHere = isHere;
    }


    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public double getAverageEvaluation() {
        return averageEvaluation;
    }

    public void setAverageEvaluation(double averageEvaluation) {
        this.averageEvaluation = averageEvaluation;
    }

    public boolean isPraepostor() {
        return isPraepostor;
    }

    public void setPraepostor(boolean praepostor) {
        isPraepostor = praepostor;
    }

    public boolean isHere() {
        return isHere;
    }

    public void setHere(boolean here) {
        isHere = here;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n faculty = " + faculty +
                ", groupName = " + groupName  +
                ", averageEvaluation = " + averageEvaluation +
                ", isPraepostor = " + isPraepostor +
                ", isHere = " + isHere +"; \n";
    }
}
