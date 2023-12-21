package org.example;

public class LinearSearch implements Search{
    public int search(int[] arr, int target){
        int index=0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                index = i; break;
            }
        }


        return index;
    }
}
