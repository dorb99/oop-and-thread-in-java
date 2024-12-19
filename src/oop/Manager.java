package oop;

import java.util.ArrayList;

public class Manager extends Worker {

	public ArrayList<Integer> workers = new ArrayList<>();
	
	public Manager(int age, String name, int pay) {
		super(age, name, pay);
		
	}
	public void addWorker(int id) {
		this.workers.add(id);
	}
	@Override
	public void greet() {
		String threadName = getThreadInfo();
		System.out.println(threadName+"M"+this.getId()+" Hello I'm "+this.name+" and my workers are: ");
		printWorkers();
	}
	private void printWorkers() {
		if (workers.isEmpty()) {
			System.out.println("\tNone");
		} else {
			for (Integer id : workers) {
				System.out.println("\tWorker Id: "+id);
			}
		}
		
	}
	

	
}
