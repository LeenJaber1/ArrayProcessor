package org.example;
import java.util.*;

import java.util.ArrayList;

public class ArrayProcessor {
    private Sort sortingStrategy;
    private Filter filterStrategy;
    private Search searchStrategy;

    public ArrayProcessor(Sort sortingStrategy, Filter filterStrategy, Search searchStrategy) {
        this.sortingStrategy = sortingStrategy;
        this.filterStrategy = filterStrategy;
        this.searchStrategy = searchStrategy;
    }

    public void setSortingStrategy(Sort sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setFilterStrategy(Filter filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setSearchStrategy(Search searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void sort(int[] arr ){
        sortingStrategy.sort(arr);

    }
    public ArrayList<Integer> filter(int[] arr , int number){
        return filterStrategy.filter(arr , number);
    }
    public int search(int[] arr , int target){
        return searchStrategy.search(arr, target);
    }
    public static void main(String[] args) {
        ArrayProcessor processor1 = new ArrayProcessor(new MergeSort() , new GreaterThanFilter() , new LinearSearch());
        ArrayProcessor processor2 = new ArrayProcessor(new BubbleSort() , new GreaterThanFilter() , new BinarySearch());
        ArrayProcessor processor3 = new ArrayProcessor(new InsertionSort(), new LessThanFilter() , new LinearSearch());

        int[] array1 = {9,8,7,6,5,4,3,2,1};

        int[] array2 = {9,8,6,5,4,3,2};

        int[] array3 =  {9,8,7,5,3,2,1};

        System.out.println("Index of 4 using linear search: "+ processor1.search(array1 , 4));
        System.out.println("Index of 5 using Binary search: "+ processor2.search(array2 , 5));
        System.out.println();

        ArrayList<Integer> greaterThan = processor1.filter(array1 , 4);
        ArrayList<Integer> lessThan = processor3.filter(array3 , 7);
        System.out.println("Filtering using Greater than : ");
        for(int i = 0 ; i<greaterThan.size() ; i++){
            System.out.print(greaterThan.get(i) + " ");
        }
        System.out.println();
        System.out.println("Filtering using Less than : ");

        for(int i = 0 ; i<lessThan.size() ; i++){
            System.out.print(lessThan.get(i) + " ");
        }

        System.out.println();
        System.out.println("Sorting using Bubble Sort: ");
        processor2.sort(array1);
        for(int i = 0 ; i<array1.length ; i++){
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println("Sorting using Merge Sort: ");
        processor1.sort(array2);
        for(int i = 0 ; i<array2.length ; i++){
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        System.out.println("Sorting using Insertion Sort: ");
        processor3.sort(array3);
        for(int i = 0 ; i<array3.length ; i++){
            System.out.print(array3[i] + " ");
        }








    }
}