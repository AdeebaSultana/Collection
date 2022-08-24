package com.collection.oracle;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Adeeba");
        arrayList.add("Faizaan");

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(31);

        System.out.println(arrayList1);
        System.out.println(arrayList1.contains(31));

        for(Integer str : arrayList1) {
            System.out.println(str);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(12);
        arrayList2.add("Adizaan");

        int x = 5;
        Integer integer = new Integer(x);

    }
}
