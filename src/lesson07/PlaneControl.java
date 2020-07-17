package lesson07;

public class PlaneControl {
	
	void moveUP() {
		
	}
	
	void moveDOWN() {
		int movedown = (int) (Math.random() * 10000);
		System.out.println("Рухаємося вниз на " + movedown + " км.");
	}
	
	void moveLEFT() {
		int moveleft = (int) (Math.random() * 10000);
		System.out.println("Рухаємося вліво на " + moveleft + " км.");
	}
	
	void moveRIGHT() {
		int moveright = (int) (Math.random() * 10000);
		System.out.println("Рухаємося вправо на " + moveright + " км.");
	}
 
}
