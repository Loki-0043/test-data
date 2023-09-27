package Practice;

import java.util.HashSet;
import java.util.Set;

public class InterviewQustions {
	//find the prime number
	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
	}
for(int i=2;i<num;i++) {
	if(num%i==0) {
		return false;
	}
	}return true;
}
	//get prime number
public static void getPrimeNumber(int num) {
	for(int i= 2;i<=num;i++) {
		if(isPrimeNumber(num)) {
			System.out.println(i+"");
		}
		
	}
	}
	public static void main(String[] args) {
		String s= "Automation";
		int lr =s.length();
		String rev ="";
		for (int i=s.length()-1;i>=0;i--) {
			rev =rev +s.charAt(i);
		}
		System.out.println(rev);
		// another method for revers a String
		StringBuffer bf= new StringBuffer(s);
		System.out.println(bf.reverse());
	
		int num = 12345;
	    int revr =0;
	    while(num!=0) {
	    	revr =revr*10+num%10;
	    	num=num/10;
	    	}
	    System.out.println("revers the integer:"+revr);
	   // another method for reveres a integer
	    long num1 =123456;
	    System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	    //missing numbers in array
	    int a[]= {1,2,3,5,6,7};
	 int sum=0;
	    for(int i=0;i<a.length;i++) {
	    	sum = sum+a[i]; 	
	    }					
	    //System.out.println(sum);
	    int sum1=0;
	    for(int j=1;j<=7;j++) {
	    	sum1=sum1+j;
	    }
	   // System.out.println(sum1);
	    System.out.println("missing numbers in number:"+(sum1-sum));
	  //duplicate elements in java array
	    String names[]= {"java","java script","c","c","c#","pythan","java"};
	      Set<String> store =new HashSet<String>(); 
	      for(String name:names) {
	    	  if(store.add(name)==false) {
	    		  System.out.println("Duplicate name is:"+name);
	    	  }	 }
	      
	    	  //swap the two string without using thread variable
	    	  String c="hello";
	    	  String d="world";
	    	  c= c+d;//helloworld
	    	  d=c.substring(0,c.length()-d.length());
	    	  c=c.substring(d.length());
      System.out.println("the value of c and b after swaping");
      System.out.println("the c value is: "+c);
      System.out.println("the b value is: "+d);
      System.out.println("2 is prime number :"+isPrimeNumber(2));//prime number
     //getPrimeNumber(7); // get prime number
	}  		
  }

