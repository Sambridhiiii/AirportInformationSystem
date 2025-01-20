/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airport.controller.algorithms;

import com.airport.model.SkylinkerModel;
import java.util.ArrayList;

/**
 *
 * @author Sambridhi Shrestha 
 * LMU ID: 23048681
 */
public class BinarySearch {

    /**
     * Performs a binary search to find a flight by its flight number.
     *
     * @param flightNumber the flight number to search for
     * @param schedule the sorted list of SkylinkerModel objects to search
     * @param low the starting index of the range to search
     * @param high the ending index of the range to search
     * @return the SkylinkerModel object if found, otherwise null
     */
    public SkylinkerModel searchByFlightNo(int flightNumber, ArrayList<SkylinkerModel> schedule, int low, int high) {
        // Base case: if the range is invalid, return null
        if (high < low) {
            return null;
        }

        // Calculate the mid index
        int mid = low + (high - low) / 2; // Prevents overflow in large arrays

        // Compare the search value with the flight number at the mid index
        if (schedule.get(mid).getFlightNo() == flightNumber) {
            return schedule.get(mid); // Found the matching flight
        } else if (flightNumber < schedule.get(mid).getFlightNo()) {
            // Search in the left half
            return searchByFlightNo(flightNumber, schedule, low, mid - 1);
        } else {
            // Search in the right half
            return searchByFlightNo(flightNumber, schedule, mid + 1, high);
        }
    }
}
