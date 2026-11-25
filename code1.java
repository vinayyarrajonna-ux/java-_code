class Student {
    String name;
    int rollNumber;
    int age;
    double marks;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Mahesh";
        s.rollNumber = 101;
        s.age = 18;
        s.marks = 85.5;

        s.displayDetails();
    }
}
