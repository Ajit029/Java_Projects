package com.ajit.javatestfiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCopy {

    public void output(){
        List<Integer> originalList = new ArrayList<>();

        for (int i = -4; i < 87; i += 9){
            originalList.add(i);
        }

        List<Integer> copyOfOriginalList = new ArrayList<>(List.copyOf(originalList));
        Collections.reverse(copyOfOriginalList);
        System.out.println(originalList);
        System.out.println(copyOfOriginalList);
    }
}
