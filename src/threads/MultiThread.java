package threads;

import java.util.Random;

import oop.*;

public class MultiThread implements Runnable, Printer{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			greet();
			priorityWait();
			createPeople();
		}
		
		private void createPeople() {
		        // Creating objects of Client, Worker, and Manager
		        Client client1 = new Client(25, "Alice", 3);
		        Client client2 = new Client(30, "Bob", 2);
		        
		        Worker worker1 = new Worker(28, "Charlie", 5000);
		        Worker worker2 = new Worker(35, "David", 6000);
		        
		        Manager manager1 = new Manager(40, "Eve", 8000);
		        Manager manager2 = new Manager(45, "Frank", 9000);

		        // Adding workers to the manager
		        manager1.addWorker(worker1.getId());
		        manager1.addWorker(worker2.getId());

		        // Calling greet() method for each object
		        System.out.println("Clients:");
		        client1.greet();
		        client2.greet();

		        System.out.println("\nWorkers:");
		        worker1.greet();
		        worker2.greet();

		        System.out.println("\nManagers:");
		        manager1.greet();
		        manager2.greet();
		}

		
		@Override
		public void greet() {
			System.out.println("Thread: "+Thread.currentThread().getName()+" with priority of "+Thread.currentThread().getPriority()+" is starting");			
		}
		
		private void priorityWait() {
			int time = Thread.currentThread().getPriority();
			try {
				Thread.sleep(200-(time*10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
}

