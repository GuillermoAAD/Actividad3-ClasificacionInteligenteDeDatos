package com.example.actividad3_clasificacioninteligentededatos.Models;

public class Emergency {
    private String typeOfEmergency;
    private String stateName;
    private int numberOfEmergencies;
    private int totalNumberOfEmergencies;
    int image;

    public Emergency(String typeOfEmergency, String stateName, int numberOfEmergencies, int totalNumberOfEmergencies, int image) {
        this.typeOfEmergency = typeOfEmergency;
        this.stateName = stateName;
        this.numberOfEmergencies = numberOfEmergencies;
        this.totalNumberOfEmergencies = totalNumberOfEmergencies;
        this.image = image;
    }

    public Emergency(String typeOfEmergency, String stateName, int numberOfEmergencies, int totalNumberOfEmergencies) {
        this.typeOfEmergency = typeOfEmergency;
        this.stateName = stateName;
        this.numberOfEmergencies = numberOfEmergencies;
        this.totalNumberOfEmergencies = totalNumberOfEmergencies;
    }

    public Emergency(String typeOfEmergency, String stateName, int numberOfEmergencies) {
        this.typeOfEmergency = typeOfEmergency;
        this.stateName = stateName;
        this.numberOfEmergencies = numberOfEmergencies;
    }

    public String getTypeOfEmergency() {
        return typeOfEmergency;
    }

    public void setTypeOfEmergency(String typeOfEmergency) {
        this.typeOfEmergency = typeOfEmergency;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getNumberOfEmergencies() {
        return numberOfEmergencies;
    }

    public void setNumberOfEmergencies(int numberOfEmergencies) {
        this.numberOfEmergencies = numberOfEmergencies;
    }

    public int getTotalNumberOfEmergencies() {
        return totalNumberOfEmergencies;
    }

    public void setTotalNumberOfEmergencies(int totalNumberOfEmergencies) {
        this.totalNumberOfEmergencies = totalNumberOfEmergencies;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
