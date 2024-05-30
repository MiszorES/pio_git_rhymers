package edu.kis.vh.nursery;

/**
 * Klasa FifoRhymer implementuje liczenie w stylu FIFO (First In First Out).
 * Klasa rozszerza DefaultCountingOutRhymer.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Nadpisuje metodę countOut, aby zaimplementować FIFO.
     * Metoda zwraca pierwszy element element  lub -1 jesli licznik jest pusty
     */
    @Override
    protected int countOut() {
        while (!callCheck())
            
            temp.countIn(super.countOut());
        
        int ret = temp.countOut();
        
        while (!temp.callCheck())
            
            countIn(temp.countOut());
        
        return ret;
    }

    /**
     * Zwraca tymczasowy licznik użyty do operacji FIFO.
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
