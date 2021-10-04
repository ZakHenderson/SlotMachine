
public class Project5 {

	public static void main(String[] args) {
		
		int one = (int)((Math.random()*10)+1);
		int two = (int)((Math.random()*10)+1);
		int three = (int)((Math.random()*10)+1);
		
		int coinSum = 0;
		
		if(one == 7 && two == 7 && three == 7) {
			coinSum = coinSum + 500;
		}
		else if(one == two && two == three) {
				coinSum = coinSum + 50;
		}
		else if((one == 7 && two == 7)||(two == 7 && three == 7)||(three == 7 && one == 7)) { 
			coinSum = coinSum + 15;
		}
		else if((one == two)||(two == three)||(three == one)) { 
			coinSum = coinSum + 3;
		}
			else {
			coinSum = coinSum - 1; 
		}
	System.out.println("Your spin was "+ one + " " + two + " " + three + ".");
	System.out.println("you earned " + coinSum + " points.");
		
		
		
		//Your spin was 5 9 1.
		//You earned -1 points.
		
		
		//System.out.println(one + " " + two + " " + three);

	}

}
