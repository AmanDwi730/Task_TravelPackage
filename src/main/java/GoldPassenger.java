package main.java;

public class GoldPassenger extends StandardPassenger {

    public GoldPassenger(String travelerName, int travelerId, double balance) {
        super(travelerName, travelerId, balance);
    }

    @Override
    public boolean signUpForActivity(Activity activity) {
        double discountedCost = activity.getEnrollmentCost() * 0.9; // 10% discount
        if (getBalance() >= discountedCost && activity.enrollPassenger(this)) {
            setBalance(getBalance() - discountedCost);
            return true; // Enrollment successful
        }
        return false; // Enrollment failed
    }

    @Override
    public void printDetails() {
        System.out.println("Gold Passenger: " + getTravelerName() + ", ID: " + getTravelerId());
        System.out.println("Balance: " + getBalance());
        // Print enrolled activities (inherited from StandardPassenger)
    }
}
