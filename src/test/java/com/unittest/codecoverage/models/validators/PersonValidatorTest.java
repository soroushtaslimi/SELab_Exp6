package com.unittest.codecoverage.models.validators;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonValidatorTest {
    @Test
    public void testRequiredName_whenNull_expectFalse(){
        PersonValidator personValidator = new PersonValidator();
        boolean result = personValidator.requiredName((String) null);
        Assertions.assertFalse(result);
    }

    @Test
    public void testRequiredName_whenEmpty_expectFalse(){
        PersonValidator personValidator = new PersonValidator();
        boolean result = personValidator.requiredName("");
        Assertions.assertFalse(result);
    }

    @Test
    public void testRequiredName_whenSpace_expectFalse(){
        PersonValidator personValidator = new PersonValidator();
        boolean result = personValidator.requiredName(" ");
        Assertions.assertFalse(result);
    }

    @Test
    public void testRequiredName_whenAhmad_space_Ali_expectTrue(){
        PersonValidator personValidator = new PersonValidator();
        boolean result = personValidator.requiredName("Ahmad Ali");
        Assertions.assertTrue(result);
    }
}
