import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int i;
            
    	for(i=1; i<=T; i++){
    	    int X = sc.nextInt();
    	    int Y = sc.nextInt();
    	    
    	    if(X > 10*Y){
    	        System.out.println("YES");
    	    }
    	    else{
    	        System.out.println("NO");
    	    }
    	}
	}
}
