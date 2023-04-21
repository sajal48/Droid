package org.example.locklear.FACTORY;

import org.example.locklear.DROID.AstromechDroid;

public class R4Factory extends DroidFactory {
    private static int r4Count = 0;

    public R4Factory(String factoryID) {
        super(factoryID);
    }

    @Override
    public boolean buildDroids(int count) {
        for (int i = 0; i < count; i++) {
            r4Count++;
            String serialNumber = "R4-" + String.format("%03d", r4Count);
            AstromechDroid droid = new AstromechDroid(serialNumber) {
                @Override
                public void displayDroid() {

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
        System.out.println("Droids in storage for R4 factory " + getFactoryID() + ":");
        for (AstromechDroid droid : getDroidStorage()) {
            System.out.println(droid);
        }
    }
}
