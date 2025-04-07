package org.theoliverlear.learn.abstractions.object.bird;

import org.theoliverlear.learn.abstractions.behavior.Chirper;

public class Parrot extends Bird implements Chirper {
    //===========================-Constructors-===============================
    public Parrot() {
        super();
    }
    public Parrot(int wingspan, int weight, String color) {
        super(wingspan, weight, color);
    }
    //-------------------------------Chirp------------------------------------
    @Override
    public void chirp() {
        System.out.println("Polly want a cracker!");
    }
}
