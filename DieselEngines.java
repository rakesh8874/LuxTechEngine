package com.luckxtech;

public class DieselEngines extends FuelClass{
   private String speed;
    DieselEngines(int modelNumber, int displacement, int maxPower, int maxRpm,String mileage,String fuelType,String speed) {
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
