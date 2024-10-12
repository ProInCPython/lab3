package lab3.queue;

public class QueueElement {
    private int value;
    private QueueElement next;

    public QueueElement(int value) {
        this.value = value;
    }

    public QueueElement(int value, QueueElement next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public QueueElement getNext() {
        return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}
