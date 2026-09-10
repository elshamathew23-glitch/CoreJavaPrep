package EmployeeTask;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(){}
    public Employee(int id, String name, String department, double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public int getId() {

        return id;
    }

    public void setId() {
        this.id = id;
    }
    public String getName() {

        return name;
    }

    public void setName() {
        this.name = name;
    }
    public String getDepartment() {

        return department;
    }

    public void setDepartment() {
        this.department = department;
    }
    public double getSalary() {

        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}
