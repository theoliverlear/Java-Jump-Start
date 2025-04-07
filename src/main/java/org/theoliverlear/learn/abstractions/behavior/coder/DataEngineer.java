package org.theoliverlear.learn.abstractions.behavior.coder;

public class DataEngineer extends Coder {
    //===========================-Constructors-===============================
    public DataEngineer() {
        super();
    }
    public DataEngineer(String name, int numYearsExperience) {
        super(name, numYearsExperience);
    }
    //--------------------------------Code------------------------------------
    @Override
    public void code() {
        System.out.println(this.name + " is building data pipelines in Python...");
    }
}
