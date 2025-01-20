/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airport.util;

import java.util.regex.Pattern;

/**
 *
 * @author Sambridhi Shrestha
 * LMU: 23048681
 */
public class ValidationUtil {

    /**
     * Validates if a string is null or empty.
     *
     * @param value
     * @ value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    private static final Pattern FLIGHTNO_PATTERN = Pattern.compile("^\\d+$"); // FlightNo must contain only numbers
    private static final Pattern SECTOR_PATTERN = Pattern.compile("^[a-zA-Z-]+$"); // Sector must contain only letters
    private static final Pattern OPERATIONDAY_PATTERN = Pattern.compile("^[a-zA-z]{1,10}$"); // OperationDay: only letters, max
    private static final Pattern TIME_PATTERN = Pattern.compile("^([1-9]|1[0-2]):[0-5]\\d ? (AM| PM) $", Pattern.CASE_INSENSITIVE);

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     *
     *
     * @param FlightNo validate product name
     * @return true if valid, otherwise false
     */
    public static boolean validateFlightNo(String FlightNo) {
        return !isNullOrEmpty(FlightNo) && FLIGHTNO_PATTERN.matcher(FlightNo).matches();
    }

    /**
     * .
     *
     * @param Sector validate places
     * @return true if valid, otherwise false
     */
    public static boolean validateSector(String Sector) {
        return !isNullOrEmpty(Sector) && SECTOR_PATTERN.matcher(Sector).matches();
    }

    /**
     *
     *
     * @param Departure
     * @return true if valid, otherwise false
     */
    public static boolean validateDeparture(String Departure) {
        return !isNullOrEmpty(Departure) && TIME_PATTERN.matcher(Departure).matches();
    }

    /**
     * .
     *
     * @param Arival validate arrival time
     * @return true if valid, otherwise false
     */
    public static boolean validateArival(String Arival) {
        return !isNullOrEmpty(Arival) && TIME_PATTERN.matcher(Arival).matches();
    }

    /**
     *
     *
     * @param OperationDay validate DAYS
     * @return true if valid, otherwise false
     */
    public static boolean validateOperationDay(String OperationDay) {
        return !isNullOrEmpty(OperationDay) && OPERATIONDAY_PATTERN.matcher(OperationDay).matches();
    }
}
