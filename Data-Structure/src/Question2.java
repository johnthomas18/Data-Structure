public class Question2 {

    int size;
    int[] array;
    int nextIndex;
    double total;

    public Question2(int size) {

        array = new int [size]; //Assigns the size to array.
    }

    public double avg(int value) {

        total += value; //increments value to total.
        array[nextIndex] = value; //assigns value to the array
        nextIndex++; //This is used so each average is stored in the array rather than only one average being stored in array[i]
        size++; //size goes up for each value that is added

        return total/size;

    }

    public static void main(String[] args) {

        Question2 q = new Question2(5); //Define how big the array will be here

        System.out.println("Average: " + q.avg(3)); //Here, three will be assigned to value in the avg function.
        System.out.println("Average: " + q.avg(9));
        System.out.println("Average: " + q.avg(4));
        System.out.println("Average: " + q.avg(6));
    }




}