package com.dzhenetl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final Random random;
    private final List<Integer> numbers;
    private final Iterator<Integer> iterator;
    private static int min;
    private static int max;

    public Randoms(int min, int max) {
        random = new Random();
        numbers = new ArrayList<>();
        iterator = new RandomIterator();
        Randoms.min = min;
        Randoms.max = max + 1;
        numbers.add(random.nextInt(Randoms.min, Randoms.max));
    }

    @Override
    public Iterator<Integer> iterator() {
        return iterator;
    }

    public class RandomIterator implements Iterator<Integer> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.size();
        }

        @Override
        public Integer next() {
            numbers.add(random.nextInt(Randoms.min, Randoms.max));
            return numbers.get(index++);
        }
    }
}
