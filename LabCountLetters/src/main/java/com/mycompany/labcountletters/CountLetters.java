
package com.mycompany.labcountletters;

import java.util.Scanner;
// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************

public class CountLetters {
    
 public static void main(String[] args){
    
    
    int[] counts = new int[26];
    Scanner scan = new Scanner(System.in);
    //get word from user
    System.out.print("Enter a single word (letters only, please): ");
    String word = scan.nextLine();
    //convert to all upper case
    word = word.toUpperCase();
    //count frequency of each letter in string
    
    for (int i=0; i < word.length(); i++)
    
     try // I added this try , matching catch below 
     {
      counts[word.charAt(i)-'A']++;
      //print frequencies
      // Took out not needed **** System.out.println();
     } // end of try
     catch (ArrayIndexOutOfBoundsException e ){ // this catch has to go after the above println 
      System.out.println( "Not a letter. " + word.charAt(i));
      
     } // end of catch
    
    for (int i=0; i < counts.length; i++)
    if (counts [i] != 0)
    System.out.println((char)(i +'A') + ": " + counts[i]);  
    }    
}
