package org.example;

import java.util.ArrayList;

public class LessThanFilter implements Filter{
    public ArrayList<Integer> filter(int[] arr, int number){
        ArrayList<Integer> anotherArray = new ArrayList<Integer>();
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]<number){
                anotherArray.add(arr[i]);
            }
        }
        return anotherArray;

    }
}
