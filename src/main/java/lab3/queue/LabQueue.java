package lab3.queue;

public class LabQueue {

    private QueueElement nextQueueElement;
    private QueueElement lastQueueElement;

    public void push(int el) {
        QueueElement newElement = new QueueElement(el);

        if (nextQueueElement == null) {
            this.nextQueueElement = newElement;
            this.lastQueueElement = newElement;
        } else {
            QueueElement tmp = this.lastQueueElement;
            this.lastQueueElement = newElement;
            newElement.setNext(tmp);
        }
    }

    public int pop() {
        if (this.nextQueueElement == null) {
            throw new RuntimeException();
        } else {
            int retVal = this.nextQueueElement.getValue();

            this.nextQueueElement = this.nextQueueElement.getNext();

            return retVal;
        }
    }
}
