import java.util.Queue;
import java.util.LinkedList;

public class Queues {

    public static void main(String[] args) {

        Queue<String> Library = new LinkedList<String>();

        Library.add("Book #1");
        Library.add("Book #2");
        Library.add("Book #3");
        Library.add("Book #4");

        Library.poll(); //Removes the first book from the line.

        System.out.println(Library);
        System.out.println(Library.offer("Book #5")); //basically the same as add
        System.out.println(Library);
        System.out.println("Celebrity has signed Book #2!");
        System.out.println(Library.poll());
        System.out.println("Amount of books left to sign: " + Library.size());
        System.out.println(Library);



        //Think of a line of books that are being signed from a celebrity.


    }
    }

