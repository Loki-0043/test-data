package Practice;

public class StrongNumber {
public static void isArmStrongNumber(int num) {
	int cube=0;
	int r=0;
	int t=num;
	while(num>0) {
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
	}
	if(t==cube) {
		System.out.println("isAmstrongNumber");
	}else {
		System.out.println("isnotArmstronNumber");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmStrongNumber(154);
	}

}
