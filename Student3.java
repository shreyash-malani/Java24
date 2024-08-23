import javax.swing.*;
import java.util.*;
//use of Comparable interface
//java.lang is default package which has Comparable interface 
public class Student3 implements Comparable<Student3>
{
    int no;
    String nm;
    Student3()
    {
        no=0;
        nm=new String(); 
    }
    Student3(int a,String b)
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
    public int compareTo(Student3 a)
    {
        return no-a.no;
    }
    public static void main(String [] args)
    {
        Student3 [] k=new Student3[5];
        k[0]=new Student3(13,"Kunal");
        k[1]=new Student3(14,"Viraj");
        k[2]=new Student3(11,"Sai");
        k[3]=new Student3(1,"Sunil");
        k[4]=new Student3(17,"Sujata");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}
