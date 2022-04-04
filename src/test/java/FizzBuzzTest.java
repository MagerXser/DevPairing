import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();


    @DisplayName("Test if the number is divisible 3")
    @Test
    public void testDivisibleBy3 (){

        Assert.assertTrue(fizzBuzz.divisibleBy(15,3));
        Assert.assertTrue(fizzBuzz.divisibleBy(9,3));

    }

    @DisplayName("Test if the number is divisible 5 ")
    @Test
    public void testDivisibleBy5 (){

        Assert.assertTrue(fizzBuzz.divisibleBy(15,5));
        Assert.assertTrue(fizzBuzz.divisibleBy(10,5));

    }

    @DisplayName("Testing the generated list is correct")
    @Test
    public void testForList (){

        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> actual = new ArrayList<>(fizzBuzz.fizzBuzzGenerator(10));

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }


}
