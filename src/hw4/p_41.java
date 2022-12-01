package hw4;

public class p_41 {

	public static void main(String[] args) {
		Car13 car1=new Car13(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}

interface iVechicle13{
	void vShow();
}

interface iMaterial{
	void mShow();
}

class Car13 implements iVechicle13,iMaterial{
	private int num;
	private double gas;
	
	public Car13(int n,double g) {
		num=n;
		gas=g;
		System.out.println("車號設為"+num+",汽油量設為"+gas);
	}
	public void vShow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mShow() {
		System.out.println("車子的材質是iron");
	}
}