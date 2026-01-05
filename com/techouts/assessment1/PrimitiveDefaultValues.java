package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrimitiveDefaultValues {
    int intValue;
    double doubleValue;
    float floatValue;
    boolean booleanValue;
    short shortValue;
    byte byteValue;
    char charValue;
    long longValue;
    private static final Logger logger = Logger.getLogger(PrimitiveDefaultValues.class.getName());

    public static void main(String[] args) {
        PrimitiveDefaultValues pd = new PrimitiveDefaultValues();
        logger.log(Level.INFO, "Int Value: {0}", pd.intValue);
        logger.log(Level.INFO, "Double Value: {0}", pd.doubleValue);
        logger.log(Level.INFO, "Float Value: {0}", pd.floatValue);
        logger.log(Level.INFO, "Boolean Value: {0}", pd.booleanValue);
        logger.log(Level.INFO, "Short Value: {0}", pd.shortValue);
        logger.log(Level.INFO, "Byte Value: {0}", pd.byteValue);
        logger.log(Level.INFO, "Char Value: {0}", pd.charValue);
        logger.log(Level.INFO, "Long Value: {0}", pd.longValue);
    }
}
