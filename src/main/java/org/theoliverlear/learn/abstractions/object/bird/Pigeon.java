package org.theoliverlear.learn.abstractions.object.bird;

import org.theoliverlear.learn.abstractions.behavior.Chirper;

public class Pigeon extends Bird implements Chirper {
    //===========================-Constructors-===============================
    public Pigeon() {
        super();
    }
    public Pigeon(int wingspan, int weight, String color) {
        super(wingspan, weight, color);
    }
    //-------------------------------Chirp------------------------------------
    @Override
    public void chirp() {
        System.out.println("Lrrrrrr...Lrrrrrr...");
    }
}