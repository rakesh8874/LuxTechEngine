package com.luckxtech;

public class ElectricEngines extends Engines{
   private String voltage;
    private String speed;
    ElectricEngines(int modelNumber, int displacement, int maxPower, int maxRpm,String voltage,String speed) {
        super(modelNumber, displacement, maxPower, maxRpm);
        this.voltage = voltage;
        this.speed = speed;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }
    public String getSpeed(){
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
