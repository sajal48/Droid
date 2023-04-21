package org.example.locklear.FootPad;

import org.example.locklear.ENUMS.Side;
import org.example.locklear.ENUMS.Status;

public class RightFootPad extends FootPad {
    private static final String SERIAL_NUMBER = "RFP-2";
    private static final Side SIDE = Side.RIGHT;
    private static Status RIGHT_PAD_STATUS = Status.ONLINE;

    public RightFootPad(String serialNumber) {
        super(serialNumber);
        setSide(SIDE);
    }

    @Override
    public boolean padCheck() {

        if(RIGHT_PAD_STATUS==Status.ONLINE){
            return true;
        }
        else {
            RIGHT_PAD_STATUS = Status.ONLINE;
            return false;
        }
    }

    public Status getRightPadStatus() {
        return RIGHT_PAD_STATUS;
    }
}


