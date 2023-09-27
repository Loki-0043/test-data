package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
public static void palindronNumber(int num) {
	int sum=0;
	int r=0;
	int t=num;
	while(num>0) {
		r=num%10;
		sum =(sum*10)+r;
		num=num/10;
	}
	if(t==sum) {
		System.out.println("the number is palindron");
	}else {
		System.out.println("the number is not palindron");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		// String names[]= {"java","java script","c","c","c#","pythan","java"};
		 int a[]= {22,44,58,44,};
	     
		 Set<Integer> store =new HashSet<Integer>(); 
	      for(int a1:a) {
	    	  if(store.add(a1)==false) {
	    		  System.out.println("Duplicate name is:"+a1);
	    	  }	  

	}
	      palindronNumber(152);
	      }

	}
