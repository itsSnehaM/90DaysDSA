public class rec_prb1 {
    static void reverseArray(int ar[], int start, int end)
    {
      int temp;
      if (start >= end)
        return;
      temp = ar[start];
      ar[start] = ar[end];
      ar[end] = temp;
      reverseArray(ar, start + 1, end - 1);
    }
    static void printArray(int ar[], int size)
    {
      for (int i = 0; i < size; i++)
        System.out.print(ar[i] + " ");
      System.out.println("");
    }
    public static void main (String[] args)
    {
      int arr[] = {1, 2, 3, 4, 5, 6};
      printArray(arr, 6);
      reverseArray(arr, 0, 5);
      // System.out.println("Reversed array is ");
      printArray(arr, 6);
    }
  }