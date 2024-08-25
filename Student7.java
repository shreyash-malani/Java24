import java.util.*;
//use of Comparable interface
//java.lang is default package which has Comparable interface 
public class Student7 implements Comparable<Student7>,Comparator <Student7>
{
    int no;
    String nm;
    double mrk;
    Student7()
    {
        no=0;
        mrk=0.0;
        nm=new String(); 
    }
    Student7(int a,String b,double c)
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
    public int compareTo(Student7 a)
    {
        return no-a.no;
    }
    public int compare(Student7 a,Student7 b)
    {
        Double p=new Double(a.mrk);
        Double q=new Double (b.mrk);
        return p.compareTo(q);  
    }
    public static Comparator<Student7> ByNameNo =new Comparator<Student7>()
    {
        public int compare(Student7 a,Student7 b)
        {   
            int val=(a.nm).compareTo(b.nm);
            if(val==0)
                return (a.no-b.no);    
            else    
                return val;
        }
    };
    public static void main(String [] args)
    {
        Student7 [] k=new Student7 [5];
        k[0]=new Student7(13,"Kunal",9.2);
        k[1]=new Student7(14,"Viraj",5.2);
        k[2]=new Student7(11,"Sai",2.3);
        k[3]=new Student7(1,"Sai",9.8);
        k[4]=new Student7(17,"Sujata",5.4);
        // System.out.println(Arrays.toString(k));
        // Arrays.sort(k);  //Comparable
        System.out.println(Arrays.toString(k));
        Arrays.sort(k,Student7.ByNameNo);
        System.out.println(Arrays.toString(k));
    }
}
