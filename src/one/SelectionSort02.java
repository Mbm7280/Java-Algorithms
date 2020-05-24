package one;

public class SelectionSort02 {

    private SelectionSort02(){}


    public static void sort(Comparable[] arr){

        int n = arr.length;
        for (int i = 0;i < n;i++){

            int minIndex = i;
            for(int j = i + 1;j < n;j++){
                // 使用 compareTo 方法比较两个Compareable的大小
                if(arr[j].compareTo( arr[minIndex]) < 0){
                    minIndex = j;
                }
                swap(arr,i,minIndex);
            }
        }
    }

    private static void swap(Object[] arr,int i,int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort02.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
            System.out.println(" ");
        }
        System.out.println();
    }



}
