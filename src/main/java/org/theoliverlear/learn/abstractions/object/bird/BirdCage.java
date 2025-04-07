package org.theoliverlear.learn.abstractions.object.bird;

import org.theoliverlear.learn.abstractions.behavior.Chirper;

public class BirdCage {
    //============================-Variables-=================================
    static Chirper instigatorBird;
    static Chirper victimBird;
    //-----------------------Get-Bird-Battle-Chirps---------------------------
    public static int getNumBirdBattleChirps() {
        return (int) Math.max(Math.random() * 10, 5);
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        //----------------Same-Method-Different-Chirp-------------------------
        instigatorBird = new Parrot();
        victimBird = new Pigeon();
        int numChirps = getNumBirdBattleChirps();
        for (int i = 0; i < numChirps; i++) {
            instigatorBird.chirp();
            victimBird.chirp();
        }
    }
}
