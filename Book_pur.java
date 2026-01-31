//same program to Student1... 

import javax.swing.*;
public class Book_pur 
{
    int no;
    String nm;
    double pr;
    

    Book_pur() 
    {
        no=0;
        nm=new String();
        pr=0.0;
    }

    public String toString()
    {
        String s="No:"+no+"\n"+"Name:"+nm+"\n"+"Price:"+pr;
        return s;
    }

    void setData(int no)
    {
        this.no=no;
        try{
            nm=JOptionPane.showInputDialog(null,"Book Name:");
            pr=Double.parseDouble(JOptionPane.showInputDialog(null,"Price:"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid");
        }
    }

    void display(){
        JOptionPane.showMessageDialog(null, toString());
    }
   
    public static void main(String [] args)
    {
        
    
    Book_pur[]c=new Book_pur[2];
    int i=0;
    double total=0;
    while(i<c.length)
    {
        c[i]=new Book_pur();
        c[i].setData(i+1);
        total += c[i].pr;
        i++;
    }
    for (i=0;i<2;i++)
    {
        c[i].display();
    }
    
    JOptionPane.showMessageDialog(null, "Total:"+total,"Total",i);

    } 
}