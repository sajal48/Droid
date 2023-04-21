package org.example.locklear.DROID;


import org.example.locklear.CHASIS.Chasis;
import org.example.locklear.DOME.SensorDome;
import org.example.locklear.ENUMS.Battery;
import org.example.locklear.ENUMS.Status;

public class R3 extends AstromechDroid {
    private Status R3Status;
    private Battery R3Battery;

    public R3(String serialNumber) {
        super(serialNumber);
        setDome(new SensorDome(serialNumber));
        setChasis(new Chasis(serialNumber));
        getDome().setHeight(2);
        getDome().setWeight(200);
        getChasis().setHeight(4);
        getChasis().setWeight(400);
        setHeight(getDome().getHeight() + getChasis().getHeight());
        setWeight(getDome().getWeight() + getChasis().getWeight());
        R3Status = Status.ONLINE;
        R3Battery = Battery.R3;
    }

    public void displayDroid() {
        System.out.println("Astromech Droid - R3 Series");
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Height: " + getHeight() + "cm");
        System.out.println("Weight: " + getWeight() + "kg");
        System.out.println("Dome: " + getDome());
        System.out.println("Chasis: " + getChasis());
        System.out.println("Left Arm: " + getLeftArm());
        System.out.println("Right Arm: " + getRightArm());
    }

    public void checkStatus() {
        System.out.println("R3 Droid Status: " + R3Status);
        if(getDome().sensorDomeCheck() &&
                getChasis().chasisCheck()&&
                getLeftArm().armCheck()&&
                getRightArm().armCheck()){
            R3Status = Status.ONLINE;
            System.out.println("R3 Astromech is ONLINE");
        }else {
            R3Status = Status.OFFLINE;
            System.out.println("R3 Astromech is OFFLINE");
        }
    }
}

