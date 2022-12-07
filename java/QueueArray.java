public class QueueArray {
    int frontQ,rearQ;
    int capacityQueue;
    static int[] Q1;
    public QueueArray(int size) {
        capacityQueue = size;
        Q1=new int[capacityQueue];
    }

    public void enqueu(int value) {
        if (rearQ==capacityQueue) {
            System.out.println("queue full");
        }
        else{
            Q1[rearQ]=value;
            rearQ++;
        }
    }

    public void dequeue() {
        if (rearQ==0) {
            System.out.println("there is nothing to delete");
        } else {
            for (int i = 0; i < rearQ-1; i++) {
                Q1[i]=Q1[i+1];
            }
            rearQ--;
        }
    }

    public void display() {
        if (rearQ==0) {
            System.out.println("there is nothing to show");
        }
        else{
            for (int i = 0; i < rearQ; i++) {
                    System.out.println(Q1[i]);
            }

        }
    }

    
}
