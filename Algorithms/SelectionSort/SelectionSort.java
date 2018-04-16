public class SelectionSort
{
  //iterative soring algorithm for integers in O(n^2)
  
  public static int[] sort(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      int min=i;

      for(int j = i; j < arr.length; j++)
      {
        if(arr[j]<arr[min])
          min=j;//store min index
      }
      //swap values
      int temp=arr[i];
      arr[i]=arr[min];
      arr[min]=temp;
    }
    return arr;
  }
}
