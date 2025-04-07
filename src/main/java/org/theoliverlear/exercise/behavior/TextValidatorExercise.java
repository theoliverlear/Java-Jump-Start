package org.theoliverlear.exercise.behavior;

public class TextValidatorExercise {
    //===============================-Main-===================================
    public static void main(String[] args) {
        //--------------------------Task-One----------------------------------
        String testOneString = "Hello, World!";
        TextValidator isAllUppercase; // Your lambda expression here.
        // Uncomment the line below to test your lambda expression.
        // boolean taskOneIsValid = isAllUppercase.isValid(testOneString)
        //--------------------------Task-Two----------------------------------
        String testTwoString = "Oh it was a beautiful day. The birds chirped and the sun shone.";
        TextValidator isLongerThanTwentyChars; // Your lambda expression here.
        // Uncomment the line below to test your lambda expression.
        // boolean taskTwoIsValid = isLongerThanTwentyChars.isValid(testTwoString)
        //-------------------------Task-Three---------------------------------
        String testThreeString = "Password123456!";
        // Valid password has a minimum of 1 capital letter, 1 number, and 1 special character.
        TextValidator isValidPassword; // Your lambda expression here.
        // Uncomment the line below to test your lambda expression.
        // boolean taskThreeIsValid = isValidPassword.isValid(testThreeString)
        //-------------------------Task-Four----------------------------------
        // Uncomment the line below to display your test results.
        // List<Boolean> testResults = List.of(taskOneIsValid, taskTwoIsValid, taskThreeIsValid);
        // Print your test results using streams.
    }
}
