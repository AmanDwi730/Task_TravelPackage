package main.java;

import java.util.ArrayList;
import java.util.List;

public class PremiumPassenger extends Passenger {
    private List<Activity> enrolledActivities;

    public PremiumPassenger(String travelerName, int travelerId) {
        super(travelerName, travelerId);
        this.enrolledActivities = new ArrayList<>();
    }

    @Override
    public boolean signUpForActivity(Activity activity) {
        if (activity.enrollPassenger(this)) {
            enrolledActivities.add(activity);
            return true; // Enrollment successful
        }
        return false; // Enrollment failed
    }

    @Override
    public void printDetails() {
        System.out.println("Premium Passenger: " + getTravelerName() + ", ID: " + getTravelerId());
        System.out.println("Enrolled Activities:");
        for (Activity activity : enrolledActivities) {
            System.out.println("- " + activity.getActivityName());
        }
    }
}
