package ec.edu.epn.git.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c = new Calculator();
    }
    @Test
    public void given_two_integers_when_add_then_ok(){
        System.out.println("Test 1");
        assertEquals(6, c.addition(3,3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(7, c.subtraction(10, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        System.out.println("Test 3");
        assertEquals(3, c.division(6, 0), 0);
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_expection(){
        System.out.println("Test 4");
        c.timeout(100);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAnswer(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }

}