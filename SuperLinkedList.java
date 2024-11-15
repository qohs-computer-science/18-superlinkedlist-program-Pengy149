/*
 * Name: Kevin Zheng 
 * Date: 11/15/2024 
 * Class Period: 3 
 * File Name: SuperLinkedList.java 
 * Program Description: This class acts as an extension to the LinkedList class. Adds 6 methods: removeVowels(removes all vowels in a LinkedList), 
 * removeConsonants(removes all consonants(not vowels) in a LinkedList), removeDuplicates(ensures only unqiue values in a LinkedList), 
 * concatenateStrings(each following element in a LinkedList has the corresponding element's letter added to the String), mix(combines two LinkedLists), 
 * and toString(displays the SuperLinkedList in a list form (Ex. a, b, c)) 
 */

// LinkedList is imported to be able to store multiple letters and as a base for the SuperLinkedList Class 
import java.util.LinkedList;

// ListIterator is imported to be able to go through LinkedLists and help modify LinkedLists 
import java.util.ListIterator;

public class SuperLinkedList extends LinkedList<String> {
    private ListIterator <String> myIter;

    public boolean removeVowels() {
        myIter = this.listIterator();
        String letter;
        boolean removed = false;
        while (myIter.hasNext()) {
            letter = myIter.next();
            if(letter.toLowerCase().equals("a") || letter.toLowerCase().equals("e") || letter.toLowerCase().equals("i") || letter.toLowerCase().equals("o") || letter.toLowerCase().equals("u")) {
                myIter.remove();
                removed = true;
            } // end if statement 
        } // end while loop 
        return removed;
    } // end removeVowels

    public boolean removeConsonants() {
        boolean removed = false;
        String letter;
        myIter = this.listIterator();
        while (myIter.hasNext()) {
            letter = myIter.next();
            if(!(letter.toLowerCase().equals("a") || letter.toLowerCase().equals("e") || letter.toLowerCase().equals("i") || letter.toLowerCase().equals("o") || letter.toLowerCase().equals("u"))) {
                myIter.remove();
                removed = true;
            } // end if statement 
        } // end while loop
        return removed;
    } // end removeConsonants 

    public LinkedList<String> removeDuplicates() {
        LinkedList<String> dupList = new LinkedList<String>();
        String letter = "";
        boolean exception;
        String temp;
        for (int i = 0; i < this.size(); i++) {
            letter = this.get(i);
            exception = true;
            myIter = this.listIterator();
            while (myIter.hasNext()) {
                temp = myIter.next();
                if(letter.equals(temp)) {
                    if(exception)
                        exception = false;
                    else {
                        dupList.addFirst(letter);
                        myIter.remove();
                    } // end else statement 
                } // end if statement 
            } // end if statement 
        } // end for loop 
        return dupList;
    } // end removeDuplicates

    public LinkedList<String> concatenateStrings() {
        LinkedList<String> retList = new LinkedList<String>(); 
        String newEle = "";
        myIter = this.listIterator();
        while (myIter.hasNext()) {
            newEle += myIter.next();
            retList.add(newEle);
        } // end while loop
        return retList;
    } // end concatenateStrings

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList <String> combList = new LinkedList<String>(); 
        myIter = this.listIterator();
        ListIterator <String> secIter = list2.listIterator();
        while (myIter.hasNext()) {
            combList.add(myIter.next());
            combList.add(secIter.next());
        } // end while loop
        return combList;
    } // end mix

    public String toString() {
        String returned = "";
        String letter;
        myIter = this.listIterator();
        if(myIter.hasNext()) {
            letter = myIter.next();
            returned += letter;
        } // end if statement 
        
        while (myIter.hasNext()) {
            letter = myIter.next();
            returned += ", " + letter;
        } // end while loop 
        return returned;
    } // end toString
    
} // end SuperLinkedList