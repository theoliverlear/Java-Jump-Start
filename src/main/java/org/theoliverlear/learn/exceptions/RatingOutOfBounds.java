package org.theoliverlear.learn.exceptions;

public class RatingOutOfBounds extends Exception {
    //============================-Variables-=================================
    final static String MESSAGE = "Rating must be between 1 and 5";
    //===========================-Constructors-===============================
    public RatingOutOfBounds() {
        super(MESSAGE);
    }
}
