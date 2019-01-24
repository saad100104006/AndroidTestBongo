/* 1.Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are
anagrams but ‘eat’ and ‘tar’ are not. */

/* Program has been written in java */

import java.util.*;
import java.lang.*;
import java.io.*;

public class AnagramTest
{
 public static boolean isAnagram(String first, String second)
 {
  // remove all whitespaces and convert strings to lowercase
  first  = first.replaceAll("\\s", "").toLowerCase();
  second = second.replaceAll("\\s", "").toLowerCase();

  /* check whether string lengths are equal or not,if not equal then they are not anagram */
  if (first.length() != second.length())
   return false;

  // convert first string to char array
  char[] firstArray = first.toCharArray();

  // check whether each character of firstArray is present in second string
  for (char c : firstArray)
  {
   int index = second.indexOf(c);
   // indexOf function returns -1 if the character is not found,if character is present in second string, remove that character from second string
   if (index == -1)
    return false;
   second  = second.substring(0,index) + second.substring(index+1, second.length());
  }
  return true;
 }
  public static void main (String[] args) throws java.lang.Exception
 {
  boolean result = isAnagram("bleat","table");
  System.out.println(result);
 }
}