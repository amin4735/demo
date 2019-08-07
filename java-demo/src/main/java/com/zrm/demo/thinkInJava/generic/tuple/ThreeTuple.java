package com.zrm.demo.thinkInJava.generic.tuple;

/**
 * @author amin
 * @since 2019-07-20
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
    public final C third;

    public ThreeTuple(A a, B b, C c){
        super(a, b);
        third = c;
    }

    public String toString(){
        return "(" + first + ", " + second + ", " + third + ")";
    }

}
