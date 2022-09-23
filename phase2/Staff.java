package practice8.phase2;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Staff implements Comparable<Staff> {
    private String name;
    private int phone;
    private String address;
    private String date;
    private String department;
    private String job;
    private float seniority;
    private int salary;

    public Staff() {

    }

    public Staff(String name, int phone, String address, String date, String department, String job, float seniority, int salary) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.department = department;
        this.job = job;
        this.seniority = seniority;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMonth() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate localDate = LocalDate.parse(date,dateTimeFormatter);
        return localDate.getMonthValue();
    }

    public int getAge() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate localDate = LocalDate.parse(date,dateTimeFormatter);
        return LocalDate.now().getYear() - localDate.getYear();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getSeniority() {
        return seniority;
    }

    public void setSeniority(float seniority) {
        this.seniority = seniority;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVacationDay() {
        if (seniority >= 10 ) {
            return 23;
        } else if (seniority >= 5) {
            return 18;
        } else if (seniority >= 3) {
            return 15;
        } else if (seniority >= 2) {
            return 13;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name= " + name + '\'' +
                ", phone= +84" + phone +
                ", address= " + address + '\'' +
                ", date= " + date +
                ", department= " + department + '\'' +
                ", job= " + job + '\'' +
                ", seniority= " + seniority +
                ", salary= " + salary +
                '}';
    }

    @Override
    public int compareTo(Staff o) {
        return this.name.compareTo(o.name);
    }
}
