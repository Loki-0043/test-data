package Practice;

public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sathish is eating";
		System.out.print("vowels in the given String:");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
				str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.print( ""+str.charAt(i));
			}
		}

	}

}
