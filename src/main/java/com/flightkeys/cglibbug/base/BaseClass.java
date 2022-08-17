package com.flightkeys.cglibbug.base;


public class BaseClass {
    private final ObjectMapper mapper = new ObjectMapper();

    String serialize(Object value) {
        return serialize(getMapper(), value);
    }

    private ObjectMapper getMapper() {
        return mapper;
    }

    private String serialize(ObjectMapper mapper, Object value) {
        return mapper.writeToString(value);
    }
}

