package com.zrm.demo.thinkInJava.generic.tuple;

/**
 * tuple: 元组
 *
 *
 * @author amin
 * @since 2019-07-20
 * @param <A>
 * @param <B>
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b){
        first = a;
        second = b;
    }

    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}
