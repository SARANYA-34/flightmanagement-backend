package com.nestdigital.flightmanagementbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class FlightModel {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String origin;
    private String destination;
    private int capacity;

    public FlightModel() {
    }

    public FlightModel(int id, String name, String origin, String destination, int capacity) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
