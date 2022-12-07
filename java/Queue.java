public class Queue {
    public static void main(String[] args) {
        QueueArray QT=new QueueArray(5);
        QT.enqueu(5);
        QT.enqueu(1);
        QT.enqueu(7);
        QT.enqueu(9);
        QT.enqueu(3);
        QT.display();
        QT.dequeue();
        QT.display();
    }
}
