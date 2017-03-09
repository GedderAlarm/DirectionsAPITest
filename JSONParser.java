package com.gedder.gedderalarm.util;

/*
 * USER: mslm, Mike
 * DATE: March 8th, 2017
 * Class to parse the JSON received from Google Maps API.
 */

/**
 * Example usage:
 *
 * public String json = "put json string here";
 * public JSONParser jsonParser = new JSONParser(json);
 * private int duration = jsonParser.duration();
 * private boolean avoidToll = jsonParser.avoidToll();
 * private String origin = jsonParser.origin();
 * private String destination = jsonParser.destination();
 */
public class JSONParser {
    private String json;

    public JSONParser(String json) {
        this.json = json;
    }

    /**
     * Grabs json['routes']['legs']['duration']['value'].
     * return: duration of travel in seconds.
     */
    public int duration() {

    }
}