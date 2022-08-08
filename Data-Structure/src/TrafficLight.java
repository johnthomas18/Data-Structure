public class TrafficLight {

    private int front, rear;
    int SIZE;
    String key;
    int sizeofArray = 1;
    private String[] array;

    TrafficLight(){

        front = -1;
        rear = -1;
        this.SIZE = sizeofArray;
        this.array = new String[sizeofArray];
    }

    void enqueue(String key) {
        if (front == 0 && rear == SIZE - 1){
            System.out.println("Queue is full.");
        }
        else if (front == -1){
            front = 0;
        }
        rear = rear + 1;
        array[rear] = key;
    }

    String dequeue(){
        if (front == -1 || SIZE == 0){
            System.out.println("Queue is empty.");
            return "-1";
        }
        else {
            key = array[front];
            if (front == rear){  //queue is reset
                front = -1;
                rear = -1;
            }
        }
        front = front + 1;
        return key;
    }

    void display(){
        int i;

        for (i = front;  i < SIZE; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws InterruptedException {


        TrafficLight trafficLights = new TrafficLight();

    while(true){
        Thread.sleep(5000);
        trafficLights.enqueue("red");
        trafficLights.display();
        Thread.sleep(5000);
        trafficLights.dequeue();
        trafficLights.enqueue("green");
        trafficLights.display();
        Thread.sleep(5000);
        trafficLights.dequeue();
        trafficLights.enqueue("yellow");
        trafficLights.dequeue();
        trafficLights.display();
    }
    }
}


//red, green, yellow, red -->
// 1     2     3     1