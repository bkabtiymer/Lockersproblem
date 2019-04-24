package com.company;

public class Main {

    public static void main(String[] args) {

        boolean lockers[] = new boolean[100];
//       true=open false=closed
//      First, Close all 100 lockers
        for (int i = 1; i < lockers.length; i++) {
            lockers[i] = false;
        }

//        Close every locker
        for (int j = 1; j<=lockers.length; j++) {

//            k=k+j is the same as k+=j
            for (int k = j; k<=lockers.length; k+=j)
            {

                if (lockers[k-1] == true) {
                    lockers[k-1] = false;

                } else {
                    lockers[k-1] = true;
                }
            }
        }

//        For every locker in lockers
            for (int p=0;p<lockers.length;p++)

            {
                if (lockers[p] == true) {
                    System.out.println("Locker is open at " + p);

                }
            }

    }
}