package com.epam.task.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    void testShouldReturnTrue() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPositiveNumbers("45"));
    }

}
