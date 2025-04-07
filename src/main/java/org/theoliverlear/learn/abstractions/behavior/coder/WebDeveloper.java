package org.theoliverlear.learn.abstractions.behavior.coder;

public class WebDeveloper extends Coder {
    //===========================-Constructors-===============================
    public WebDeveloper() {
        super();
    }
    public WebDeveloper(String name, int numYearsExperience) {
        super(name, numYearsExperience);
    }
    //--------------------------------Code------------------------------------
    @Override
    public void code() {
        System.out.println(this.name +  " is coding a web application...");
    }
}
