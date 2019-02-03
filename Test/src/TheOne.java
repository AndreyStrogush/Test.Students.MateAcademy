import java.util.ArrayList;
import java.util.List;

public class TheOne {

    public static ArrayList<Professor> getProfessorList(){
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(new Professor(1, "Oleg", "Ghuk", 55, Gender.MALE, 15, Faculty.JAVA ));
        professors.add(new Professor(2, "Artiom", "Udalcov", 66, Gender.MALE, 19, Faculty.JAVA ));
        professors.add(new Professor(3, "Anna", "Timoshenko", 44, Gender.FEMALE, 13, Faculty.PHP ));
        professors.add(new Professor(4, "Galina", "Bogoslovskaja", 33, Gender.FEMALE, 12, Faculty.Python ));
        professors.add(new Professor(5, "Svetlana", "Suprun", 26, Gender.FEMALE, 8, Faculty.PHP ));
        return professors;
    }
    private static ArrayList<Student> get1JavaList(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(10, "Andrey", "Nikolaenko", 18, Gender.MALE,  Faculty.JAVA, "1JAVA", 11.35,  false, false));
        students.add(new Student(11, "Anastasia", "Ivanova", 18, Gender.FEMALE,  Faculty.JAVA, "1JAVA", 9.36,  false, true));
        students.add(new Student(12, "Sergey", "Petrov", 18, Gender.MALE,  Faculty.JAVA, "1JAVA", 7.88,  false, true));
        students.add(new Student(13, "Tatiana", "Shevchenko", 18, Gender.FEMALE,  Faculty.JAVA, "1JAVA", 11.02,  false, false));
        students.add(new Student(14, "Uliya", "Unak", 18, Gender.MALE,  Faculty.JAVA, "1JAVA", 10.55,  false, true));
        return students;
    }
    public static Group get1JavaGroup(){
        return new Group(1, "1JAVA", get1JavaList());
    }

    private static ArrayList<Student> get1PHPList(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(20, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "1PHP", 8.55,false, false));
        students.add(new Student(21, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "1PHP", 6.33, false, true));
        students.add(new Student(22, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "1PHP", 6.99, false, false));
        students.add(new Student(23, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "1PHP", 11.2, false, true));
        students.add(new Student(24, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "1PHP", 10.54, false, true));
        return students;
    }
    public static Group get1PHPGroup(){
        return new Group(2, "1PHP", get1PHPList());
    }

    private static ArrayList<Student> get2PHPList(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(30, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "2PHP", 6.33, false, true));
        students.add(new Student(31, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "2PHP", 8.44, false, true));
        students.add(new Student(32, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "2PHP", 9.12, false, true));
        students.add(new Student(33, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "2PHP", 11.223, false, true));
        students.add(new Student(34, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.PHP, "2PHP", 3.33, false, true));
        return students;
    }
    public static Group get2PHPGroup(){
        return new Group(3, "2PHP", get2PHPList());
    }

    private static ArrayList<Student> get1PythonList(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(40, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.Python, "1Python", 6.33, false, true));
        students.add(new Student(41, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.Python, "1Python", 4.5, false, true));
        students.add(new Student(42, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.Python, "1Python", 6, false, true));
        students.add(new Student(43, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.Python, "1Python", 8.737, false, true));
        students.add(new Student(44, "Mihail", "Necheporuk", 18, Gender.MALE, Faculty.Python, "1Python", 12.847, false, true));
        return students;
    }
    public static Group get1PythonGroup(){
        return new Group(4, "1Python", get1PythonList());
    }

    public static ArrayList<Group> getGroupList(){
        ArrayList<Group> groups = new ArrayList<>();
        groups.add(get1JavaGroup());
        groups.add(get1PHPGroup());
        groups.add(get2PHPGroup());
        groups.add(get1PythonGroup());

        return groups;
    }
    //перекличка
    public  static void rollСall(Group group){
        ArrayList<Student> students = group.getStudentList();
        ArrayList<Student> presents = new ArrayList<Student>();
        ArrayList<Student> absents = new ArrayList<Student>();
        int presentCount = 0;
        int absentCount = 0;
        for (Student student : students) {
            if (student.isHere()) {
                presents.add(student);
                presentCount++;
            } else {
                absents.add(student);
                absentCount++;
            }
        }
        System.out.println(" присутствует: " + presentCount + " и отсутствует: " + absentCount);
        System.out.println("Список присутствующих: ");
        TheOne.printStudentList(presents);
        System.out.println("Список отсутствующих: ");
        TheOne.printStudentList(absents);
    }

    // выборы старосты - выбираем по максимальному среднему баллу
    // если несколько баллов совпадут выберется первый по списку
    // praepostor
    // передаем номер группы в которой выбираем старосту
    public static void getPraepostor(Group group){
        ArrayList<Student> students = group.getStudentList();

        Student lucky;          // победитель
        int numberOfStudentWithHighestAverageEvaluation = 0; //инициализируем переменную для определения номера студента с наивысшим средним баллом
        double evaluation = 0; // средний бал

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageEvaluation() > evaluation){
                evaluation = students.get(i).getAverageEvaluation();
                numberOfStudentWithHighestAverageEvaluation = i;
            }
        }

        lucky = students.get(numberOfStudentWithHighestAverageEvaluation);
        lucky.setPraepostor(true);
        System.out.println("Старостой группы " + group.getGroupName() + " избран:  " +" \n" + lucky.toString());

    }
    
    public static void printStudentList(ArrayList<Student> list){
    for (Student student: list) {
        System.out.println(student.toString());
        }
    }

    public  static void printAllStudents(ArrayList<Group> groups){
        for (Group group: groups){
            System.out.println("\n Группа " + group.toString() + "\n");

            System.out.println(group.getStudentList());
        }
//        System.out.println("\n Группа 1 JAVA: \n" );
//        System.out.println(get1JavaList());
//        System.out.println("\n Группа 1 PHP: \n" );
//        System.out.println(get1PHPList());
//        System.out.println("\n Группа 2 PHP: \n" );
//        System.out.println(get2PHPList());
//        System.out.println("\n Группа 1 Python: \n" );
//        System.out.println(get1PythonList());

    }
    public static void printGroupList(ArrayList<Group> list){
        for (Group group: list){
            System.out.println(group.toString());
        }
    }

    public static void printProfessorList(ArrayList<Professor> list) {
        for (Professor professor : list) {
            System.out.println(professor.toString());
        }
    }
}

