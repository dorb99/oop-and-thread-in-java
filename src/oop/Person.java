package oop;

import threads.Printer;

abstract class Person implements Printer {
    private static final ThreadLocal<Integer> COUNTER = ThreadLocal.withInitial(() -> 0);

	public int age;
	public String name;
	private int id;
	
	public void greet() {
		String threadName = getThreadInfo();
		System.out.println(threadName+"PER"+this.id+" Hello I'm "+this.name+", I'm "+this.age+" years old.");
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		this.id = COUNTER.get();
        COUNTER.set(COUNTER.get() + 1);
	}
	public int getId() {
		return id;
	}
}