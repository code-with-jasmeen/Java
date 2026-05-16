package sorting;

public class InsertionSort
{
    public static void main(String[] args)
    {
         int i , j ;
         int arr[] = { 5 , 4 ,3 , 2 , 1 };
        System.out.println("before sorting : ");
         for( i = 0 ; i < arr.length ; i++ )
         {
             System.out.print(arr[i] + " ");
         }
        System.out.println();
         for( i = 1 ; i < arr.length ; i++ )
         {
             int value = arr[i];
             j = i - 1 ;
             while( j >= 0 && arr[j] > value )
             {
                 arr[j+1] = arr[j];
                 j = j - 1 ;
             }
             arr[j+1] = value;
         }
        System.out.println("after sorting : ");
         for( i = 0 ; i < arr.length ; i++ )
         {
             System.out.print( arr[i] + " ");
         }
    }
}
