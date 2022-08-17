package com.flightkeys.cglibbug.base;

public class Wrapper {
    private final BaseClass serializationClass;

    public Wrapper(BaseClass serializationClass) {
        this.serializationClass = serializationClass;
    }

    public String serialize(Object value) {
        return serializationClass.serialize(value);
    }
}
