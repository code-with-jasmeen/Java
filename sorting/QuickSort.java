package sorting;

public class QuickSort
{
    public static void quicksort(int arr[] ,int low , int high )
    {
        if( low < high)
        {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1 , high);
        }
    }
    public static int partition( int arr[], int low , int high )
    {
        int pivot = arr[high];
        int i = low - 1;
        for( int j = low ; j < high ; j++ )
        {
            if( arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void main(String[] args)
    {
        int arr[] = { 2 , 4 , 5 , 1 , 3 };
        int i ;
        System.out.println("before sorting : ");
        for( i = 0 ; i < arr.length ; i++ )
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quicksort(arr , 0 , arr.length-1);
        System.out.println("after sorting : ");
        for( i = 0 ; i < arr.length ; i++ )
        {
            System.out.print(arr[i] + " ");
        }
    }
}
