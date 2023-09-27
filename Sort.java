package Practice;

public class Sort {

	public static void main(String[] args) {
	int a[]= {22,44,69,34,78,45};
     int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			if(a[i]>a[j]){   //assending 
		//	if	(a[i]<a[j]);{ dessending
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int array:a) {
		System.out.println(array);
	}

	}

}
