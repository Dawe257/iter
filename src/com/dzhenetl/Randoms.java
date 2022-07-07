package com.dzhenetl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final Random random;
    private final List<Integer> numbers;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        random = new Random();
        numbers = new ArrayList<>();
        this.min = min;
        this.max = max + 1;
        numbers.add(random.nextInt(this.min, this.max));
    }

    private void addRandomNumber() {
        numbers.add(random.nextInt(this.min, this.max));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < numbers.size();
            }

            @Override
            public Integer next() {
                addRandomNumber();
                return numbers.get(index++);
            }
        };
    }
}
