/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airport.model;

/**
 * @author Sambridhi Shrestha 
 * LMU: 23048681
 */

/**
 * The SkylinkerModel class represents a model for managing flight details in an
 * airport system. This class contains attributes that define a flight, such as
 * its flight number, sector, departure time, arrival time, and operation day.
 * Author: SambridhiShrestha LMU ID: 23048681
 */
public class SkylinkerModel {

    // Unique flight number to identify the flight
    private int FlightNo;

    // Sector or route of the flight (e.g., Kathmandu to Delhi)
    private String Sector;

    // Departure time of the flight
    private String Departure;

    // Arrival time of the flight
    private String Arival;

    // Day of operation for the flight (e.g., Monday, Friday, etc.)
    private String OperationDay;

    /**
     * Constructor to initialize a SkylinkerModel object with all flight
     * details.
     *
     * @param FlightNo the flight number
     * @param Sector the sector or route of the flight
     * @param Departure the departure time
     * @param Arival the arrival time
     * @param OperationDay the day the flight operates
     */
    public SkylinkerModel(int FlightNo, String Sector, String Departure, String Arival, String OperationDay) {
        this.FlightNo = FlightNo;
        this.Sector = Sector;
        this.Departure = Departure;
        this.Arival = Arival;
        this.OperationDay = OperationDay;
    }

    /**
     * Gets the flight number.
     *
     * @return the flight number
     */
    public int getFlightNo() {
        return FlightNo;
    }

    /**
     * Sets the flight number.
     *
     * @param FlightNo the flight number to set
     */
    public void setFlightNo(int FlightNo) {
        this.FlightNo = FlightNo;
    }

    /**
     * Gets the sector or route of the flight.
     *
     * @return the sector
     */
    public String getSector() {
        return Sector;
    }

    /**
     * Sets the sector or route of the flight.
     *
     * @param Sector the sector to set
     */
    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    /**
     * Gets the departure time of the flight.
     *
     * @return the departure time
     */
    public String getDeparture() {
        return Departure;
    }

    /**
     * Sets the departure time of the flight.
     *
     * @param Departure the departure time to set
     */
    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    /**
     * Gets the arrival time of the flight.
     *
     * @return the arrival time
     */
    public String getArival() {
        return Arival;
    }

    /**
     * Sets the arrival time of the flight.
     *
     * @param Arival the arrival time to set
     */
    public void setArival(String Arival) {
        this.Arival = Arival;
    }

    /**
     * Gets the operation day of the flight.
     *
     * @return the operation day
     */
    public String getOperationDay() {
        return OperationDay;
    }

    /**
     * Sets the operation day of the flight.
     *
     * @param OperationDay the operation day to set
     */
    public void setOperationDay(String OperationDay) {
        this.OperationDay = OperationDay;
    }

}
