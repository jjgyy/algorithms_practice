package 算法导论.归并排序;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] num = new int[]{99, 13, 28, 9, 74, 12, 0, -5, 22, 13};
        System.out.println(Arrays.toString(num));

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(num, 0, num.length-1);

        System.out.println(Arrays.toString(num));

    }

    private void mergeSort (int[] array, int begin, int end) {

        if (begin >= end) return;

        int middle = (begin + end) / 2;
        mergeSort(array, begin, middle);
        mergeSort(array, middle+1, end);
        merge(array, begin, middle, end);
    }

    private void merge (int[] array, int begin, int middle, int end) {

        int n1 = middle - begin + 1,
            n2 = end - middle;
        int[] left = new int[n1 + 1],
              right = new int[n2 + 1];


        for (int i=0; i<n1; i++) {
            left[i] = array[begin + i];
        }
        left[n1] = Integer.MAX_VALUE;

        for (int j=0; j<n2; j++) {
            right[j] = array[middle + j + 1];
        }
        right[n2] = Integer.MAX_VALUE;


        int i = 0, j = 0;
        for (int k=begin; k<=end; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }


    }
}

