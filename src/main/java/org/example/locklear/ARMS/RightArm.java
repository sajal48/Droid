package org.example.locklear.ARMS;

import org.example.locklear.ENUMS.Limb;
import org.example.locklear.ENUMS.Side;
import org.example.locklear.ENUMS.Status;
import org.example.locklear.FootPad.RightFootPad;

public class RightArm extends Arm {
    private static final String SERIAL_NUMBER = "RA-02";
    private static Status STATUS = Status.ONLINE;
    private static final Side SIDE = Side.RIGHT;
    private static final RightFootPad PAD = new RightFootPad("RFP-2");


    public RightArm() {
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
