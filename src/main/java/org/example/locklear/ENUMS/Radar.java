package org.example.locklear.ENUMS;

public enum Radar {
    R4R("Doppler", 500);

    private final String type;
    private final int range;

    Radar(String type, int range) {
        this.type = type;
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public int getRange() {
        return range;
    }
}
