public class A5_App5 
{
    public static void main(String [] args)
    {
        int i=1;
        int no=(int)(Math.random()*100);//Math.random() generates a random double value between 0.0 (inclusive) and 1.0 (exclusive). By multiplying it with 100 and casting it to an integer, you get a random integer between 0 and 99.
        System.out.println("Table");
        while(i<=10)
        {
            System.out.print(" "+(no*i));
            i++;
        }
    }    
}
/* Stepls to remember above program about math.random()
1.Math.random() generates a random double between 0.0 (inclusive) and 1.0 (exclusive). So, it could generate something like 0.567894.

2.If you multiply Math.random() by 100, you'll get a value between 0.0 and 99.999999... For instance, if Math.random() produced 0.567894, then Math.random() * 100 would be approximately 56.7894.

3.(int) casts this double value into an integer. This removes the decimal part and keeps the integer part. For example, if the result of Math.random() * 100 is 56.7894, casting it to an integer would give you 56.

4.Finally, you assign this integer value to the variable no. So, if Math.random() * 100 was approximately 56.7894, no would be assigned the value of 56
 */ 