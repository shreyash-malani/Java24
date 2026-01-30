public class A8_App8 
{
    public static void main(String [] args)
    {
        int n=(int)(Math.random()*100);
        System.out.println("No:"+n);

        String str=Integer.toBinaryString(n);   //toBinaryString is a static mathod of class Interger in Java which converts n i.e random number to binary form 
        System.out.println("Binary String:"+str);
        
        str=Integer.toOctalString(n);
        System.out.println("Octal String:"+str);
        
        str=Integer.toHexString(n);
        System.out.println("Hexa String:"+str);
        
        str=Integer.toString(n);
        System.out.println("String:"+str);
    }
}
