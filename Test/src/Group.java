import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Group {
    private int id;
    private String groupName;
    private ArrayList<Student> studentList;

    public Group(int id, String groupName, ArrayList<Student> studentList) {
        this.id = id;
        this.groupName = groupName;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return groupName;
    }
    //    public void addStudent(BufferedReader br) throws IOException {
//        System.out.println("Введите ID группы ");
//        int groupId = Integer.parseInt(br.readLine());
//        ArrayList<Student> students = new ArrayList<>();
//        System.out.println("Введите ID студента");
//        int id = Integer.parseInt(br.readLine());
//        System.out.print("Введите имя: ");
//        String name = br.readLine();
//        System.out.print("Введите фамилие: ");
//        String surname = br.readLine();
//        System.out.print("Введите возраст ");
//        int age = Integer.parseInt(br.readLine());
//        System.out.println("Введите пол (1 - Ж / 2 - M  ");
//        int tempGender =Integer.parseInt(br.readLine());
//        Gender gender;
//        switch (tempGender){
//            case 1:
//                gender = Gender.FEMALE;
//                break;
//            case 2:
//                gender = Gender.MALE;
//                break;
//            default:
//                gender = Gender.FEMALE;
//                break;
//        }
//        System.out.println("Введите факультет(1 - JAVA / 2 - PHP / 3 - Python");
//        Faculty faculty;
//        int tempFaculty =Integer.parseInt(br.readLine());
//        switch (tempFaculty){
//            case 1:
//                faculty = Faculty.JAVA;
//                break;
//            case 2:
//                faculty = Faculty.PHP;
//                break;
//            case 3:
//                faculty = Faculty.Python;
//                break;
//            default:
//                faculty = Faculty.JAVA;
//        }
//
//        System.out.println("Введите название группы");
//        String groupName = br.readLine();
//        System.out.println("Введите среднюю оценку");
//        double averageEvaluation = Double.parseDouble(br.readLine());
//        boolean isPraepostor =false;
//        boolean isHere = true;
//
//        Student student = new Student(id,name,surname,age,gender,faculty,groupName,averageEvaluation,isPraepostor,isHere );
//        students.add(student);
//    }
//
}