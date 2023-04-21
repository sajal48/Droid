package org.example.locklear.FACTORY;

import org.example.locklear.DROID.AstromechDroid;

public class R3Factory extends DroidFactory {
    private static int r3Count = 0;

    public R3Factory(String factoryID) {
        super(factoryID);
    }

    @Override
    public boolean buildDroids(int count) {
        for (int i = 0; i < count; i++) {
            r3Count++;
            String serialNumber = "R3-" + String.format("%03d", r3Count);
            AstromechDroid droid = new AstromechDroid(serialNumber) {
                @Override
                public void displayDroid() {
                    System.out.println();
                }

                @Override
                public void checkStatus() {

                }
            };
            getDroidStorage().add(droid);
        }
        return true;
    }

    @Override
    public void displayAllDroids() {
        System.out.println("Droids in storage for R3 factory " + getFactoryID() + ":");
        for (AstromechDroid droid : getDroidStorage()) {
            System.out.println(droid);
        }
    }
}
