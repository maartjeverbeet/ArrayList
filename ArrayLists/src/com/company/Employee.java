package com.company;

import java.util.Objects;

public class Employee {

    private String fristName;
    private String lastName;
    private int id;

    public Employee(String fristName, String lastName, int id) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(fristName, employee.fristName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fristName, lastName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
