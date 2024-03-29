package com.zrm.demo.thinkInJava.generic.generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static Random rand = new Random(47);

    public CoffeeGenerator(){

    }

    private int size = 0;
    public CoffeeGenerator(int sz){
        size = sz;
    }

    public Coffee next() {
        try{
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        }catch (InstantiationException e){
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public boolean hasNext() {
            return count > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
}
