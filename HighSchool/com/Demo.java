package HighSchool.com;
public class Demo {
    public static void main(String[] args) {
        // Creating Person object
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        // Creating Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // Creating Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // Creating CollegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
