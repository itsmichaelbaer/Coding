public class InsertionSort
{
//iterative method of sorting integer values in O(n^2), can be optimized as BinaryInsertionSort

  public static int[] sort(int[] arr)
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
}
