package com.company;
import java.util.ArrayList;
import java.util.Stack;

public class InsertBubbleSort {
    private int[] array;
    private int size;
    private Stack<Integer> stack = new Stack<>();

    public InsertBubbleSort(int [] arrToSort, int choice){
        array = new int [arrToSort.length];
        System.arraycopy(arrToSort, 0, array, 0, arrToSort.length);
        size = array.length;
        stack.push(1);
        maxSet(choice);
    }

    private void maxSet(int choice) {
        int last = 1;
        switch (choice) {
            case 1: {
                while (3 * (3 * last + 1) < size) {
                    last = 3 * last + 1;
                    stack.push(last);
                }
                break;
            }

            case 2: {
                int raise = 4;
                while (3 * (raise - 1) < size) {
                    stack.push(raise - 1);
                    raise *= 2;
                }
                break;
            }

            case 3: {
                int raise = 2;
                while (3 * (raise + 1) < size) {
                    stack.push(raise + 1);
                    raise *= 2;
                }
                break;
            }

            case 4: {
                int prev = 1;
                int cur = 1;
                while (3 * (prev + cur) < size) {
                    int sum = prev + cur;
                    prev = cur;
                    cur = sum;
                    stack.push(sum);
                }
                break;
            }
        }
    }

    public int[] createSubstring() {
        ArrayList<Integer> arrList = new ArrayList<>();
        while (stack.peek()>1) { //dla malejących kolejno przyrostów
            int currentGap = stack.pop();
            for (int i = 0; i < currentGap; i++) {
                arrList.clear();
                for (int j = i; j < size; j += currentGap) { //wstawiaj kolejne elementy na podlistach
                    arrList.add(array[j]);
                }
                Integer[] arr = arrList.toArray(new Integer[arrList.size()]);
                arr = Insertsort(arr);
                for (int j = i, k = 0; j < size; j += currentGap, k++)
                    array[j] = arr[k];
            }
        }
        BubbleSort(array);
        return array;
    }



    private Integer [] Insertsort(Integer [] array)
    {
        int i,j,k;
        Integer elem;
        for(i=1;i<array.length;i++)
        {
            j=0;
            elem=array[i]; // i-th element will be added
            while(j<i && array[j]<=elem)// search first greater
                j++;
            for(k=i;k>j;k--) // shift elements
                array[k]=array[k-1];
            array[j]=elem;

        }

        return array;
    }

    private int [] BubbleSort(int [] array) {

            for (int i=1;i<array.length;i++)
                for(int k=0;k<array.length-i;k++)
                {
                    if (Comparator.compare(array[k],array[k+1])==-1)
                        swap(k,k+1);
                }
            return array;
        }


        private void swap(int leftIndex, int rightIndex){
            int temp = array[leftIndex];
            array[leftIndex]=array[rightIndex];
            array[rightIndex]=temp;
        }
    }