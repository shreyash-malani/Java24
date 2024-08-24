import javax.swing.*;
import java.util.*;
//use of Comparable interface
//java.lang is default package which has Comparable interface 
public class Student5 implements Comparable<Student5>
{
    int no;
    String nm;
    Student5()
    {
        no=0;
        nm=new String(); 
    }
    Student5(int a,String b)
    {
        no=a;
        nm=b;
    }
    public String toString()
    {
        return "\nNo:"+no+"\nName:"+nm;
    }
    void display()
    {
        System.out.println(toString());
    }
    public int compareTo(Student5 a)
    {
        int val=nm.compareTo(a.nm);
        if(val==0)
            return a.no;
        return val;
    }
    public static void main(String [] args)
    {
        Student5 [] k=new Student5 [5];
        k[0]=new Student5(13,"Kunal");
        k[1]=new Student5(14,"Viraj");
        k[2]=new Student5(11,"Sai");
        k[3]=new Student5(1,"Sai");
        k[4]=new Student5(17,"Sujata");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}
