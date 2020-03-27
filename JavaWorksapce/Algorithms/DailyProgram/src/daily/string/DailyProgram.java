package daily.string;

public class DailyProgram {

	public int numberOfSteps(int num) {

		int steps = 0;

		while (num != 0) { 
			
			
			num = (num%2==0 ? num/2 : (num-1) );

			steps++;

		}
		return steps;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyProgram d=new DailyProgram(); 
System.out.println(		d.numberOfSteps(14) );
	}

}
