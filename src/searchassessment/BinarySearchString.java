package searchassessment;

import java.util.Arrays;
import utils.In;
import utils.Stopwatch;

/**
 * The class BinarySearch implements a binary search algorithm 
 * to search for a term in collection of strings.
 * The collection MUST BE A SORTED COLLECTION. This class will not sort it.
 * 
 * Searching in collections is done to answer the following questions: 
 * - Does the element exists in a collection? -> method contains()
 * - How to get the element from a collection? - > method indexOf()
 * 
 * YOUR TASK:
 * 1. implement indexOf method
 * 2. test it using JUnit test class provided BinarySearchStringTest.java
 * 3. Implement main method
 * 4. Perform measurements using data sets provided
 * 
 * @author Computer Power Plus
 * @author YOUR NAME
 */
public class BinarySearchString {
    
     /**
    * Checks if collection contains an item.
    * @param term the search term, in this case a String
    * @param collection the collection to be searched, in this case a SORTED array of Strings
    * @return true if collection contains the term, false otherwise
    * 
    */    
    public static boolean contains(String term, String[] collection){   
        // Reuses the algorithm implementation in indexOf()
        return (indexOf(term, collection) != -1);
    }
     
     
 /**
 * Searches for a term in a sorted collection, and returns the index of 
 * the item , if it is found.
 * The input collection MUST BE PRE-SORTED
 * 
 * @param term the search term, in this case a String
 * @param collection the SORTED collection to be searched, in this case an array of Strings
 * @return int index of item in the array if found, otherwise -1
 * 
 */    
    public static int indexOf(String term, String[] collection) {
        
        // YOUR TASK:
        // IMPLEMENT THE BINARY SEARCH
        
        return -1; // default implementation - change this when you implement the search.
      }
    
    
     /**
     * Reads in 
     * - a search term (String)
     * - a sequence of Strings from a file (.txt file), one string per line
     * both specified as a command-line argument;
     * searches for the term in the collection of integers
     * prints the result of the search and the time in seconds
     *
     * @param args the command-line arguments
     * @param arg[0] is the search term
     * @param arg[1] is the name of an input file, containing one item per line.
     */
    public static void main(String[] args)  { 

            // YOUR TASK: 
            // - READ INPUT ARGUMENTS FROM A FILE
            //    Hint: you may use the utility classes In, StdIn provided
            // - CALL THE SEARCHING METHOD
            // - IMPLEMENT TIMER
            //   Hint: you may use the provided Stopwatch utility class
            // - IMPLEMENT STEP COUNTER  
    
    } 
    
}
