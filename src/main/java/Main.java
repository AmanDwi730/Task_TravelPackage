package main.java;

public class Main {
    public static void main(String[] args) {
        // Tour 1: Asia Tour
        TravelPackage asiaTour = new TravelPackage("Asia Tour", 30);
        setupAsiaTour(asiaTour);

        // Tour 2: Australia Tour
        TravelPackage australiaTour = new TravelPackage("Australia Tour", 25);
        setupAustraliaTour(australiaTour);

        // Tour 3: UAE Tour
        TravelPackage uaeTour = new TravelPackage("UAE Tour", 20);
        setupUAETour(uaeTour);

        // Tour 4: USA Tour
        TravelPackage usaTour = new TravelPackage("USA Tour", 15);
        setupUSATour(usaTour);

        // Print details of each tour
        printTourDetails(asiaTour);
        printTourDetails(australiaTour);
        printTourDetails(uaeTour);
        printTourDetails(usaTour);
    }

    private static void setupAsiaTour(TravelPackage asiaTour) {
        Destination philippians = new Destination("Philippines");
        Destination delhi = new Destination("Delhi");
        Destination indonesia = new Destination("Indonesia");
        asiaTour.addDestination(philippians);
        asiaTour.addDestination(delhi);
        asiaTour.addDestination(indonesia);

        // Activities for Philippians
        Activity beachHopping = new Activity("Beach Hopping", "Explore beautiful beaches", 50.0, 20);
        philippians.addActivity(beachHopping);

        // Activities for Delhi
        Activity tajMahalVisit = new Activity("Laal Kila", "Tour the iconic Laal Kila", 60.0, 15);
        delhi.addActivity(tajMahalVisit);

        // Activities for Indonesia
        Activity baliTour = new Activity("Bali Tour", "Experience the cultural heritage of Bali", 70.0, 20);
        indonesia.addActivity(baliTour);

        // Add passengers
        StandardPassenger alice = new StandardPassenger("Alice", 101, 200.0);
        GoldPassenger bob = new GoldPassenger("Bob", 102, 300.0);
        PremiumPassenger charlie = new PremiumPassenger("Charlie", 103);

        // Adding passengers to the Asia Tour
        asiaTour.addPassenger(alice);
        asiaTour.addPassenger(bob);
        asiaTour.addPassenger(charlie);

        // Passengers signing up for activities
        alice.signUpForActivity(tajMahalVisit);
        bob.signUpForActivity(beachHopping);
        charlie.signUpForActivity(baliTour);

    }

    private static void setupAustraliaTour(TravelPackage australiaTour) {
        Destination newSouthWales = new Destination("New South Wales");
        Destination queensland = new Destination("Queensland");
        Destination southAustralia = new Destination("South Australia");
        australiaTour.addDestination(newSouthWales);
        australiaTour.addDestination(queensland);
        australiaTour.addDestination(southAustralia);

        // Activities for New South Wales
        Activity sydneyOperaHouseTour = new Activity("Sydney Opera House Tour", "Visit the famous Opera House", 40.0, 25);
        newSouthWales.addActivity(sydneyOperaHouseTour);

        // Activities for Queensland
        Activity greatBarrierReef = new Activity("Great Barrier Reef Diving", "Scuba diving in the Great Barrier Reef", 120.0, 10);
        queensland.addActivity(greatBarrierReef);

        // Activities for South Australia
        Activity wineTasting = new Activity("Wine Tasting", "Taste fine wines in Barossa Valley", 30.0, 20);
        southAustralia.addActivity(wineTasting);

        // Add passengers
        StandardPassenger david = new StandardPassenger("David", 201, 250.0);
        GoldPassenger emma = new GoldPassenger("Emma", 202, 350.0);
        PremiumPassenger frank = new PremiumPassenger("Frank", 203);

        // Adding passengers to the Australia Tour
        australiaTour.addPassenger(david);
        australiaTour.addPassenger(emma);
        australiaTour.addPassenger(frank);

        // Passengers signing up for activities
        david.signUpForActivity(sydneyOperaHouseTour);
        emma.signUpForActivity(greatBarrierReef);
        frank.signUpForActivity(wineTasting);
    }

    private static void setupUAETour(TravelPackage uaeTour) {
        Destination dubai = new Destination("Dubai");
        Destination abuDhabi = new Destination("Abu Dhabi");
        Destination sharjah = new Destination("Sharjah");
        uaeTour.addDestination(dubai);
        uaeTour.addDestination(abuDhabi);
        uaeTour.addDestination(sharjah);

        // Activities for Dubai
        Activity desertSafari = new Activity("Desert Safari", "Adventure in the Arabian desert", 80.0, 15);
        dubai.addActivity(desertSafari);

        // Activities for Abu Dhabi
        Activity louvreAbuDhabiTour = new Activity("Louvre Abu Dhabi Tour", "Explore the Louvre Museum", 55.0, 20);
        abuDhabi.addActivity(louvreAbuDhabiTour);

        // Activities for Sharjah
        Activity sharjahMuseumTour = new Activity("Sharjah Museum Tour", "Discover the history of Sharjah", 35.0, 25);
        sharjah.addActivity(sharjahMuseumTour);


        // Add passengers
        StandardPassenger george = new StandardPassenger("George", 301, 500.0);
        GoldPassenger hannah = new GoldPassenger("Hannah", 302, 600.0);
        PremiumPassenger isabella = new PremiumPassenger("Isabella", 303);

        // Adding passengers to the UAE Tour
        uaeTour.addPassenger(george);
        uaeTour.addPassenger(hannah);
        uaeTour.addPassenger(isabella);

        // Passengers signing up for activities
        george.signUpForActivity(desertSafari);
        hannah.signUpForActivity(louvreAbuDhabiTour);
        isabella.signUpForActivity(sharjahMuseumTour);

    }

    private static void setupUSATour(TravelPackage usaTour) {
        Destination newYork = new Destination("New York");
        Destination losAngeles = new Destination("Los Angeles");
        Destination lasVegas = new Destination("Las Vegas");

        usaTour.addDestination(newYork);
        usaTour.addDestination(losAngeles);
        usaTour.addDestination(lasVegas);

        // Activities for New York
        Activity centralParkVisit = new Activity("Central Park Visit", "Explore the famous Central Park", 45.0, 25);
        newYork.addActivity(centralParkVisit);

        // Activities for Los Angeles
        Activity hollywoodTour = new Activity("Hollywood Tour", "Visit the iconic Hollywood attractions", 55.0, 20);
        losAngeles.addActivity(hollywoodTour);

        // Activities for Las Vegas
        Activity casinoNight = new Activity("Casino Night", "Experience the excitement of Las Vegas casinos", 75.0, 30);
        lasVegas.addActivity(casinoNight);

        // Add passengers
        StandardPassenger david = new StandardPassenger("David", 201, 220.0);
        GoldPassenger emily = new GoldPassenger("Emily", 202, 320.0);
        PremiumPassenger frank = new PremiumPassenger("Frank", 203);

        // Adding passengers to the USA Tour
        usaTour.addPassenger(david);
        usaTour.addPassenger(emily);
        usaTour.addPassenger(frank);

        // Passengers signing up for activities
        david.signUpForActivity(hollywoodTour);
        emily.signUpForActivity(centralParkVisit);
        frank.signUpForActivity(casinoNight);
    }


    private static void printTourDetails(TravelPackage tour) {
        tour.printItinerary();
        tour.printPassengerList();
        for (Passenger passenger : tour.getPassengers()) {
            passenger.printDetails();
        }
    }
}

// Additional classes like TravelPackage, Destination, Activity, Passenger, etc.
// are assumed to be defined elsewhere.
