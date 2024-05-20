package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
     final int EMPTY_STACK_VALUE=-1;
     final int STACK_CAPACITY =12;
    private final int[] numbers = new int[STACK_CAPACITY];

    private final int[] NUMBERS = new int[12];
  
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
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }
            
    protected int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }
}
