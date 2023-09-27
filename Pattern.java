package Practice;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
for(int i=1,p=1;i<=n;i++,p++) {
for(int j=1;j<=i;j++) {
	System.out.print(p+" ");
}System.out.println();
	}System.out.println("-------------");
	for(int i=1,p=5;i<=n;i++,p--) {
		for(int j=1;j<=i;j++) {
			System.out.print(p+" ");
		}System.out.println();
			}System.out.println("----------------");
			for(int i=1,p=0;i<=n;i++,p+=2) {
				for(int j=1;j<=i;j++) {
					System.out.print(p+" ");
				}System.out.println();
					}
System.out.println("---------------------");
for(int i=1;i<=n;i++) {
	for(int k=i;k<=n;k++) {
		System.out.print("*");
	}System.out.println();
}System.out.println("---------------------");
for (int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}System.out.println();
}
System.out.println("---------------------");
for(int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<i;j++) {
		System.out.print("*");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}System.out.println();
}System.out.println("-------------------");
for(int i=1,p=1;i<=n;i++,p++) {
	for(int j=i;j<=n;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<i;j++) {
		System.out.print(p+"");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(p+"");
	}
	
	for( i=1;i<n;i++) {
		
	}
	}
}}
 
