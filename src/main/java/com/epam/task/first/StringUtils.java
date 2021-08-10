package com.epam.task.first;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {

    public boolean isPositiveNumbers(String str) {
        return isNumeric(str) && (!str.equals("0.0") && !str.startsWith("-"));
    }

}
