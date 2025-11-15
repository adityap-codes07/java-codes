class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;
    double grade;

    Student() {
        super();
        this.course = "Unknown";
        this.grade = 0.0;
    }

    Student(String name, int age) {
        super(name, age);
        this.course = "Unknown";
        this.grade = 0.0;
    }

    Student(String name, int age, String course, double grade) {
        super(name, age);
        this.course = course;
        this.grade = grade;
    }

    void showStudent() {
        showPerson();
        System.out.println("Course: " + course + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aditya", 19);
        Student s3 = new Student("Priya", 20, "Computer Science", 9.5);

        s1.showStudent();
        s2.showStudent();
        s3.showStudent();
    }
}
