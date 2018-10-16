package 算法导论.快速排序;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] num = new int[]{99, 13, 28, 9, 74, 12, 0, -5, 22, 13};
        System.out.println(Arrays.toString(num));

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(num, 0, num.length-1);

        System.out.println(Arrays.toString(num));

    }


    private void quickSort(int[] array, int begin, int end) {

        if (begin >= end) return;

        int middle = partition(array, begin, end);
        quickSort(array, begin, middle-1);
        quickSort(array, middle+1, end);
    }


    private int partition(int[] array, int begin, int end) {

        int x = array[end],
            i = begin - 1;

        int temp;
        for (int j=begin; j<end; j++) {
            if (array[j] <= x) {
                i ++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        array[end] = array[i+1];
        array[i+1] = x;

        return (i + 1);
    }


}
