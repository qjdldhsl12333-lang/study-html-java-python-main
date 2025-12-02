package Calculrater;

public class ComputerExample {
	public static void main(String[] args) {
		int r =10;
		Calculater calculator =new Calculater();
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r));
	}

}
