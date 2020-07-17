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
		System.out.println("Запускаємо двигуни літака. Зліт через " + countdown + " сек.");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("Проводимо взліт літака. Літак з повним баком палива пролетить " + (int)distance + " км.");
	}

	public void landingPlane() {
		System.out.println("Проводимо посадку літака.");
	}
}
