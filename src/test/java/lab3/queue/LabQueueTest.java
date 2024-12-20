package lab3.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LabQueueTest {

    @Test
    public void test() {
        LabQueue queue = new LabQueue();

        int[] sourceElementsArray = new int[]{6, 10, 8, 3, 45, 3564, 23, 9};

        for (int i : sourceElementsArray) {
            queue.push(i);
        }
        for (int i : sourceElementsArray) {
            Assertions.assertEquals(i, queue.pop());
        }
    }
}
