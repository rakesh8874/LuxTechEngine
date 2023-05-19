package com.luckxtech;

public class FuelClass extends Engines{
   private String mileage;
   String fuelType;
    FuelClass(int modelNumber, int displacement, int maxPower, int maxRpm,String mileage, String fuelType) {
        super(modelNumber, displacement, maxPower, maxRpm);
        this.mileage = mileage;
        this.fuelType = fuelType;
    }
    public String getMileage(){
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
