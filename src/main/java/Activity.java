package main.java;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents an activity available in a travel package.
 * Handles tracking of participant enrollment and activity details.
 */
public class Activity {
    private String activityName;
    private String activityDescription;
    private double enrollmentCost;
    private int maxParticipants;
    private Set<Passenger> participants;

    public Activity(String activityName, String activityDescription, double enrollmentCost, int maxParticipants) {
        this.activityName = activityName;
        this.activityDescription = activityDescription;
        this.enrollmentCost = enrollmentCost;
        this.maxParticipants = maxParticipants;
        this.participants = new HashSet<>();
    }

    /**
     * Registers a passenger for the activity if space is available.
     *
     * @param passenger The passenger to be enrolled.
     * @return boolean indicating successful enrollment.
     */
    public boolean enrollPassenger(Passenger passenger) {
        if (participants.size() < maxParticipants && !participants.contains(passenger)) {
            participants.add(passenger);
            return true;
        }
        return false;
    }

    // Accessor and Mutator methods for private fields.

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public double getEnrollmentCost() {
        return enrollmentCost;
    }

    public void setEnrollmentCost(double enrollmentCost) {
        this.enrollmentCost = enrollmentCost;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public int getCurrentEnrollment() {
        return participants.size();
    }
}
