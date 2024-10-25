package lab3.queue;

public class LabQueue {

    private QueueElement firstQueueElement;
    private QueueElement lastQueueElement;

    public void push(int el) {
        QueueElement newElement = new QueueElement(el);

        if (firstQueueElement == null) {
            firstQueueElement = newElement;
            lastQueueElement = newElement;
        } else {
            lastQueueElement.setNext(newElement);
            lastQueueElement = newElement;
        }
    }

    public int pop() {
        if (firstQueueElement == null) {
            throw new RuntimeException("no elements in queue");
        } else {
            int retVal = firstQueueElement.getValue();
            firstQueueElement = firstQueueElement.getNext();

            if (firstQueueElement == null) {
                lastQueueElement = null;
            }
            return retVal;
        }
    }
}
