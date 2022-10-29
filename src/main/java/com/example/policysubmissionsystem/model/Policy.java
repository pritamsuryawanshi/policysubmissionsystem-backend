package com.example.policysubmissionsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
//model ..table name
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String policyNumber;

    @Column
    private String firstName;

    @Column
    private String lastName;


/*
    @Column
    private String dob;

    @Column
    private String gender;

    @Column
    private int Age;

    @Column
    private String Address;

    @Column
    private String State;

    @Column
    private String Country;

    @Column
    private String Product;*/


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
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

    /*public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }*/

    public Policy() {

    }

    public Policy(Integer id, String policyNumber, String firstName, String lastName) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Policy(Policy policy) {
        this.policyNumber = policy.getPolicyNumber();
    }

    /* public Policy(Integer id, String policyNumber, String firstName, String lastName, String dob, String gender, int age, String address, String state, String country, String product) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        Age = age;
        Address = address;
        State = state;
        Country = country;
        Product = product;
    }*/

    @Override
    public String toString() {
        return "Policy{" + "id=" + id + ", policyNumber='" + policyNumber + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' /*+
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", Product='" + Product + '\'' +
                '}'*/;
    }
}