public class Stack {
    private boolean isEmpty = true;
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Object objectToPush) {
        isEmpty = false;
        size++;
    }

    public int size() {
        return size;
    }
}
