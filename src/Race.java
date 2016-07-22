public class Race {


	public static void main(String[] args) {
		
		Car oscar = new Car(30, "Oscar");
		oscar.setSpeed(32);
		oscar.setName("Oscar's Car");
		System.out.println(oscar.getName() + " is going " 
		+ oscar.getSpeed() + " mph.");
		
		
		Car chris = new Car(30, "Chris");
		chris.setSpeed(29);
		chris.setName("Chris' Car");
		System.out.println(chris.getName() + " is going " 
		+ chris.getSpeed() + " mph.");
		
		
		while(oscar.getLocation() < 1000 && chris.getLocation() < 1000) {
			
			oscar.setLocation(oscar.getLocation() + oscar.getSpeed());
			chris.setLocation(chris.getLocation() + chris.getSpeed());
			
			
			oscar.randomSpeedChange();
			chris.randomSpeedChange();
			
			if(oscar.getLocation() < chris.getLocation()) {
				oscar.setSpeed(oscar.getSpeed() + 2); 
				chris.setSpeed(chris.getSpeed() - 2);
				System.out.println("Chris is in the lead at position " 
				+ chris.getLocation() 
				+ ". He is driving with a speed of " + chris.getSpeed() + " mph");
			}
			else if(oscar.getLocation() > chris.getLocation()) {
				oscar.setSpeed(oscar.getSpeed() - 2);
				chris.setSpeed(chris.getSpeed() + 2);
				System.out.println("Oscar is in the lead at position " 
				+ oscar.getLocation() 
				+ ". He is driving with a speed of " + oscar.getSpeed() + " mph");
			}else {
				System.out.println("The two racers are neck and neck. This race is a nail-biter!");
			}
			
			if(oscar.getLocation() >= 1000) {
				System.out.println(oscar.getName() + " has finished in first place!");
			}
			
			if(chris.getLocation() >= 1000) {
				System.out.println(chris.getName() + " has finished in first place!");
			}
		
		}
		

	}

}
