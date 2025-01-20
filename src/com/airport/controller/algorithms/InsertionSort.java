/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airport.controller.algorithms;

import com.airport.model.SkylinkerModel;
import java.util.ArrayList;

/**
 * Author: SambridhiShrestha 
 * LMU ID: 23048681
 */
public class InsertionSort {

    /**
     *
     * @param unsortedData the list of SkylinkerModel objects to be sorted
     * @param isAsc boolean indicating the sorting order: true for ascending,
     * false for descending
     * @return a sorted ArrayList of SkylinkerModel objects by OperationDay
     */
    public ArrayList<SkylinkerModel> sortByOperationDay(ArrayList<SkylinkerModel> unsortedData, boolean isAsc) {
        ArrayList<SkylinkerModel> Sort = new ArrayList<>(unsortedData);

        // Insertion sort algorithm for sorting by OperationDay (string field)
        for (int i = 1; i < Sort.size(); i++) {
            SkylinkerModel current = Sort.get(i); // Current element to insert
            int j = i - 1;

            // Compare OperationDay values and shift elements if needed
            while (j >= 0 && ((isAsc && current.getOperationDay().compareTo(Sort.get(j).getOperationDay()) < 0)
                    || (!isAsc && current.getOperationDay().compareTo(Sort.get(j).getOperationDay()) > 0))) {
                Sort.set(j + 1, Sort.get(j)); // Shift element to the right
                j--;
            }
            // Insert the current element in its correct position
            Sort.set(j + 1, current);
        }
        return Sort; // Return the sorted list
    }

    /**
     * @param unsortedData the list of SkylinkerModel objects to be sorted
     * @return a sorted ArrayList of SkylinkerModel objects by OperationDay in
     * descending order
     */
    public ArrayList<SkylinkerModel> sortByOperationDay1(ArrayList<SkylinkerModel> unsortedData) {
        ArrayList<SkylinkerModel> Sort = new ArrayList<>(unsortedData);

        // Insertion sort algorithm for sorting in descending order
        for (int i = 1; i < Sort.size(); i++) {
            SkylinkerModel current = Sort.get(i); // Current element to insert
            int j = i - 1;

            // Compares OperationDay values and shift elements if needed for descending order
            while (j >= 0 && current.getOperationDay().compareTo(Sort.get(j).getOperationDay()) > 0) {
                Sort.set(j + 1, Sort.get(j)); // Shift element to the right
                j--;
            }
            // Insert the current element in its correct position
            Sort.set(j + 1, current);
        }

        return Sort; // Return the sorted list
    }
}
