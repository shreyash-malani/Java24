<<<<<<< HEAD
import javax.swing.*;
public class Student1 
{
    int no;
    String nm;
    double mrk;
    Student1()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student1(int a,String b,double c)
    {
        no=a;
        nm=b;
        mrk=c;
    }
    int getNo(){return no;}
    double getMarks(){return mrk;}
    String getName(){return nm;} 
    public String toString()
    {
        String s="Roll no:"+no+"\n Name:"+nm+"\n Marks:"+mrk;
        return s;
    }
    void setData(int no)
    {
        this.no=no;
        try
        {
            nm=(JOptionPane.showInputDialog(null,"Name:"));
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"Marks"));
        }
        catch(Exception e){}
    }
    void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll No:"));
            nm=JOptionPane.showInputDialog(null,"Name");
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"Marks:"));
        }
        catch(Exception e){}
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }

    // public static void main(String [] args)
    // {
    //     Student1 a=new Student1();   // Student()1 is a constructor
    //     a.setData(101,"Niraj");
    //     a.display();
    // }

    // public static void main(String [] args)
    // {
    //     Student1 b=null; //b is refrernce variable refers to object of type Student1 and no constructor is called   
    //     b=new Student1 (6,"Ravi",9.2);
    //     b.display();                            //this is called when we use parametrized constructor
    // }
     
    public static void main(String [] args)
    {
        Student1 [] c=new Student1[5];  //Array of class type Student1 
        int i=0; 
        while(i<c.length)
        {
            c[i]=new Student1();
            c[i].setData(i+1);
            i++;
        }
        for(i=0;i<5;i++)
            c[i].display();
    }
   
}
=======
import javax.swing.*;
public class Student1 
{
    int no;
    String nm;
    double mrk;
    Student1()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student1(int a,String b,double c)
    {
        no=a;
        nm=b;
        mrk=c;
    }
    int getNo(){return no;}
    double getMarks(){return mrk;}
    String getName(){return nm;} 
    public String toString()
    {
        String s="Roll no:"+no+"\n Name:"+nm+"\n Marks:"+mrk;
        return s;
    }
    void setData(int no)
    {
        this.no=no;
        try
        {
            nm=(JOptionPane.showInputDialog(null,"Name:"));
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"Marks"));
        }
        catch(Exception e){}
    }
    void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll No:"));
            nm=JOptionPane.showInputDialog(null,"Name");
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"Marks:"));
        }
        catch(Exception e){}
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }

    // public static void main(String [] args)
    // {
    //     Student1 a=new Student1();   // Student()1 is a constructor
    //     a.setData(101,"Niraj");
    //     a.display();
    // }

    // public static void main(String [] args)
    // {
    //     Student1 b=null; //b is refrernce variable refers to object of type Student1 and no constructor is called   
    //     b=new Student1 (6,"Ravi",9.2);
    //     b.display();                            //this is called when we use parametrized constructor
    // }
     
    public static void main(String [] args)
    {
        Student1 [] c=new Student1[5];  //Array of class type Student1 
        int i=0; 
        while(i<c.length)
        {
            c[i]=new Student1();
            c[i].setData(i+1);
            i++;
        }
        for(i=0;i<5;i++)
            c[i].display();
    }
   
}
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
