package group.streamAPI;

public class Employee {
    private String fullName;
    private Integer age;
    private String department;
    private Double salary;

    public Employee() {
        this.fullName = "Науменов Наумен Науменович";
        this.age = 25;
        this.department = "Отдел дизайна банкнот банка приколов";
        this.salary = 25900.035;
    }

    public Employee(String fullName, Integer age, String department, Double salary) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return this.fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return this.age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return this.salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
