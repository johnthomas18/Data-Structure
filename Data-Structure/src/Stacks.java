import java.util.Stack;
import java.util.Queue;

public class Stacks {



    public static void main(String[] args) {
        System.out.println();

        Stack <String> files = new Stack<String>();

        //Start out with adding files here
        files.add("File Number One");
        files.add("File Number Two");
        files.add("File Number Three");
        files.add("File Number Four");
        files.add("File Number Five");

        System.out.println("Amount of files: " + files.size());
        System.out.println("The second file is: " + files.get(1));
        System.out.println("Is the file empty? " + files.empty());
        System.out.println("Remove file: " + files.remove(3));
        System.out.println("Amount of files: " + files.size());
        System.out.println("Add file: " + files.add("File Number Six"));
        System.out.println("All of the files: " + files);



//add and remove, how is it dynamically increasing, go through queue

    }
}
