package main.java;

/**
 * Abstract class representing a traveler.
 * It serves as the base for different types of passengers.
 */
public abstract class Passenger {
    private String travelerName; // The name of the traveler.
    private int travelerId; // Unique identifier for the traveler.

    /**
     * Constructor to initialize a traveler's basic information.
     *
     * @param travelerName The name of the traveler.
     * @param travelerId   Unique identifier for the traveler.
     */
    public Passenger(String travelerName, int travelerId) {
        this.travelerName = travelerName;
        this.travelerId = travelerId;
    }

    /**
     * Abstract method for a traveler to enroll in an activity.
     *
     * @param activity The activity to enroll in.
     * @return true if the enrollment is successful, false otherwise.
     */
    public abstract boolean signUpForActivity(Activity activity);

    /**
     * Abstract method to print the details of the traveler.
     */
    public abstract void printDetails();

    // Accessor and Mutator methods for private fields.

    public String getTravelerName() {
        return travelerName;
    }

    public void setTravelerName(String travelerName) {
        this.travelerName = travelerName;
    }

    public int getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(int travelerId) {
        this.travelerId = travelerId;
    }
}
