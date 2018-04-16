import java.util.Arrays;

public class InsertionSort
{
//iterative and recursive method of sorting integer values in O(n^2), can be optimized as BinaryInsertionSort

  //iterative
  public static int[] sortIterative(int[] arr)
  {
    for(int i = 1; i < arr.length; i++)
    {
      int temp = arr[i];//store current position
      int j = i - 1;//get index before
      while(arr[j] > temp && j >= 0)//compare current to previous positions
      {
        arr[j+1] = arr[i];//shift numbers forward
        j--;
      }
      arr[j+1] = temp;//insert temp at correct pos
    }
    return arr;
  }


  //recursive
  public static void sortRecursive(int[] arr, int n)
  {
    //base case
    if(n <= 1)
      return;

    sortRecursive(arr, n-1);//recursively sort

    int temp = arr[n-1];//store current position
    int j = n - 2;//get index before

    while(j >= 0 && arr[j] > temp)
    {
      arr[j+1]=arr[j];//shift numbers forward
      j--;
    }
    arr[j+1] = temp;//insert temp at correct position
  }
}
