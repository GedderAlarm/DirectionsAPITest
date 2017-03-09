package com.gedder.gedderalarm.util;

/*
 * USER: mslm, Mike
 * DATE: March 8th, 2017
 * Class to parse the JSON received from Google Maps API.
 */

import java.util.ArrayList;


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
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'duration' keys.
        //       This must deal with that eventually.

    }

    /**
     * Grabs json['routes']['legs']['distance']['value'].
     * return: distance of travel in meters.
     */
    public int distance() {
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'distance' keys.
        //       This must deal with that eventually.

    }

    /**
     * Grabs json['routes']['warnings'] elements and puts them
     * in a ArrayList of Strings.
     * return: an ArrayList<String> object containing all warnings.
     */
    public ArrayList<String> warnings() {
        // TODO: Implement.
        // NOTE: Warnings will differ between routes. We need to
        //       find a way to create our interface such that it'll
        //       accomodate multiple routes.
        
    }


}