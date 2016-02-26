package com.andhradroid.common.components.util;

import java.util.Date;

/**
 * Created by Ramesh on 26/2/16.
 */
public interface Formatter {
    /**
     * Convert date to string in specific format using pattern.
     *
     * @param date
     * @param toPattern The to pattern. Pattern "dd-MM-yyyy" returns "26-02-2016"
     * @return the converted date to string.
     */
    String convertDateToString(Date date, String toPattern);

    /**
     * Convert string to date in specific format using pattern.
     *
     * @param date
     * @param fromPattern
     * @return
     */
    Date convertStringToDate(String date, String fromPattern);
}
