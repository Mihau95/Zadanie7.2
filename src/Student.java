public class Student extends Person {
    private int yearOfStudy;


    public Student(String firstName, String lastName, int yearOfStudy){
        super(firstName, lastName);
        this.yearOfStudy=yearOfStudy;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Rok nauki: " + yearOfStudy);
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}