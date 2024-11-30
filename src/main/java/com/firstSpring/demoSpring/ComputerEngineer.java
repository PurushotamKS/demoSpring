package com.firstSpring.demoSpring;

import java.util.List;

public class ComputerEngineer implements Engineer {
    private String name;
    private double amount;
    private String skills;
//    private Address address;
    private List<Address> addresses;
    ComputerEngineer(){

    }
    @Override
    public void workForWages() {

    }

    @Override
    public String toString() {
        return "ComputerEngineer{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", skills='" + skills + '\'' +
                ", address='" + addresses +
                '}';
    }

    public void setAmount(double amount) {
        this.amount = amount;
        System.out.println("Setter called");
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setAddress(Address address) {
//        this.address = address;
//    }


    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}