package tests;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import kick.start.EvenDigits;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
class EvenDigitsTest {

    @Test
    public void GivenTwo_GetMinimumNumberOfStepsUntilAllDigitsEven_ReturnsZero(){
        long actual=EvenDigits.GetMinimumNumberOfStepsUntilAllDigitsEven(2);
        long expected = 0;
        Assert.assertEquals(expected, actual);
    }
}