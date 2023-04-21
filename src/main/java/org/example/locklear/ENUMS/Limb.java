package org.example.locklear.ENUMS;

public enum Limb {
    Upper("Upper", 1),
    Lower("Lower", 2);

    private final String type;
    private final int value;

    Limb(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
