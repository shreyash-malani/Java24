import java.util.*;

public class MergeSortedArrays 
{
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 7};

        List<Integer> merged = new ArrayList<>();

        int i=0 ,j=0;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                merged.add(arr1[i]);
                i++;
            }
            else
            {
                merged.add(arr2[j]);
                j++;
            }
        }
        // Add remaining elements from arr1
        while(i<arr1.length)
        {
            merged.add(arr1[i]);
            i++;
        }
        // Add remaining elements from arr2
        while(j<arr2.length)
        {
            merged.add(arr2[j]);
            j++;
        }
        int x=merged.size();

        int [] marray=new int [x];
        for(int k=0;k<x;k++)
        {
            marray[k]=merged.get(k);
        }
        // Print merged array
        System.out.println("Merged list: " +merged);
        System.out.println("Merged array: " +Arrays.toString(marray));
    }
}
