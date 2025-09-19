package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company() {

    }

    public Company(int id, String name, double giro, String[] developerNames) {
        if(giro < 0) {
            giro = 0;
        }

        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        boolean isContains = false;

        for (String developer:developerNames) {

                if(developer == name) {
                    isContains = true;
                    System.out.println("Developer name is already added.");
                }

        }

        if (developerNames.length <= index || index < 0) {
            System.out.println("Wrong index.");
        } else if(!isContains) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("Given index is already filled.");
            }
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" + " id; " + id +
                " name; " + name +
                " giro; " + giro +
                " developerNames; " + Arrays.toString(developerNames) + "}";
    }
}
