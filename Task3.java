// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class Task3 {

    public static void main(String args[])
    {
        int arr[] = {16, 8, 13, -1, 5, 6, 10, 27, 7, 4, 0};

        System.out.println("До сортировки: ");
        printArray(arr);
        System.out.println();
        SortArr(arr);
        System.out.println("После сортировки: ");
        printArray(arr);
    }

    public static void SortArr(int arr[])
    {
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            HeapSort(arr, arr.length, i);
        for (int i=arr.length-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            HeapSort(arr, i, 0);
        }
    }

    public static void HeapSort(int arr[], int n, int i)
    {
        int upEl = i; 
        int downFirst = 2*i + 1; 
        int downSecond = 2*i + 2; 

        if (downFirst < n && arr[downFirst] > arr[upEl]) upEl = downFirst;

        if (downSecond < n && arr[downSecond] > arr[upEl]) upEl = downSecond;

        if (upEl != i)
        {
            int temp = arr[i];
            arr[i] = arr[upEl];
            arr[upEl] = temp;
            HeapSort(arr, n, upEl);
        }
    }

    static void printArray(int arr[])
    {
        for (int i=0; i<arr.length; ++i) System.out.print(arr[i]+" ");
    }

}
