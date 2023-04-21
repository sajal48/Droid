package org.example.locklear.ARMS;

import org.example.locklear.ENUMS.Limb;
import org.example.locklear.ENUMS.Side;
import org.example.locklear.ENUMS.Status;
import org.example.locklear.FootPad.FootPad;
import org.example.locklear.FootPad.LeftFootPad;
import org.example.locklear.FootPad.RightFootPad;

public abstract class Arm {
    private String serialNumber;
    private Side side;
    private Limb upper;
    private Limb lower;
    private FootPad pad;

    public Arm(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract boolean armCheck();

    public String getSerialNumber() {
        return serialNumber;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Limb getUpper() {
        return upper;
    }

    public void setUpper(Limb upper) {
        this.upper = upper;
    }

    public Limb getLower() {
        return lower;
    }

    public void setLower(Limb lower) {
        this.lower = lower;
    }

    public FootPad getPad() {
        return pad;
    }

    public void setPad(FootPad pad) {
        this.pad = pad;
    }
}

