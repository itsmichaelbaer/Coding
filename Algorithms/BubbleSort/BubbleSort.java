public class BubbleSort
{
//A very rudimentary way of sorting integers (optimized with boolean) in O(n^2)

//iterative
public static int[] sortIterative(int[] arr)
{
  boolean sorted = false;
  for(int i = 0; i < arr.length-1; i++)
  {
    sorted=true;
    for(int j = 0; j < arr.length-i-1; j++ )
    {
      if(arr[j] > arr[j+1])
        {
          //swap values
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          sorted = false;
        }
    }
    if(sorted) break;
  }
  return arr;
}

//recursive
public static void sortRecursive(int[] arr, int n)
{
  //base case
  if(n == 1)
    return;

  boolean sorted = true;

  for(int i = 0; i < n-1; i++)
  {
    if(arr[i] > arr[i+1])
    {
      int temp = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = temp;
      sorted = false;
    }
  }
  if(sorted) return;
  sortRecursive(arr, n-1);
}
}
