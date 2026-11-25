class Employee1 {
    private int emp_id;
    private String name;
    private String dept;
    private double salary;

    Employee1(int emp_id, String name, String dept, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1(
            101, "Mohith", "CSE", 40000
        );

        System.out.println("Employee ID: " + e.getEmp_id());
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDept());
        System.out.println("Salary: " + e.getSalary());
    }
}
