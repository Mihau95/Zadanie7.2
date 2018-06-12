public class School {
    public static void main(String[] args) {
        Person person1 = new Student("Adam", "Waski", 2);
        Person person2 = new Teacher("Stefan", "Siara", 8, 2500);

        person1.showInfo();
        person2.showInfo();
    }
}
