package org.clevertech.git.pz.model;

public class Car {

    enum TransmissionType {
        MANUAL, AUTOMATIC, TIPTRONIC
    }

    private Engine engine;

    private Boombox boombox;

    private FuelTank fuelTank;

    private String color;

    private TransmissionType transmissionType;
}
