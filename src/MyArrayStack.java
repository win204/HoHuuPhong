public class MyArrayStack implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int topIndex;

    public MyArrayStack(int size) {
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            array[++topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) return -1;
        return array[topIndex--];
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
