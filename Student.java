package com.exemple.entity;

import java.util.Scanner;


public class Student {
    private int id;
    private String firstNane;
    private String lastName;
    private double nark;
    public Student() {

    }
    public Student (int id, String firstNane, String lastName, double nark) {
        this.id =id;
        this.firstNane = firstNane;
        this.lastName = lastName;
        this.nark =nark;
    }
    public void scanInfo() {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter ID: ");
        this.id =scanner.nextInt();
        System.out.println("Enter first nane: ");
        this.firstNane =scanner.nextLine();
        System.out.println("Enter last nane: ");
        this.lastName= scanner.nextLine();
        System.out.println("Enter nark: ");
        this.nark = scanner.nextDouble();

    }

    public void printInfo() {
        System.out.printf("%3d|%10s%10s |%5f\n", getId(), getFirstName(), getLastNane(), getMark());
    }
    public String getFirstName() {
        return firstNane;}
    public String getLastNane() {
        return getLastNane();}
    public int getId() {
        return id;}
    public double getMark() {
        return getMark();
    }
}