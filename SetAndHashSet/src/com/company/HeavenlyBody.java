package com.company;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    //Note how the data type is always mentioned before the variable
    //The fact that we can create Set<HeavenlyBody> shows that
    //we can essentially create infinite data types, also known as,
    //Classes or Objects
    private final String name;
    private double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
        //finally understanding what this is.
        //It's not returning name per se, but the variable.
        //"name" is just a placeholder(variable) and is not searching for "name"
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
        //he did this for security reasons, though I'm not exactly sure what that means.
        //does that have to do with immutable classe?
    }


}
