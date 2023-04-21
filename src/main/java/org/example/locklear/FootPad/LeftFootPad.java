package org.example.locklear.FootPad;

import org.example.locklear.ENUMS.Side;
import org.example.locklear.ENUMS.Status;

public class LeftFootPad extends FootPad {
    private static final String SERIAL_NUMBER = "LFP-1";
    private static final Side SIDE = Side.LEFT;
    private static Status LEFT_PAD_STATUS = Status.ONLINE;

    public LeftFootPad(String serialNumber) {
        super(serialNumber);
        setSide(SIDE);
    }

    @Override
    public boolean padCheck() {
        if(LEFT_PAD_STATUS==Status.ONLINE){
            return true;
        }
        else {
            LEFT_PAD_STATUS = Status.ONLINE;
            return false;
        }
    }

    public Status getLeftPadStatus() {
        return LEFT_PAD_STATUS;
    }
}



