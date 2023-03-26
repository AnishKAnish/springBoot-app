package com.sample.demo.utils;

public enum GeneralConstants {
    SUCCESSFULL("Successfull"),
    FAILED("Failed"),
    ENTRY_NOT_FOUND("Entry Not Found");

    private String generalConstants;
    
    private GeneralConstants(String generalConstants)
    {
        this.generalConstants = generalConstants;
    }

    public short shortValue()
    {
        return (short) ordinal();
    }

    public String getName()
    {
        return generalConstants;
    }
}
