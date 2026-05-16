package sorting;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int i , j ;
        int min , temp ;
        int arr[] = { 5 , 4 , 3 , 2 , 1 };
                for( i = 0 ; i < arr.length ; i++ )
                {
                    min = i;
                    for( j = i+1 ; j < arr.length  ; j++)
                    {
                        if( arr[j] <arr[min] )
                        {
                            min = j;
                        }
                    }
                    if( i != min)
                    {
                        temp = arr[i];
                        arr[i] = arr[min];
                        arr[min] = temp;
                    }
                }
                for( i = 0 ; i < arr.length ; i++ )
                {
                    System.out.println(arr[i]);
                }
    }
}
