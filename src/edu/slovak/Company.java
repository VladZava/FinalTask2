package edu.slovak;

import java.util.ArrayList;

public class Company {
    // parent for this company nullable, when there is no parent for this company
    private String name;
    private Company parent;
    private long employeesCount;
    private ArrayList<Company> children;

    // constructor
    public Company(String name, Company parent, long employeesCount) {
        this.name = name;
        this.parent = parent;
        this.employeesCount = employeesCount;
        this.children = new ArrayList<>();

        // if this company has parent, add it to parent's children list
        if (parent != null) {
            parent.addChild(this);
        }
    }

    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Company> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Company> children) {
        this.children = children;
    }

    public void addChild(Company company) {
        this.children.add(company);
    }

    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", name='" + name + '\'' +
                ", employeesCount=" + employeesCount +
                '}';
    }
