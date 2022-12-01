package hw4;

public class p_17 {

	public static void main(String[] args) {
		Car3 cars[];
		cars=new Car3[2];
		cars[0]=new Car3();
		cars[0].setCar(1234,20.5);
		cars[1]=new RacingCar3();
		cars[1].setCar(4567,30.5);
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
	}
}
