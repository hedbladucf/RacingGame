
public class RacingGame {

	
	public static void main(String[] args) {
		
		Car[] cars = new Car[10];
		cars[0] = new Car(30, "Adam");
		cars[1] = new Car(30, "Joe");
		cars[2] = new Car(30, "Adrian");
		cars[3] = new Car(30, "Martin");
		cars[4] = new Car(30, "Michael");
		cars[5] = new Car(30, "John");
		cars[6] = new Car(30, "Alex");
		cars[7] = new Car(30, "Female Driver");
		cars[8] = new Car(30, "Danny");
		cars[9] = new Car(30, "Carl");
		
		
		while(cars[determineTheLeader(cars)].getLocation() < 1000) {
			int leader = determineTheLeader(cars);
			System.out.println(cars[leader].getName() + " is in the lead at position " 
					+ cars[leader].getLocation() 
					+ ". He is driving with a speed of " + cars[leader].getSpeed() + " mph");
			for(int k = 0; k < cars.length; k ++) {
				cars[k].setLocation(cars[k].getSpeed() + cars[k].getLocation());
				cars[k].randomSpeedChange();
			}
			if(cars[leader].getLocation() >= 1000) {
				System.out.println(cars[leader].getName() + " has finished in first place and won the race!");
			}
		}
			
		
		
		
	}
	static int determineTheLeader(Car[] cars) {
		int max = 0;
		int leaderIndex = 0;
		
		for(int i = 0; i < cars.length; i++) {
			if(max < cars[i].getLocation()) {
				max = cars[i].getLocation();
				leaderIndex = i;
			}
		
				
		}
		
		return leaderIndex;
	}

}

