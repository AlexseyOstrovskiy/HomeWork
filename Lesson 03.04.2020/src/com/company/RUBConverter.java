package com.company;

public class RUBConverter implements Converter {
    @Override
    public float convert(float value) {
        return value *1000;
    }
}
