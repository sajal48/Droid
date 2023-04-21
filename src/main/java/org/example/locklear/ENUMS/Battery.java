package org.example.locklear.ENUMS;

public enum Battery {
    R3("Lithium", 1000),
    R4("Trithium", 2000);

    private final String type;
    private final int amps;

    Battery(String type, int amps) {
        this.type = type;
        this.amps = amps;
    }

    public String getType() {
        return type;
    }

    public int getAmps() {
        return amps;
    }
}
