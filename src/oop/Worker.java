package oop;

import threads.Printer;

public class Worker extends Person implements Printer {

	public int pay;

	public Worker(int age, String name, int pay) {
		super(age, name);
		this.pay = pay;
	}

	@Override
	public void greet() {
		String threadName = getThreadInfo();
		System.out.println(threadName+"WOR"+this.getId()+" Hello I'm "+this.name+", I'm "+this.age+" years old.");
	}
	
}
