import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int i, m;
            
    	for(i=1; i<=T; i++){
    	    int N = sc.nextInt();
    	    m = N % 3;
            
    	    if(m == 0){
    	        System.out.println("YES");
    	    }
    	    else{
    	        System.out.println("NO");
    	    }
    	}
	}
}
