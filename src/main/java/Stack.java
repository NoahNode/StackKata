public class Stack {
    private static final int DEFAULT_SIZE = 5;
    private int size = 0;
    private int capacity = 0;
    private Object[] stack;


    public Stack(){
        this.capacity = DEFAULT_SIZE;
        this.stack = new Object[DEFAULT_SIZE];
    }


    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Object objectToPush) {
        stack[size] = objectToPush;
        size++;
    }

    public int size() {
        return size;
    }

    public Object pop() {
        if(isEmpty()){
            return null;
        }

        Object objectPopped = stack[size - 1];
        stack[size - 1] = null;
        size--;
        return objectPopped;
    }
}
