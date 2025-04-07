package org.theoliverlear.learn.abstractions.behavior.coder;

public abstract class Coder {
    //============================-Variables-=================================
    protected String name;
    protected int numYearsExperience;
    //===========================-Constructors-===============================
    public Coder() {
        this.name = "";
        this.numYearsExperience = 0;
    }
    public Coder(String name, int numYearsExperience) {
        this.name = name;
        this.numYearsExperience = numYearsExperience;
    }
    //--------------------------------Code------------------------------------
    public abstract void code();
    //===============================-Main-===================================
    public static void main(String[] args) {
        Coder oliver = new WebDeveloper("Oliver", 3);
        Coder colton = new DataEngineer("Colton", 5);
        oliver.code();
        colton.code();
    }
}
