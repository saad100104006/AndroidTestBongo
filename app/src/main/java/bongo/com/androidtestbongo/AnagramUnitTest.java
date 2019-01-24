/* 1.Unit test of Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are
anagrams but ‘eat’ and ‘tar’ are not. */

/* Program has been written in java */

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;    
import java.io.*;

public class AnagramUnitTest {

private String mFirstValue="eat";
private String mSecondValue="tar";

    @Test
    public void testIsAnagramOrNot() {
        AnagramTest   = new AnagramTest();
        Boolean result = anagramTest.isAnagram(mFirstValue, mSecondValue);
		if(result){
		   assertEquals(mFirstValue+" and "+mSecondValue+" are Anagram");
		}
		else{
		   assertEquals(mFirstValue+" and "+mSecondValue+" are not Anagram");
		}
    }
	
	@Test
    public void testIsInputValid() {
        AnagramTest   = new AnagramTest();
		if(mFirstValue!=null && mSecondValue!=null){
		system.out.println("inputs are valid");
		}
		else{
		system.out.println("inputs are not valid");
		}
		
    }
}