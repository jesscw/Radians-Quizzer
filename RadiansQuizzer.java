import java.util.Scanner;

public class RadiansQuizzer {
	
	public static void main (String[] args) {
		String[] angles = {
				"0", "pi/6", "pi/4", "pi/3", "pi/2", "2pi/3", "3pi/4", "5pi/6", "pi", 
				"7pi/6", "5pi/4", "4pi/3", "3pi/2", "5pi/3", "7pi/4", "11pi/6", "2pi"
		};

		String[] sines = {
				"0", "1/2", "rt2/2", "rt3/2", "1", "rt3/2", "rt2/2", "1/2", "0",
				"-1/2", "-rt2/2", "-rt3/2", "-1", "-rt3/2", "-rt2/2", "-1/2", "0",
		};
		
		String[] cosines = {
				"1", "rt3/2", "rt2/2", "1/2", "0", "-1/2", "-rt2/2", "-rt3/2", "-1",
				"-rt3/2", "-rt2/2", "-1/2", "0", "1/2", "rt2/2", "rt3/2", "1"
		};
		
		Scanner in = new Scanner(System.in);
		
		boolean go = true;
		
		System.out.println("Use 'rt' as square root");
		System.out.println("Enter 'STOP' to stop");
		
		while(go) {
			
			int n = (int) Math.floor(Math.random() * angles.length);
			String a = angles[n];
			String f = ((int) Math.floor(Math.random() * 2) == 0 ? "sin" : "cos");
			
			System.out.println(f + "(" + a + ")");
			
			String ans = in.next();
			
			if(ans.equals("STOP")) {
				go = false;
				break;
			} else if(ans.equals((f == "sin" ? sines[n] : cosines[n]))) {
				System.out.println("CORRECT");
			} else {
				System.out.println("INCORRECT, the correct answer is " 
						+ (f == "sin" ? sines[n] : cosines[n]));
			}
			
		}
	}

}
