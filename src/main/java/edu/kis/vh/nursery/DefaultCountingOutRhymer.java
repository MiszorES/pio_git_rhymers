package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final int EMPTY_STACK_VALUE = -1;
    final int ERROR_RETURN_VALUE = -1;
     final int STACK_CAPACITY = 12;
    private final int[] numbers = new int[STACK_CAPACITY];
  
    public int total = EMPTY_STACK_VALUE;


    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }
        
    public boolean isFull() {
        return total == STACK_CAPACITY-1;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return ERROR_RETURN_VALUE;
        return numbers[total];
    }
            
    protected int countOut() {
        if (callCheck())
            return ERROR_RETURN_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
