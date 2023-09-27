package Practice;

public class StringReversDuplicate {

	public static void main(String[] args) {
		String mainString = "sathish kumar";
		String serchString="kumar";
		
		if(mainString.contains(serchString)) {
			String reversedString=reverseString(serchString);
			System.out.println("String found!:"+reversedString);
			
		}else {
			System.out.println("no string found");
		}
	}

	 public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();

}}
 