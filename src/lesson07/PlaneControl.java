package lesson07;

public class PlaneControl {
	
	void moveUP() {
		int moveup = (int) (Math.random() * 10000);
		System.out.println("�������� ����� �� " + moveup + " ��.");
	}
	
	void moveDOWN() {
		int movedown = (int) (Math.random() * 10000);
		System.out.println("�������� ���� �� " + movedown + " ��.");
	}
	
	void moveLEFT() {
		int moveleft = (int) (Math.random() * 10000);
		System.out.println("�������� ���� �� " + moveleft + " ��.");
	}
	
	void moveRIGHT() {
		int moveright = (int) (Math.random() * 10000);
		System.out.println("�������� ������ �� " + moveright + " ��.");
	}
 
}
