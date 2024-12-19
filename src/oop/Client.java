package oop;

public class Client extends Person {
	public int clientLevel;

	public Client(int age, String name, int clientLevel) {
		super(age, name);
		this.clientLevel = clientLevel;
	}
	
}
