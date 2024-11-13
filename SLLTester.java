/*
 * Name: Kevin Zheng 
 * Date: 11/13/2024 
 * Class Period: 3 
 * Class Name: SLLTester.java 
 * Program Description: 
 */

 import java.util.LinkedList;

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

    LinkedList<String> list2 = new LinkedList <String>();
    list2.add("e");
    list2.add("d");
    list2.add("c");
    list2.add("b");
    list2.add("a");
    System.out.println("This is list2: ");
    System.out.println(list2.toString());

    LinkedList<String> list3 = new LinkedList <String>();
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
    System.out.println("This is the calling list after the mix: ");
    System.out.println(list1.toString());
    System.out.println("This is the sent list after the mix: ");
    System.out.println(list2.toString());
    System.out.println("This is retLists, return value of the call to mix: ");
    System.out.println(list1.mix(list2));



  } // end main
} // end class