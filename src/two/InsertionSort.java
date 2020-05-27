package two;

import common.SortHelper;

// 2020-05-27 插入排序
public class InsertionSort {

    private InsertionSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;

        for(int i = 0;i < n;i++){

            for(int j = i;j > 0;j--){
                if(arr[j].compareTo(arr[j - 1]) < 0){
                    swap(arr,j,j - 1);
                }
            }

        }
    }

    public static void swap(Object[] arr,int i,int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int N = 20000;
        Integer[] arr = SortHelper.genereateRandomArray(N,0,100000);
        SortHelper.printArray(arr);
        SortHelper.testSort("two.InsertionSort",arr);
        return;
    }


}
