package org.example.locklear.DROID;

import org.example.locklear.CHASIS.Chasis;
import org.example.locklear.DOME.SensorDome;
import org.example.locklear.ENUMS.Battery;
import org.example.locklear.ENUMS.Radar;
import org.example.locklear.ENUMS.Status;

public class R4 extends AstromechDroid {
    private Status R4Status;
    private Battery R4Battery;
    private Radar R4Radar;

    public R4(String serialNumber) {
        super(serialNumber);
        setDome(new SensorDome(serialNumber));
        setChasis(new Chasis(serialNumber));
        getDome().setHeight(2);
        getDome().setWeight(150);
        getChasis().setHeight(5);
        getChasis().setWeight(500);
        setHeight(getDome().getHeight() + getChasis().getHeight());
        setWeight(getDome().getWeight() + getChasis().getWeight());
        R4Status = Status.ONLINE;
        R4Battery = Battery.R4;
        R4Radar = Radar.R4R;
    }


    public void displayDroid() {
        System.out.println("Astromech Droid - R4 Series");
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Height: " + getHeight() + "cm");
        System.out.println("Weight: " + getWeight() + "kg");
        System.out.println("Dome: " + getDome());
        System.out.println("Chasis: " + getChasis());
        System.out.println("Left Arm: " + getLeftArm());
        System.out.println("Right Arm: " + getRightArm());
        System.out.println("Radar: " + R4Radar);
    }

    public void checkStatus() {
        if(getDome().sensorDomeCheck() &&
                getChasis().chasisCheck()&&
                getLeftArm().armCheck()&&
                getRightArm().armCheck()){
            R4Status = Status.ONLINE;
            System.out.println("R4 Astromech is ONLINE");
        }else {
            R4Status = Status.OFFLINE;
            System.out.println("R4 Astromech is OFFLINE");
        }
    }
}
