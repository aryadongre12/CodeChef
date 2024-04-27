import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
  	int i,Z;
  	Scanner sc = new Scanner(System.in);
  	int T = sc.nextInt();
  	
  	for(i=1;i<=T;i++){
  	  int X = sc.nextInt();
  	  int Y = sc.nextInt();
  	  Z = X + Y;
      
  	  if(Z>6){
  	    System.out.println("YES");
  	  }
  	  else{
  	    System.out.println("NO");
  	  }
	  }
	}
}
