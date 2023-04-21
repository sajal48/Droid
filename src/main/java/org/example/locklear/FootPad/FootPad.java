package org.example.locklear.FootPad;

import org.example.locklear.ENUMS.Side;
import org.example.locklear.ENUMS.Status;

public abstract class FootPad {
    private String serialNumber;
    private Side side;

    public FootPad(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract boolean padCheck();

    public String getSerialNumber() {
        return serialNumber;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }
}