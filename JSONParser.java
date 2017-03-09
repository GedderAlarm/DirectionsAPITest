package com.gedder.gedderalarm.util;

/*
 * USER: mslm, Mike
 * DATE: March 8th, 2017
 * Class to parse the JSON received from Google Maps API.
 */

import java.util.ArrayList;

import com.gedder.gedderalarm.util.JSONStatus;


/**
 * Example usage:
 *
 * public String json = "put json string here";
 * public JSONParser jsonParser = new JSONParser(json);
 * private int duration = jsonParser.duration();
 * private String origin = jsonParser.origin();
 * private String destination = jsonParser.destination();
 * private String route2_origin = jsonParser.origin(2);
 * private String route2_destination = jsonParser.destination(2);
 */
public class JSONParser {
    // For mslm:
    // TODO: Add origin() and destination() functionality.
    // TODO: Add originLatitude() and destinationLatitude() functionality.
    // TODO: Add originLongitude() and destinationLongitude() functionality.
    // TODO: Add choose-your-step functionality for everything that is in the `steps` key.
    // TODO: Add travelMode() functionality for individual steps.

    private String json;

    public JSONParser(String json) {
        this.json = json;
    }

    /**
     * Grabs json['routes'][0]['legs'][0]['duration']['value'].
     *
     * return: duration of travel in seconds.
     */
    public int duration() {
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'duration' keys.
        //       This must deal with that eventually.

    }

    /**
     * Grabs json['routes'][route-1]['legs'][0]['duration']['value'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * return: duration of travel in seconds.
     */
    public int duration(int route) {
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'duration' keys.
        //       This must deal with that eventually.
        
        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['routes'][route-1]['legs'][leg-1]['duration']['value'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * param[1]: which leg, if multiple. Starts from 1.
     * return: duration of travel in seconds.
     */
    public int duration(int route, int leg) {
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'duration' keys.
        //       This must deal with that eventually.
        
        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;
        leg -= 1;

    }

    /**
     * Grabs json['routes'][0]['legs'][0]['distance']['value'].
     *
     * return: distance of travel in meters.
     */
    public int distance() {
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'distance' keys.
        //       This must deal with that eventually.

    }

    /**
     * Grabs json['routes'][route-1]['legs'][0]['distance']['value'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * return: distance of travel in meters.
     */
    public int distance(int route) {
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'distance' keys.
        //       This must deal with that eventually.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['routes'][route-1]['legs'][leg-1]['distance']['value'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * param[1]: which leg, if multiple. Starts from 1.
     * return: distance of travel in meters.
     */
    public int distance(int route, int leg) {
        // TODO: Implement.
        // NOTE: If the route contains waypoints, there will be
        //       multiple 'legs' and thus multiple 'distance' keys.
        //       This must deal with that eventually.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;
        leg -= 1;

    }

    /**
     * Grabs json['routes'][0]['warnings'] elements and puts them
     * in a ArrayList of Strings.
     *
     * return: an ArrayList<String> object containing all warnings.
     */
    public ArrayList<String> warnings() {
        // TODO: Implement.

    }

    /**
     * Grabs json['routes'][route-1]['warnings'] elements and puts them
     * in a ArrayList of Strings.
     *
     * param[0]: which route, if multiple. Starts from 1.
     * return: an ArrayList<String> object containing all warnings.
     */
    public ArrayList<String> warnings(int route) {
        // TODO: Implement.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['routes'][0]['copyrights'].
     *
     * return: a String containing the copyright information.
     */
    public String copyrights() {
        // TODO: Implement.

    }

    /**
     * Grabs json['routes'][route-1]['copyrights'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * return: a String containing the copyright information.
     */
    public String copyrights(int route) {
        // TODO: Implement.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['routes'][0]['summary'].
     *
     * return: a String containing summary information for the route.
     */
    public String summary() {
        // TODO: Implement.

    }

    /**
     * Grabs json['routes'][route-1]['summary'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * return: a String containing summary information for the route.
     */
    public String summary(int route) {
        // TODO: Implement.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['routes'][0]['fare']['currency'].
     *
     * return: the ISO 4217 currency code that the fare is expressed in.
     */
    public String fareCurrency() {
        // TODO: Implement.

    }

    /**
     * Grabs json['routes'][route-1]['fare']['currency'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * return: the ISO 4217 currency code that the fare is expressed in.
     */
    public String fareCurrency(int route) {
        // TODO: Implement.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['routes'][0]['fare']['value'].
     *
     * return: the total fare amount in the currency specified by fareCurrency().
     */
    public int fare() {
        // TODO: Implement.

    }

    /**
     * Grabs json['routes'][route-1]['fare']['value'].
     *
     * param[0]: which route, if multiple. Starts from 1.
     * return: the total fare amount in the currency specified by fareCurrency().
     */
    public int fare(int route) {
        // TODO: Implement.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['status'].
     *
     * return: status number of the request, corresponding to
     *         com.gedder.gedderalarm.util.JSONStatus enumerations.
     */
    public int status() {
        String status;
        int code;

        //
        // TODO: Parse here. Put value into `status`.
        //

        switch (status) {
            case "OK": 
                code = JSONStatus.OK;
                break;
            case "NOT_FOUND":
                code = JSONStatus.NOT_FOUND;
                break;
            case "ZERO_RESULTS":
                code = JSONStatus.ZERO_RESULTS;
                break;
            case "MAX_WAYPOINTS_EXCEEDED":
                code = JSONStatus.MAX_WAYPOINTS_EXCEEDED;
                break;
            case "MAX_ROUTE_LENGTH_EXCEEDED":
                code = JSONStatus.MAX_ROUTE_LENGTH_EXCEEDED;
                break;
            case "INVALID_REQUEST":
                code = JSONStatus.INVALID_REQUEST;
                break;
            case "OVER_QUERY_LIMIT":
                code = JSONStatus.OVER_QUERY_LIMIT;
                break;
            case "REQUEST_DENIED":
                code = JSONStatus.REQUEST_DENIED;
                break;
            default:
                code = JSONStatus.UNKNOWN_ERROR;
                break;
        }

        //
        // Need to do more processing? Do it here.
        //

        return code;
    }

    /**
     * Grabs json['error_message'].
     *
     * note: only exists if json['status'] != "OK".
     * return: error message string.
     */
    public String errorMessage() {
        // TODO: Implement.

    }

    /**
     * Grabs json['available_travel_modes'].
     *
     * note: only exists if a request specifies a travel mode and gets
     *       no results.
     * return: an ArrayList<String> object containing all available
     *         travel modes.
     */
    public ArrayList<String> availableTravelModes() {
        // TODO: Implement.

    }

    /**
     * Grabs json['routes'][0]['legs'][0]['duration_in_traffic']['value'].
     *
     * note: only exists if the request specified a traffic model.
     * return: duration in traffic in seconds.
     */
    public int durationInTraffic() {
        // TODO: Implement.
    }

    /**
     * Grabs json['routes'][route-1]['legs'][0]['duration_in_traffic']['value'].
     *
     * note: only exists if the request specified a traffic model.
     * param[0]: which route, if multiple. Starts from 1.
     * return: duration in traffic in seconds.
     */
    public int durationInTraffic(int route) {
        // TODO: Implement.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;

    }

    /**
     * Grabs json['routes'][route-1]['legs'][leg-1]['duration_in_traffic']['value'].
     *
     * note: only exists if the request specified a traffic model.
     * param[0]: which route, if multiple. Starts from 1.
     * param[1]: which leg, if multiple. Starts from 1.
     * return: duration in traffic in seconds.
     */
    public int durationInTraffic(int route, int leg) {
        // TODO: Implement.

        // User expected to enter values starting from 1.
        // We expect to use it starting from 0.
        route -= 1;
        leg -= 1;

    }







}