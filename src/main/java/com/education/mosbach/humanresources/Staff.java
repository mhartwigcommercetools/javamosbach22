package com.education.mosbach.humanresources;

import java.util.Comparator;
import java.util.Objects;

public class Staff implements Comparable {

    private String firstName;
    private String lastName;
    private String staffID;
    private double salary;

    public Staff(String firstName, String lastName, String staffID, double salary, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.staffID = staffID;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return
                Objects.equals(staffID, ((Staff) o).staffID);
    }


    @Override
    public String toString() {
        return
                "Staff " + staffID + " " + firstName + " " + lastName +  " " + jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    private String jobTitle;


    @Override
    public int compareTo(Object o) {
        if (o == null || getClass() != o.getClass()) return 1;

        Staff otherStaff = (Staff) o;
        if (getLastName().equals(otherStaff.getLastName()))
            return
                getFirstName().compareTo(otherStaff.getFirstName());

        return
                getLastName().compareTo(otherStaff.getLastName());
    }

    @Override
    public int hashCode() {
        return
                staffID.length();
    }

}
