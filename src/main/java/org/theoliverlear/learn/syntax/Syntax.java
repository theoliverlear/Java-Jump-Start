package org.theoliverlear.learn.syntax;

import org.theoliverlear.learn.abstractions.object.bird.Parrot;

public class Syntax {
    //===============================-Main-===================================
    public static void main(String[] args) {
        //--------------------Primitive-Data-Types----------------------------
        int intName = 0;
        double doubleName = 0.0;
        boolean booleanName = true;
        char charName = 'A';
        //-----------------------Dynamic-Typing-------------------------------
        var dynamicVar = 10;
        //---------------------Object-Data-Types------------------------------
        String stringName = "Hello world!";
        Parrot parrot = new Parrot();
        parrot.chirp();
    }
}
