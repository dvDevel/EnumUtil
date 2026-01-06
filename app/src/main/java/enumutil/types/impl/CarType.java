package enumutil.types.impl;

import enumutil.types.HashCode;

public enum CarType implements HashCode {
    SEDAN("SEDAN"),
    SUV("SUV_1"),
    TRUCK("TRUCK"),
    COUPE("COUPE"),
    CONVERTIBLE("CONVERTIBLE");


    private final String name;

    CarType(String name) { this.name = name; }

    @Override public String getName() { return this.name; }    

}