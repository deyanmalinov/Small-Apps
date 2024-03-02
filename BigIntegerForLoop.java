package com.DPM;

import java.math.BigInteger;

public class BigIntegerForLoop {
    public static void main(String[] args) {
        BigInteger first = new BigInteger("1");
        BigInteger second = new BigInteger("4");
        for (BigInteger i = first;
             i.compareTo(second) <= 0;
             i = i.add(BigInteger.valueOf(1))) {
            System.out.println(i);
        }
    }
}
