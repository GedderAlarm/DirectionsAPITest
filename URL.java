package com.example.mike.jsonparser;

/**
 * Created by Mike on 3/4/2017.
 * class to generate url types
 * Origin, Destination, API Key
 * Arrival Time, Departure Time
 * Travel Mode
 * Avoid Tolls
 */


/**
 * Example usage:
 *
 * public URL url = new URL.URLBuilder("origin", "destination", "apiKey")
 *                      .arrivalTime("arrivalTime")
 *                      .departureTime("departureTime")
 *                      .mode("mode")
 *                      .avoidToll()
 *						.build();
 */
public class URL {
    private final String origin;        // required
    private final String destination;   // required
    private final String apiKey;        // required
    private final String arrivalTime;   // optional?
    private final String departureTime; // optional?
    private final String travelMode;          // optional?
    private final boolean avoidToll;    // optional
    private final String baseUrl = "https://maps.googleapis.com/maps/api/directions/json?";

    private String url = baseUrl;

    private URL(URLBuilder builder) {
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.apiKey = builder.apiKey;
        this.arrivalTime = builder.arrivalTime;
        this.departureTime = builder.departureTime;
        this.travelMode = builder.travelMode;
        this.avoidToll = builder.avoidToll;

        addOrigin(origin);
        addDestination(destination);
        addAPIKey(apiKey);
        addArrivalTime(arrivalTime);
        addDepartureTime(departureTime);
        addTravelMode(travelMode);
        addAvoidToll(avoidToll);
    }

    private void addOrigin(String origin) {
        if (!origin.equals(null))
            this.url += "origin=" + origin;
        else
            ; // TODO: Throw exception; this variable is required.
    }

    private void addDestination(String destination) {
        if (!destination.equals(null))
            this.url += "destination=" + destination;
        else
            ; // TODO: Throw exception; this variable is required.
    }

    private void addAPIKey(String apiKey) {
        if (!apiKey.equals(null))
            this.url += "API_KEY=" + apiKey;
        else
            ; // TODO: Throw exception; this variable is required.
    }

    // TODO: Need to add unix time
    private void addArrivalTime(String arrivalTime) {
        if (!arrivalTime.equals(null))
            this.url += "arrival_time=" + arrivalTime;
    }

    private void addDepartureTime(String departureTime) {
        if (!departureTime.equals(null))
            this.url += "departure_time=" + departureTime;
    }

    private void addTravelMode(String travelMode) {
        if (!travelMode.equals(null))
            this.url += "mode=" + travelMode;
    }

    private void addAvoidToll(boolean avoidToll) {
        if (avoidToll)
            this.url += "avoid=tolls";
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getTravelMode() {
        return travelMode;
    }

    public boolean avoidToll() {
        return avoidToll;
    }

    public static class URLBuilder {
        private final String origin;        // required
        private final String destination;   // required
        private final String apiKey;        // required
        private String arrivalTime;         // optional?
        private String departureTime;       // optional?
        private String travelMode;          // optional?
        private boolean avoidToll;          // optional

        public URLBuilder(String origin, String destination, String apiKey) {
            this.origin = origin;
            this.destination = destination;
            this.apiKey = apiKey;
        }

        public URLBuilder arrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        public URLBuilder departureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public URLBuilder travelMode(String travelMode) {
            this.travelMode = travelMode;
            return this;
        }

        public URLBuilder avoidToll() {
            this.avoidToll = true;
            return this;
        }

        public URL build() {
            return new URL(this);
        }
    }
}