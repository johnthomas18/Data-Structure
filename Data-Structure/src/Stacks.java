import java.util.Stack;

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
        System.out.println("Is the file empty?" + files.empty());



    }
}
