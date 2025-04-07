package org.theoliverlear.exercise.objects;

public class Student {
    //============================-Variables-=================================
    private boolean isPayingAttention;
    //===========================-Constructors-===============================
    public Student() {
        this.isPayingAttention = false;
    }
    public Student(boolean isPayingAttention) {
        this.isPayingAttention = isPayingAttention;
    }
    //=============================-Getters-==================================
    public boolean isPayingAttention() {
        return this.isPayingAttention;
    }
    //=============================-Setters-==================================
    public void setPayingAttention(boolean isPayingAttention) {
        this.isPayingAttention = isPayingAttention;
    }
}
