import java.util.Scanner;
public class Calculator{
	public double add(double a,double b){
		return a+b;
	}
	public double sub(double a,double b){
		return a-b;
	}
	public double mul(double a,double b){
		return a*b;
	}
	public double div(double a,double b){
		return a/b;
}

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		Calculator sum=new Calculator();
		System.out.println(sum.add(a,b));
	}

}