import java.util.*;
public class Itrerator 
{
   public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        LinkedList<String>ls=new LinkedList<>();
        System.out.println("Enet how many elemnets in the array; ");
        int n=sc.nextInt();
        System.out.println("Enter the elemnets in the array: ");
        for(int i=0;i<n;i++)
        {
            ls.add(sc.next());
        }
        System.out.println(ls);

        Iterator it=ls.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
   } 
}
