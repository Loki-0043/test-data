package Practice;

public class SecoundLargestNumber {
	static int  a[]= {2,6,4,8,9,7,3};
	
	
public static int getSecoundLargest(int[]a,int total) {
	 int temp;
	for(int i=0;i<total;i++) {
		for(int j=i;j<total;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	return a[total-2];
	
}
	public static void main(String[] args) {
		System.out.println("the secound largest number are:"+getSecoundLargest(a,7));

	}

}
