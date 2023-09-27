package Practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap value of a and b :"+a+" and "+b);
		//System.out.println("After swap value of b:"+b);
		String x="loki";
		String y ="bismi";
		x=x+y;
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length());
		System.out.println("After swap value of a and b :"+x+" and "+y);

	}

}
