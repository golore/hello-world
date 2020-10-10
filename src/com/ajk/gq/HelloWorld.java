package com.ajk.gq;

public class HelloWorld {
    public static void main(String[] args) {

        float a=0;
        int b=0;

        System.out.print(a==b);
        for(int i=0;i<2;i++){
            for (int j=0;j<10000000;j++){
                a++;
                b++;
            }
            System.out.println("-----");
            System.out.println(a == b);

            System.out.println(a);
            System.out.println(b);
        }

    }
}
