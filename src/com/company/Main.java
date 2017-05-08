package com.company;

public class Main {

    public static void main(String[] args) {
        SortArray sortArray = new SortArray(); //tablica wartości do posortowania

  /*Shell Sort metodą: Insert sort co "h" i co "1"*/
        InsertSort insertsort;
        int [] result;

        long begin = System.nanoTime();
        insertsort = new InsertSort(sortArray.getRandomArray(), 1);
        result = insertsort.createSubstring();
        long period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i co 1, 3h+1:  "+period);

        begin = System.nanoTime();
        insertsort = new InsertSort(sortArray.getRandomArray(), 2);
        result = insertsort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i co 1, 2^k-1:  "+period);

        begin = System.nanoTime();
        insertsort = new InsertSort(sortArray.getRandomArray(), 3);
        result = insertsort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i co 1, 2^k+1:  "+period);

        begin = System.nanoTime();
        insertsort = new InsertSort(sortArray.getRandomArray(), 4);
        result = insertsort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i co 1, Fibonacci:  "+period);


        /*Shell Sort metodą: Insert sort co "h" i bubble sort co "1"*/
        InsertBubbleSort insertBubbleSort;

        begin = System.nanoTime();
         insertBubbleSort= new InsertBubbleSort(sortArray.getRandomArray(), 1);
        result = insertBubbleSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i Bubble Sort co 1, 3h+1:  "+period);

        begin = System.nanoTime();
        insertBubbleSort = new InsertBubbleSort(sortArray.getRandomArray(), 2);
        result = insertBubbleSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i Bubble Sort co 1, 2^k-1:  "+period);

        begin = System.nanoTime();
        insertBubbleSort = new InsertBubbleSort(sortArray.getRandomArray(), 3);
        result = insertBubbleSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i Bubble Sort co 1, 2^k+1:  "+period);

        begin = System.nanoTime();
        insertBubbleSort = new InsertBubbleSort(sortArray.getRandomArray(), 4);
        result = insertBubbleSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Insert Sort co \"h\" i Bubble Sort co 1, Fibonacci:  "+period);

        /*Shell Sort metodą: Bubble sort co "h" i Insert sort co "1"*/
        BubbleInsertSort bubbleInsertSort;

        begin = System.nanoTime();
        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 1);
        result = bubbleInsertSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Bubble Sort co \"h\" i Insert Sort co 1, 3h+1:  "+period);

        begin = System.nanoTime();
        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 2);
        result = bubbleInsertSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Bubble Sort co \"h\" i Insert Sort co 1, 2^k-1:  "+period);

        begin = System.nanoTime();
        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 3);
        result = bubbleInsertSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Bubble Sort co \"h\" i Insert Sort co 1, 2^k+1:  "+period);

        begin = System.nanoTime();
        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 4);
        result = bubbleInsertSort.createSubstring();
        period = System.nanoTime() - begin;
        System.out.println("Bubble Sort co \"h\" i Insert Sort co 1, Fibonacci:  "+period);

    }

}
