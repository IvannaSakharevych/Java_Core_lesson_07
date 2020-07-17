package lesson07;

public abstract class Plane {
	
	private int length;
	private int width;
	private int weight;
	
	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	public void startingEngines() {
		int countdown = (int) ((Math.random() * (88 - 20 + 1) + 20));
		System.out.println("��������� ������� �����. ��� ����� " + countdown + " ���.");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("��������� ���� �����. ˳��� � ������ ����� ������ ��������� " + (int)distance + " ��.");
	}

	public void landingPlane() {
		System.out.println("��������� ������� �����.");
	}
}
