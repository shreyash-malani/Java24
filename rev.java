

public class rev{
 
    public static void main(String[] args) {
        
	int rev = 0; 
        int x = 1234;
	int no=1;

        while (x>0) {
	
	no = x %10;
	rev = (rev * 10) + no;
	x = x /10; 		
            
        }
System.out.println(rev);
    }

}

