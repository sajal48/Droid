package org.example.locklear.CHASIS;

import org.example.locklear.ENUMS.Status;

public class Chasis {
    private String serialNumber;
    private double height;
    private double weight;
    private Status status;

    public Chasis(String serialNumber) {
        this.serialNumber = serialNumber;
        this.height = 0;
        this.weight = 0;
        this.status = Status.ONLINE;
    }

    public boolean chasisCheck() {
        return status == Status.ONLINE;

    }

    // getters and setters
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

