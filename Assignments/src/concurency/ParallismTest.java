package concurency;

import java.util.Random;

public class ParallismTest {
	public static void main(String args[]) {
		boolean found = false;
		
	}

}
class CreateNumbers implements Runnable{

	@Override
	public void run() {
		Random rand = new Random(); 
		int value = rand.nextInt(100);
		if(value == 25){
			System.out.println("value found by "+ Thread.currentThread().getName());
			notifyAll();
		}
	}
	
}
