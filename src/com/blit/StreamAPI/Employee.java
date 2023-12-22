package com.blit.StreamAPI;

public class Employee {
    int emp_id;

    String name;

    public int getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    int points;

    public Employee(int emp_id, String name, int points) {
        this.emp_id = emp_id;
        this.name = name;
        this.points = points;
    }

    public void setName(String name) {
        this.name += name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + this.emp_id +
                ", name='" + this.name + '\'' +
                ", points=" + this.points +
                '}';
    }
}
