/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airport.controller.algorithms;

/**
 *
 * @author Sambridhi Shrestha 
 * LMU Id:23048681
 */
import com.airport.model.SkylinkerModel;
import java.util.ArrayList;

public class SelectionSort {

    /**
     *
     * @param unsortedData the list of SkylinkerModel objects to be sorted
     * @param isAsc boolean flag to determine if the sorting should be in
     * ascending order (true) or descending (false)
     * @return a new ArrayList containing the sorted SkylinkerModel objects
     */
    public ArrayList<SkylinkerModel> sortBySector(ArrayList<SkylinkerModel> unsortedData, boolean isAsc) {
        ArrayList<SkylinkerModel> dataSort = new ArrayList<>();
        dataSort.addAll(unsortedData);

        for (int i = 0; i < dataSort.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < dataSort.size(); j++) {
                if (isAsc) {
                    // Compare sectors in ascending order
                    if (dataSort.get(j).getSector().compareToIgnoreCase(dataSort.get(minIndex).getSector()) < 0) {
                        minIndex = j;
                    }
                } else {
                    // Compare sectors in descending order
                    if (dataSort.get(j).getSector().compareToIgnoreCase(dataSort.get(minIndex).getSector()) > 0) {
                        minIndex = j;
                    }
                }
            }
            // Swap the elements
            SkylinkerModel tempSector = dataSort.get(i);
            dataSort.set(i, dataSort.get(minIndex));
            dataSort.set(minIndex, tempSector);
        }
        return dataSort;
    }

    /**
     * Sorts a list of SkylinkerModel objects by the "Sector" field in
     * descending order. This method uses the Selection Sort algorithm to
     * arrange the list in descending order of sector names.
     *
     * @param unsortedData the list of SkylinkerModel objects to be sorted
     * @param isDesc boolean flag to determine if the sorting should be in
     * descending order (true) or ascending (false)
     * @return a new ArrayList containing the sorted SkylinkerModel objects in
     * descending order
     */
    public ArrayList<SkylinkerModel> sortBySector1(ArrayList<SkylinkerModel> unsortedData, boolean isDesc) {
        ArrayList<SkylinkerModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    // Compare sectors in descending order
                    if (dataToSort.get(j).getSector().compareToIgnoreCase(dataToSort.get(maxIndex).getSector()) > 0) {
                        maxIndex = j;
                    }
                } else {
                    // Compare sectors in ascending order
                    if (dataToSort.get(j).getSector().compareToIgnoreCase(dataToSort.get(maxIndex).getSector()) < 0) {
                        maxIndex = j;
                    }
                }
            }
            // Swap the elements
            SkylinkerModel tempSector = dataToSort.get(i);
            dataToSort.set(i, dataToSort.get(maxIndex));
            dataToSort.set(maxIndex, tempSector);
        }
        return dataToSort;
    }
}
