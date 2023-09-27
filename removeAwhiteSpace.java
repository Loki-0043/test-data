package Practice;

public class removeAwhiteSpace {


	public static void main(String[] args) {
		String space =" s lokesh shankar ";
		
		System.out.println(space.replaceAll("\\s+","%20"));
		//another method 
		String noWhiteSpace="";
		for(int i=0;i<space.length();i++) {
			if((space.charAt(i)!=' ')&&(space.charAt(i)!='\t')){
				
				noWhiteSpace = noWhiteSpace+(space.charAt(i));
		}
	}
System.out.println(noWhiteSpace);
}
}
