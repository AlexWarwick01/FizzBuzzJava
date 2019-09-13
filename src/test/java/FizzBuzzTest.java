import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {
    FizzBuzz fizzbuzz;
    @Before
    public void setup(){
        fizzbuzz = new FizzBuzz();
    }
    @Test
    public void checksMultipleOf3OutputsFizz(){
    assertEquals("Fizz", fizzbuzz.Fizzbuzz(3));
    }
    @Test
    public void checksMultipleOf5OutputsFizz(){
        assertEquals("Buzz", fizzbuzz.Fizzbuzz(5));
    }
    @Test
    public void checksMultipleOf15OutputsFizzBuzz(){
        assertEquals("FizzBuzz", fizzbuzz.Fizzbuzz(15));
    }
    @Test
    public void checksnumbers(){
        assertEquals("7", fizzbuzz.Fizzbuzz(7));
    }
    @After
    public void destroy(){
        fizzbuzz = null;
    }
}
