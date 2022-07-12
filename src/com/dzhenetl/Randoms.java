package com.dzhenetl;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max);
            }
        };
    }
}
