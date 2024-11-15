/*
 * Name: Kevin Zheng 
 * Date: 11/15/2024 
 * Class Period: 3 
 * File Name: SLLTester.java 
 * Program Description: The purpose of this java file is to test all of the methods of the SuperLinkedList Class to make sure they work. 
 */

// LinkedList is imported to be able to store multiple letters and as a base for the SuperLinkedList Class 
import java.util.LinkedList;

// ListIterator is imported to be able to go through LinkedLists and help output LinkedLists 
import java.util.ListIterator;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList list1 = new SuperLinkedList();
    list1.add("a");
    list1.add("b");
    list1.add("c");
    list1.add("d");
    list1.add("e");
    System.out.println("This is list1: ");
    System.out.println(list1.toString());

    SuperLinkedList list2 = new SuperLinkedList();
    list2.add("e");
    list2.add("d");
    list2.add("c");
    list2.add("b");
    list2.add("a");
    System.out.println("This is list2: ");
    System.out.println(list2.toString());

    SuperLinkedList list3 = new SuperLinkedList();
    list3.add("A");
    list3.add("D");
    list3.add("C");
    list3.add("C");
    list3.add("D");
    list3.add("E");
    list3.add("B");
    System.out.println("This is list3: ");
    System.out.println(list3.toString());

    System.out.println("");
    LinkedList<String> retLists = list1.mix(list2);
    System.out.println("This is the calling list after the mix: ");
    System.out.println(list1.toString());
    System.out.println("This is the sent list after the mix: ");
    System.out.println(list2.toString());
    System.out.println("This is retLists, return value of the call to mix: ");
    ListIterator <String> listIter = retLists.listIterator();
    while (listIter.hasNext())
      System.out.println(listIter.next());

    System.out.println("");
    System.out.println("Removed Vowels: " + list1.removeVowels());
    LinkedList<String> dupeList = list3.removeDuplicates();
    System.out.println("This is list3 after the removeDuplicates: ");
    System.out.println(list3);
    System.out.println("Returned from removeDuplicates: ");
    listIter = dupeList.listIterator();
    while (listIter.hasNext())
      System.out.println(listIter.next());
    list3.removeVowels();
    System.out.println("This is list3 after the removeVowels: ");
    System.out.println(list3);

    System.out.println("");
    System.out.println("Removed Consonants: " + list2.removeConsonants());
    System.out.println("This is list2 after the removeConsonants: ");
    System.out.println(list2);

    System.out.println("");
    retLists = list3.concatenateStrings();
    System.out.println("This is list3 after the concatenateStrings: ");
    System.out.println(list3);
    System.out.println("This is retLists, return value of the call to concatenateStrings: ");
    listIter = retLists.listIterator();
    while (listIter.hasNext())
      System.out.println(listIter.next());

  } // end main
} // end class