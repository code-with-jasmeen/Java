package sorting;

public class SelectionSort2
{
    public static int findSmallestValueindex( int arr[] , int i )
    {
        int minIndex = i ;
        for( int j = i + 1 ; j < arr.length ; j++ )
        {
            if( arr[i] > arr[j] )
            {
                minIndex = j ;
                i = j ;
            }
        }
        return minIndex;
    }
    public static void main(String[] args)
    {
        int arr[] = { 7 , 8 , 3 , 1 , 2 };
        int i , j ;
        for( i = 0 ; i < arr.length ; i++ )
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for( i = 0 ; i < arr.length-1 ; i++ )
        {
            int minIndex = findSmallestValueindex(arr,i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for( i = 0 ; i < arr.length ; i++ )
        {
            System.out.print(arr[i] + " ");
        }
    }
}
