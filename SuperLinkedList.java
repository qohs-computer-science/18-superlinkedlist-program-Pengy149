import java.util.LinkedList;
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
        String firstLet = "";
        String secLet = "";
        myIter = this.listIterator();
        ListIterator <String> innerIter = this.listIterator();
        boolean exception;
        while (myIter.hasNext()) {
            firstLet = myIter.next();
            innerIter = this.listIterator();
            exception = true;
            while(innerIter.hasNext()) {
                secLet = innerIter.next();
                if (firstLet.equals(secLet) == true && exception == true) 
                    exception = false;
                else if (firstLet.equals(secLet)) {
                    innerIter.remove();
                    dupList.add(secLet);
                } // end else if statement 
            } // end while loop 
        } // end while loop
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