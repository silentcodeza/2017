//
// File:        Test.java
//
// Language:    Java 1.02
// Description: Test of a "SkipList" proposed by William Pugh
//
// Author:  Thomas Wenger, Jan-7-1998
//

import java.util.Random;    // Randomizer to produce test input



public class Test {

  public static final int[] ELEMENTS = { 23, 15, 77, 46, 89, 13, 49 };

  //
  // main:
  //
  public static void main(String args[])  throws java.io.IOException {
 
    // init a skip list:
    SkipList aSkipList = new SkipList(0.5f, 4);

    // insert some elements:
    for (int i=0; i<ELEMENTS.length; i++) {
      aSkipList.insert(ELEMENTS[i], 999);
    }

    // delete an element:
    aSkipList.delete(77);

    // search an element:
    int value = aSkipList.search(15);
    System.out.println("Found value: " + value + "\n");

    // write out the list:
    System.out.println(aSkipList);
    System.out.println(aSkipList.elementsToString());

    java.io.DataInputStream in = new java.io.DataInputStream(System.in);
    String dummy = in.readLine();
  }

}
