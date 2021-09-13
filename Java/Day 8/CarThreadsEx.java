package com.src;

public class CarThreadsEx {

	public static void main(String[] args) {
		Car c = new Car();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
				

			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
				
			}

		});
		Thread t4 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
				
			}

		});
		Thread t5 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
				
			}

		});
		Thread t6 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
			
			}

		});
		Thread t7 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
				
			}

		});
		Thread t8 = new Thread(new Runnable() {
			public void run() {
				c.pertolpump();
				c.pitstop();
				;
			}

		});
		t1.setName("BMW");
		t2.setName("Audi");
		t3.setName("Rolls Royce");
		t4.setName("Ford");
		t5.setName("Scorpio");
		t6.setName("Benz");
		t7.setName("Ferrari");
		t8.setName("Toyota");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();


	}

}
class Car
{
	synchronized void pertolpump() {
		for (int i = 0; i <= 8; i++) {
			if (i == 8) {
				System.out.println("You are the winner " + Thread.currentThread().getName());
				System.out.println("You have reached the petrol pump");

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	synchronized void pitstop() {
		for (int i = 0; i <=8; i++) {
			if (i == 8) {
				System.out.println("You are the winner car" + Thread.currentThread().getName());
				System.out.println("You have reached the pitstop");
				notifyAll();

			}

		}

	}
	
}