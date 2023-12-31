package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a travel destination with various activities.
 * Manages a collection of activities and provides information about them.
 */
public class Destination {
    private String destinationName; // The unique name of the destination.
    private List<Activity> availableActivities; // Activities available at this destination.

    /**
     * Initializes a new Destination with a name.
     *
     * @param destinationName The name of the destination.
     */
    public Destination(String destinationName) {
        this.destinationName = destinationName;
        this.availableActivities = new ArrayList<>();
    }

    /**
     * Adds a new activity to the destination.
     *
     * @param activity The activity to be added.
     */
    public void addActivity(Activity activity) {
        availableActivities.add(activity);
    }

    /**
     * Retrieves a list of activities that still have available spots.
     *
     * @return A list of activities with available capacity.
     */
    public List<Activity> getAvailableActivities() {
        List<Activity> activitiesWithSpace = new ArrayList<>();
        for (Activity activity : availableActivities) {
            if (activity.getCurrentEnrollment() < activity.getMaxParticipants()) {
                activitiesWithSpace.add(activity);
            }
        }
        return activitiesWithSpace;
    }

    // Accessor and Mutator methods for private fields.

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public List<Activity> getActivities() {
        return Collections.unmodifiableList(new ArrayList<>(availableActivities));
    }
}
