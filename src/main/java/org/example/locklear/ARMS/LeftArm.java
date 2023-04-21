package org.example.locklear.ARMS;

import org.example.locklear.ENUMS.Limb;
import org.example.locklear.ENUMS.Side;
import org.example.locklear.ENUMS.Status;
import org.example.locklear.FootPad.LeftFootPad;

public class LeftArm extends Arm {
    private static final String SERIAL_NUMBER = "LA-01";
    private static Status STATUS = Status.ONLINE;
    private static final Side SIDE = Side.LEFT;
    private static final LeftFootPad PAD = new LeftFootPad("LFP-1");


    public LeftArm() {
        super(SERIAL_NUMBER);
        setSide(SIDE);
        setPad(PAD);
        setUpper(Limb.Upper);
        setLower(Limb.Lower);
    }

    @Override
    public boolean armCheck() {
        if (STATUS == Status.ONLINE && getPad().padCheck()) {
            return true;
        } else {
            STATUS = Status.OFFLINE;
        }
        return false;
    }
}
