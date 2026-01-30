import javax.swing.*;
import java.util.*;
import java.util.Arrays;
interface Int1
{
    void setData();
    void display();
}
interface Int2
{
    int total();
    int average();
}
interface Int3
{
    int findMin();
    int findMax();
    double findMedian();
} 
interface Int4 extends Int2,Int3
{
    int size=5;
}
public class Inter4Imp4 implements Int1,Int4
{
    int [] arr;
    Inter4Imp4()
    {
        arr=new int[size];
    }
    public int total()
    {
        int i=1,tot=arr[0];
        while(i<size)
        {
            tot+=arr[i];
            i++;
        }
        return tot;
    }
    public int average()
    {
        return total()/size;
    }
    public int findMax()
    {
        int max=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]>max)
                max=arr[i];
            i++;
        }
        return max;
    }
    public int findMin()
    {
        int min=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]<min)
                min=arr[i];
            i++;
        }
        return min;
    }
    public double findMedian() 
    {
        // Clone the array to avoid modifying the original one
        int[] sortedArr = arr.clone();
        
        // Sort the cloned array
        Arrays.sort(sortedArr);
        
        // Check if the size of the array is even or odd
        if (size % 2 == 0) 
        {
            // If even, return the average of the two middle elements
            return (sortedArr[size / 2 - 1] + sortedArr[size / 2]) / 2.0;
        } 
        else 
        {
            // If odd, return the middle element
            return sortedArr[size / 2];
        }
    }
    public void setData()
    {
        int i=0;
        while(i<size)
        {
            try
            {
                arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Data:"));
                i++;
            }
            catch(Exception e){}
        } 
    }
    public String toString()
    {
        String s="\n Data:"+Arrays.toString(arr)+"\nTotal:"+total()+"\nAverage:"+average()+"\n Max Value:"+findMax()+"\n Min Value:"+findMin()+"\nMedian Value"+findMedian();
        return s;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public static void main(String [] args)
    {
        Inter4Imp4 a=new Inter4Imp4();
        a.setData();
        a.display();
    }
}
/*
 * Median: (3 + 4) / 2 = 3.5 (the average of the third and fourth elements) for even size 
  
 * Odd Number of Elements:

    Data set: [3, 1, 4, 1, 5]
    Sorted data set: [1, 1, 3, 4, 5]
    Median: 3 (the third element, which is the middle one)

    *Example 2: Even Number of Elements
    Original Array: [3, 1, 4, 1, 5, 9]
    Sorted Array: [1, 1, 3, 4, 5, 9]
    size: 6 (even)
    Lower Middle Index: 6 / 2 - 1 = 2
    Upper Middle Index: 6 / 2 = 3
    Median Value: (sortedArr[2] + sortedArr[3]) / 2.0 = (3 + 4) / 2.0 = 3.5
 */