package com.tts.hr;

import java.text.NumberFormat;

public class Salaried extends Employee {

    /* defining default salary */
    public static final double DEFAULT_SALARY = 104000.0;
    private double salary;


    public Salaried(String name){
        this(name, DEFAULT_SALARY);
    }

    /* default constructor that invokes the super class constructor */
    public Salaried(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* override inherited method from parent */
    @Override
    public double computePay() {
        return salary / 26.0;
    }

    @Override
    public String toString(){
        return super.toString() + ", salary = " +
                NumberFormat.getCurrencyInstance().format(salary);
    }
}
