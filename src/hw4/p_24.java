package hw4;


public class p_24 {

	public static void main(String[] args) {
		Car7 car1;
		car1=new Car7();
		car1.setCar(1234,20.5);
		System.out.println(car1);
	}
}
class Car7{
	protected int num;
	protected double gas;
	public Car7() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");		
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�����]��"+num+",�T�o�q�]��"+gas);
	}
	public String toString() {
		String str="����"+num+"�T�o�q"+gas;
		return str;
	}	
}