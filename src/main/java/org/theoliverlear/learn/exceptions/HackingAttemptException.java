package org.theoliverlear.learn.exceptions;

public class HackingAttemptException extends RuntimeException {
    //============================-Variables-=================================
    static final String MESSAGE = "Hacking attempt detected! Stopping immediately!";
    //===========================-Constructors-===============================
    public HackingAttemptException() {
        super(MESSAGE);
    }
}
