package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * TravelPackage Class Overview
 * Represents a complete travel package encompassing a set of destinations and a list of passengers.
 * Offers functionality to manage these destinations and passengers, alongside providing itinerary details and passenger listing.
 * Note: Well-documented code improves ease of understanding and maintenance.
 */
public class TravelPackage {
    private String name; // Name assigned to this travel package.
    private int passengerCapacity; // Maximum limit of passengers allowed in this package.
    private List<Destination> itinerary; // Collection of destinations that form this travel package's journey.
    private List<Passenger> passengers; // Roster of passengers registered for this travel package.

    /**
     * Constructs a new TravelPackage instance.
     *
     * @param name The designated name for the travel package.
     * @param passengerCapacity The upper limit for passenger enrolment in this package.
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    /**
     * Enlists a passenger in the travel package.
     *
     * @param passenger The passenger to be added.
     * @throws IllegalStateException if the package has reached its capacity limit.
     */
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            throw new IllegalStateException("Travel package capacity reached");
        }
    }

    /**
     * Displays the itinerary details of the package, covering all destinations and their respective activities.
     */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getDestinationName());
            for (Activity activity : destination.getActivities()) {
                System.out.println(" - Activity: " + activity.getActivityName() + ", Cost: " + String.format("%.1f", activity.getEnrollmentCost()) + ", Capacity: " + activity.getMaxParticipants() + ", Description: " + activity.getActivityDescription());
            }
        }
    }

    /**
     * Outputs the list of all passengers registered in the package.
     */
    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Enrolled Passenger Count: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println(" - Name: " + passenger.getTravelerName() + ", ID: " + passenger.getTravelerId());
        }
    }

    /**
     * Appends a new destination to the package's travel itinerary.
     *
     * @param destination The destination to be included.
     */
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    // Accessor and Mutator methods for package properties

    /**
     * Retrieves the travel package's name.
     *
     * @return Name of the package.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the maximum allowed passenger count for the package.
     *
     * @return Passenger capacity of the package.
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Provides a safe copy of the package's itinerary (destinations).
     *
     * @return A copied list of destinations.
     */
    public List<Destination> getItinerary() {
        return new ArrayList<>(itinerary);
    }

    /**
     * Provides a safe copy of the list of registered passengers.
     *
     * @return A copied list of passengers.
     */
    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

}

