package searchassessment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * YOUR TASK: adjust these tests for your own purposes.
 *
 * @author Computer Power Plus
 */
public class SequentialSearchStringTest {
    
    public SequentialSearchStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of contains method, of class SequentialSearchString.
     */
    @Test
    public void testContains() {
        System.out.println("Testing method: contains()");
        String[] collection;
 
        // Test case: very small array of single words
        collection = new String[] {"Hello", "World"};
        assertEquals(true, SequentialSearchString.contains("Hello", collection));
        assertEquals(false, SequentialSearchString.contains("Goodbye", collection));
        // Test case: case insensitive
        assertEquals(true, SequentialSearchString.contains("hello", collection));
        assertEquals(true, SequentialSearchString.contains("wORLD", collection));
        
        // Test case: array of 1 string
        collection = new String[] {"Hello"};
        assertEquals(true, SequentialSearchString.contains("Hello", collection));
        assertEquals(false, SequentialSearchString.contains("Goodbye", collection));

        // Test case: small array of phrases - exact match of entire phrase
        collection = new String[] {"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(true, SequentialSearchString.contains("Star Wars", collection));
        assertEquals(true, SequentialSearchString.contains("Thor: Rognarok", collection));
        assertEquals(false, SequentialSearchString.contains("Thor", collection));
        assertEquals(false, SequentialSearchString.contains("War", collection));
    }

    /**
     * Test of indexOf method, of class SequentialSearchString.
     */
    @Test
    public void testIndexOf() {
        System.out.println("Testing method: indexOf()");
        String[] collection;
    
        // Test case: very small array of single words
        collection = new String[] {"Hello", "World"};
        assertEquals(0, SequentialSearchString.indexOf("Hello", collection));
        assertEquals(1, SequentialSearchString.indexOf("World", collection));
        assertEquals(-1, SequentialSearchString.indexOf("Goodbye", collection));
        
    
        // Test case: small array of SORTED titles - exact match of entire title
        collection = new String[] {"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(0, SequentialSearchString.indexOf("A Wrinkle in Time", collection));
        assertEquals(1, SequentialSearchString.indexOf("Avengers: Infinity War", collection));
        assertEquals(2, SequentialSearchString.indexOf("Star Wars", collection));
        assertEquals(3, SequentialSearchString.indexOf("Thor: Rognarok", collection));      
        assertEquals(-1, SequentialSearchString.indexOf("Gone with the Wind", collection));      

        // Test case: UNSORTED titles - itmes should be found all the same
        collection = new String[] {"Avengers: Infinity War", "Thor: Rognarok", "Star Wars", "A Wrinkle in Time"};
        assertEquals(3, SequentialSearchString.indexOf("A Wrinkle in Time", collection));
        assertEquals(0, SequentialSearchString.indexOf("Avengers: Infinity War", collection));
        assertEquals(2, SequentialSearchString.indexOf("Star Wars", collection));
        assertEquals(1, SequentialSearchString.indexOf("Thor: Rognarok", collection));      
        assertEquals(-1, SequentialSearchString.indexOf("Gone with the Wind", collection));      
       
    }

    /**
     * Test of main method, of class SequentialSearchString.
     */
    @Test
    public void testMain() {
        System.out.println("Not testing main method at this stage");
//        String[] args = null;
//        BinarySearchString.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
