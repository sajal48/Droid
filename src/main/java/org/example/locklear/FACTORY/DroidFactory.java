package org.example.locklear.FACTORY;

import org.example.locklear.DROID.AstromechDroid;
import org.example.locklear.INTERFACES.Displayable;

import java.util.ArrayList;

public abstract class DroidFactory implements Displayable {
    private String factoryID;
    private ArrayList<AstromechDroid> droidStorage;

    public DroidFactory(String factoryID) {
        this.factoryID = factoryID;
        this.droidStorage = new ArrayList<>();
    }

    public abstract boolean buildDroids(int count);

    public String getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(String factoryID) {
        this.factoryID = factoryID;
    }

    public ArrayList<AstromechDroid> getDroidStorage() {
        return droidStorage;
    }

    public void setDroidStorage(ArrayList<AstromechDroid> droidStorage) {
        this.droidStorage = droidStorage;
    }
}

