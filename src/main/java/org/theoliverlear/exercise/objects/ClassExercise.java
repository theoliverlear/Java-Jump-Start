package org.theoliverlear.exercise.objects;

import java.util.ArrayList;
import java.util.List;

public class ClassExercise {
    //============================-Variables-=================================
    String className;
    List<Student> students;
    //===========================-Constructors-===============================
    public ClassExercise() {
        this.className = "";
        this.students = new ArrayList<>();
    }
    public ClassExercise(String className, List<Student> students) {
        this.className = className;
        this.students = students;
    }
    //-------------------------Command-Attention------------------------------
    public void commandAttention() {
        // Your code here.
    }
    //------------------------Has-Class-Attention-----------------------------
    public boolean hasClassAttention() {
        // Your code here.
        return false;
    }
    //-------------------------Commanding-Scream------------------------------
    public void commandingScream() {
        System.out.println("Listen to me! As the teacher of " + this.className + ", I demand your attention!");
    }
}