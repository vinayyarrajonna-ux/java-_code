class Employee {
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("Mohith");
        e.setAge(20);
        e.setSalary(35000);

        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Salary: " + e.getSalary());
    }
}
