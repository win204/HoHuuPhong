public class MyArrayQueue implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    public MyArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex = 0;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) return -1;
        int value = array[headIndex++];
        if (headIndex > tailIndex) {
            headIndex = tailIndex = -1;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return headIndex == -1 && tailIndex == -1;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
