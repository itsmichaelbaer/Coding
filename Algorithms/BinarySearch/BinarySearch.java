public class BinarySearch
{
//iterative and recursive method of searching a sorted list of integers in O(log n)
  
  //iterative method  
  public static int searchIterative(int[] arr, int target)
  {
    int left = 0, right = arr.length-1;
  
    while(left <= right)
    {
      int mid = left + (right - left) / 2
      
      if (target < arr[mid]) right = mid -1;
    
      else if (target > arr[mid]) left = mid + 1;
    
     else return mid;
    }
    return -1;
  }

  //recursive method
  public static int searchRecursive(int[] arr, int left, int right, int target)
  {
    if(left > right)
      return -1;
  
    int mid = left + (right - left) / 2
    
    if(target == arr[mid])
      return mid;
  
    if(target < arr[mid])
      return searchRecursive(arr, left, mid-1, target);
  
    if(target > arr[mid])
      return searchRecursive(arr, mid + 1, right, target);
  }
}
