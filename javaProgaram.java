package Practice;

public class javaProgaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String back="JavaProgram";
	    String rev="";
	    int ll =back.length();
	    for(int i=back.length()-1;i>=0;i--) {
	    	rev=rev+back.charAt(i);
	    	
	    }
System.out.println("the given string is :"+rev);
StringBuffer bf = new StringBuffer(back);
System.out.println("the given string is :"+bf.reverse());

	}

}
