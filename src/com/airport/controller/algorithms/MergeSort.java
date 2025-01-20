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
public class MergeSort {

    /**
     * @param flightList the list of SkylinkerModel objects to sort
     * @param start the starting index of the list to sort
     * @param end the ending index of the list to sort
     */
    public void ExecuteMergeSortFlightNoAscending(ArrayList<SkylinkerModel> flightList, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // Recursively sort the left half
            ExecuteMergeSortFlightNoAscending(flightList, start, mid);
            // Recursively sort the right half
            ExecuteMergeSortFlightNoAscending(flightList, mid + 1, end);
            // Merge the sorted halves
            MergeSortFlightNo(flightList, start, mid, end);
        }
    }

    /**
     *
     * @param flightList the list of SkylinkerModel objects to merge
     * @param start the starting index of the first list
     * @param mid the ending index of the first list
     * @param end the ending index of the second list
     */
    public void MergeSortFlightNo(ArrayList<SkylinkerModel> flightList, int start, int mid, int end) {
        ArrayList<SkylinkerModel> mergedList = new ArrayList<>();
        int a = start, b = mid + 1;

        // Merge the two subarrays
        while (a <= mid && b <= end) {
            if (flightList.get(a).getFlightNo() <= flightList.get(b).getFlightNo()) {
                mergedList.add(flightList.get(a));
                a++;
            } else {
                mergedList.add(flightList.get(b));
                b++;
            }
        }

        // Add remaining elements from the left subarray
        while (a <= mid) {
            mergedList.add(flightList.get(a));
            a++;
        }

        // Add remaining elements from the right subarray
        while (b <= end) {
            mergedList.add(flightList.get(b));
            b++;
        }

        // Copy the merged list back into the original list
        for (int k = 0; k < mergedList.size(); k++) {
            flightList.set(start + k, mergedList.get(k));
        }
    }

    /**
     * Executes the Merge Sort algorithm to sort a list of SkylinkerModel
     * objects by flight number in descending order.
     *
     * @param flightList the list of SkylinkerModel objects to sort
     * @param start the starting index of the list/subarray to sort
     * @param end the ending index of the list/subarray to sort
     */
    public void ExecuteMergeSortFlightNoDescending(ArrayList<SkylinkerModel> flightList, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // Recursively sort the left half
            ExecuteMergeSortFlightNoDescending(flightList, start, mid);
            // Recursively sort the right half
            ExecuteMergeSortFlightNoDescending(flightList, mid + 1, end);
            // Merge the sorted halves
            MergeSortFlightNoDescending(flightList, start, mid, end);
        }
    }

    /**
     * @param flightList the list of SkylinkerModel objects to merge
     * @param start the starting index of the first list
     * @param mid the ending index of the first list
     * @param end the ending index of the second list
     */
    public void MergeSortFlightNoDescending(ArrayList<SkylinkerModel> flightList, int start, int mid, int end) {
        ArrayList<SkylinkerModel> mergedList = new ArrayList<>();
        int a = start, b = mid + 1;

        // Merge the two subarrays
        while (a <= mid && b <= end) {
            if (flightList.get(a).getFlightNo() >= flightList.get(b).getFlightNo()) { // Compare in descending order
                mergedList.add(flightList.get(a));
                a++;
            } else {
                mergedList.add(flightList.get(b));
                b++;
            }
        }

        // Add remaining elements from the left subarray
        while (a <= mid) {
            mergedList.add(flightList.get(a));
            a++;
        }

        // Add remaining elements from the right subarray
        while (b <= end) {
            mergedList.add(flightList.get(b));
            b++;
        }

        // Copy the merged list back into the original list
        for (int k = 0; k < mergedList.size(); k++) {
            flightList.set(start + k, mergedList.get(k));
        }
    }
}
