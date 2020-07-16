package lesson07;

public class Su_27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike {

	private int maxSpeed;
	private String color;
	
	public Su_27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void nuclearStrike() {
		System.out.println("��������� ������� ����. ʳ������ ��������� �������� ������� ��������� " + (int)(Math.random() * 10) + " ��.");
		
	}

	@Override
	public void stealthTechnology() {
		System.out.println("�������� ��������� �����. ˳���� �� ����� �������� " + (int)(Math.random() * 60) + " ��.");
		
	}

	@Override
	public void turboAcceleration() {

		int speed = (int) (Math.random() * this.maxSpeed);
		System.out.println("�������� ���������������� � ����� � �������� " + speed + " ��/���.");
	}

}
