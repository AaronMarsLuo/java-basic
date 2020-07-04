package org.example.basic;

public class compareInteger {
    public static void main(String[] args) {
        Integer i1=new Integer(100);
        Integer i2=100;
        System.out.println("i1和i2"+(i1==i2));
        //>false

        Integer i3=new Integer(200);
        Integer i4=new Integer(200);
        System.out.println("i3和i4"+(i3==i4));
        //>false

        Integer i5=new Integer(300);
        int i6=300;
        System.out.println("i5和i6"+(i5==i6));
        //>true

        Integer i7=new Integer(15);
        int i8=15;
        System.out.println("i7和i8"+(i7.equals(i8)));
        //>true

        Integer i9=10;
        Integer i10=10;
        System.out.println("i9和i10"+(i9==i10));
        //>true

        Integer i11=250;
        Integer i12=250;
        System.out.println("i11和i12"+(i11==i12));
        //>false

        Integer i13=Integer.valueOf(-128);
        Integer i14=Integer.valueOf(-128);
        System.out.println("i13和i14"+(i13==i14));
        //>true

        Integer i15=Integer.valueOf(450);
        Integer i16=Integer.valueOf(450);
        System.out.println("i15和i16"+(i15==i16));
        //>false

    }
}
