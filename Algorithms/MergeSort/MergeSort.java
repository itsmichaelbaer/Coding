public class MergeSort
{
//recursive "divide and conquer" algorithm to sort integer values in O(nlogn)
//call sort(arr, 0, arr.length-1)
  public static void merge(int[] arr, int l, int m, int r)
  {
    int n1 = m - l + 1;//size of first subarray
    int n2 = r - m;//size of second subarray

    //create subarrays
    int[] L = new int[n1];
    int[] R = new int[n2];

    //copy data to temp array
    for(int i = 0; i < n1; i++)
      L[i] = arr[l+i];
    for(int j = 0; j < n2; j++)
      R[j] = arr[m+1+j];


    int i = 0, j = 0, k = 1;//initial indexes of subarrays and merged array

    while(i < n1 && j < n2)//merge arrays(in sorted order)
    {
      if(L[i] <= R[j])
      {
        arr[k] = L[i];
        i++;
      }

      else
      {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while(i <  n1)//copy remaining elements from L[]
    {
      arr[k] = L[i];
      i++;
      k++;
    }

    while(j <  n2)//copy remaining elements from R[]
    {
      arr[k] = R[i];
      j++;
      k++;
    }
  }

  //recursive
  public static void sortRecursive(int[] arr, int l, int r)
  {
    if(r>l)
    {
      int m = (l+r)/2;//find middle
      sortRecursive(arr, l, m);//sort half
      sort(arr, m+1, r);//sort other half
      MergeSort.merge(arr, l, m, r);//merge halves
    }
  }
}
