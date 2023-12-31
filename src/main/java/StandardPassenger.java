package main.java;

import java.util.ArrayList;
import java.util.List;

public class StandardPassenger extends Passenger {
    private double balance;
    private List<Activity> enrolledActivities;

    public StandardPassenger(String travelerName, int travelerId, double balance) {
        super(travelerName, travelerId);
        this.balance = balance;
        this.enrolledActivities = new ArrayList<>();
    }

    @Override
    public boolean signUpForActivity(Activity activity) {
        if (balance >= activity.getEnrollmentCost() && activity.enrollPassenger(this)) {
            balance -= activity.getEnrollmentCost();
            enrolledActivities.add(activity);
            return true;
        }
        return false;
    }

    @Override
    public void printDetails() {
        System.out.println("Standard Passenger: " + getTravelerName() + ", ID: " + getTravelerId());
        System.out.println("Balance: " + balance);
        System.out.println("Enrolled Activities:");
        for (Activity activity : enrolledActivities) {
            System.out.println("- " + activity.getActivityName() + ", Cost: " + activity.getEnrollmentCost());
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
