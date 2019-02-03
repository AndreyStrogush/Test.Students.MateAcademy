public class Human {
    private int id;
    private String firstName;
    private String secondName;
    private int age;
    private Gender gender;

    public Human (int id, String firstName, String secondName, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", secondName = '" + secondName + '\'' +
                ", age = " + age +
                ", gender = " + gender;
    }
}
