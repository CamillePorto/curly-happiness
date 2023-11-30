package com.codedotorg;

import java.util.Random;

public class AppLogic {

    /** The pin to unlock the app */
    private String pin;

    /** The pin the user has provided */
    private String user;


    /**
     * Constructor for the AppLogic class.
     * Initializes the pin with a random value and user with an empty string.
     */
    public AppLogic() {
        pin = createRandomPin();
        user = "";
    }

    /**
     * Creates a user PIN based on the predicted class.
     * @param predictedClass the predicted class from the machine learning model
     * @return the user PIN as a string
     */
    public String createUserPin(String predictedClass) {
        user += predictedClass;
        return "";
    }

    /**
     * Checks if the user's PIN is equal to the real PIN.
     * @return true if the user's PIN is equal to the real PIN, false otherwise.
     */
    public boolean checkPin() {
        return user.equals(pin);
    }

    /**
     * Checks if the length of the user's PIN is equal to 4.
     * @return true if the length of the user's PIN is equal to 4, false otherwise.
     */
    public boolean checkPinLength() {
        return user.length() == 4;
    }

    /**
     * Returns the status of the user's input PIN.
     * @param userPin the PIN entered by the user
     * @return a string indicating whether the PIN is correct or not
     */
    public String getPinStatus(String userPin) {
        if (userPin.length() != 4) {
            return "Length error";
        } else if (!userPin.equals(pin)) {
            return "Invalid";
        } else {
            return "Valid";
        }
    }
    
    /**
     * Resets the logic of the application by generating
     * a new random PIN and clearing the user field.
     */
    public void resetLogic() {
        pin = createRandomPin();
        user = "";
    }

    /**
     * Generates a random 4-digit PIN number.
     * @return the generated PIN number as a string.
     */
    private String createRandomPin() {
        Random random = new Random();
        int pin = random.nextInt(9000) + 1000; // This will generate a random 4-digit number.
        return String.valueOf(pin);
    }

}
