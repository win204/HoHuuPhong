public class MyLinkedListQueue implements IStackQueue {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node headNode;
    private Node tailNode;

    public MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) return -1;
        int value = headNode.value;
        headNode = headNode.next;
        if (headNode == null) tailNode = null;
        return value;
    }

    @Override
    public boolean isFull() {
        return false; // Linked list is never full
    }

    @Override
    public boolean isEmpty() {
        return headNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp = headNode;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
