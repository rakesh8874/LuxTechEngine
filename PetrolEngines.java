package com.luckxtech;

public class PetrolEngines extends FuelClass{
    private String speed;
    PetrolEngines(int modelNumber, int displacement, int maxPower, int maxRpm,String mileage,String fuelType,String speed) {
        super(modelNumber, displacement, maxPower, maxRpm,mileage,fuelType);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
