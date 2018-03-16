package counter;

import java.util.Scanner;

/**
 * Test the Observer-Observable behavior for Counter object.
 * 
 * @author Napasai Sutthichutipong
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Counter counter = new Counter();
		ConsoleView view = new ConsoleView(counter);
		counter.addObserver(view);
		
		while (true) {
			System.out.println("how much? ");
			int howmuch = console.nextInt();
			counter.add(howmuch);
		}
	}

}
