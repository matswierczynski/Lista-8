package com.company;

public class Main {

    public static void main(String[] args) {
        SortArray sortArray = new SortArray(); //tablica wartości do posortowania

  /*Shell Sort metodą: Insert sort co "h" i co "1"*/
        InsertSort insertsort;
        int [] result;

        insertsort = new InsertSort(sortArray.getRandomArray(), 1);
        result = insertsort.createSubstring();
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);

        insertsort = new InsertSort(sortArray.getRandomArray(), 2);
        result = insertsort.createSubstring();

        insertsort = new InsertSort(sortArray.getRandomArray(), 3);
        result = insertsort.createSubstring();


        insertsort = new InsertSort(sortArray.getRandomArray(), 4);
        result = insertsort.createSubstring();


        /*Shell Sort metodą: Insert sort co "h" i bubble sort co "1"*/
        InsertBubbleSort insertBubbleSort;
         insertBubbleSort= new InsertBubbleSort(sortArray.getRandomArray(), 1);
        result = insertBubbleSort.createSubstring();
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);

        insertBubbleSort = new InsertBubbleSort(sortArray.getRandomArray(), 2);
        result = insertBubbleSort.createSubstring();

       insertBubbleSort = new InsertBubbleSort(sortArray.getRandomArray(), 3);
        result = insertBubbleSort.createSubstring();

        insertBubbleSort = new InsertBubbleSort(sortArray.getRandomArray(), 4);
        result = insertBubbleSort.createSubstring();

        /*Shell Sort metodą: Bubble sort co "h" i Insert sort co "1"*/
        BubbleInsertSort bubbleInsertSort;
        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 1);
        result = bubbleInsertSort.createSubstring();
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);

        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 2);
        result = bubbleInsertSort.createSubstring();

        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 3);
        result = bubbleInsertSort.createSubstring();

        bubbleInsertSort = new BubbleInsertSort(sortArray.getRandomArray(), 4);
        result = bubbleInsertSort.createSubstring();

    }

}
