import java.util.*;
//use of Comparable interface
//java.lang is default package which has Comparable interface 
public class Student6 implements Comparable<Student6>,Comparator <Student6>
{
    int no;
    String nm;
    double mrk;
    Student6()
    {
        no=0;
        mrk=0.0;
        nm=new String(); 
    }
    Student6(int a,String b,double c)
    {
        no=a;
        nm=b;
        mrk=c;
    }
    public String toString()
    {
        return "\nNo:"+no+"\nName:"+nm+"\nMarks"+mrk;
    }
    void display()
    {
        System.out.println(toString());
    }
    public int compareTo(Student6 a)
    {
        return no-a.no;
    }
    public int compare(Student6 a,Student6 b)
    {
        Double p=new Double(a.mrk);
        Double q=new Double (b.mrk);
        return p.compareTo(q);
         
    } 
    public static void main(String [] args)
    {
        Student6 [] k=new Student6 [5];
        k[0]=new Student6(13,"Kunal",9.2);
        k[1]=new Student6(14,"Viraj",5.2);
        k[2]=new Student6(11,"Sai",2.3);
        k[3]=new Student6(1,"Sai",9.8);
        k[4]=new Student6(17,"Sujata",5.4);
        // System.out.println(Arrays.toString(k));
        // Arrays.sort(k);  //Comparable
        System.out.println(Arrays.toString(k));
        Arrays.sort(k,new Student6());
        System.out.println(Arrays.toString(k));
    }
}
