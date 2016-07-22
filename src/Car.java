import java.util.Random;
public class Car {

private int speed;
private String name;
private int location = 0;

public int getLocation() {
return location;
}
public void setLocation(int location) {
this.location = location;
}

private static int maxSpeedForAll = 120;
private static int minSpeedForAll = 0;

public void accelerate(int p) {
	speed += p;
	if(speed > maxSpeedForAll) {
		speed = maxSpeedForAll;
	} 
}

public void decelerate(int p) {
	speed += p;
	if(speed < minSpeedForAll) {
		speed = minSpeedForAll;
	}
}

public void randomSpeedChange() {
	Random rand = new Random();
	int x = rand.nextInt(20) + (-10);
	speed += x;
	if(speed < minSpeedForAll)
		speed = minSpeedForAll;
	if(speed > maxSpeedForAll)
		speed = maxSpeedForAll;
}

public Car(int speed, String name) {
setSpeed(speed);
setName(name);
}

public static int getMaxSpeedForAll() {
return maxSpeedForAll;
}

public static void setMaxSpeedForAll (int maxSpeedForAll) {

Car.maxSpeedForAll = maxSpeedForAll;

}

public int getSpeed() {
return speed;

}

public void setSpeed(int speed) {
if(speed <= maxSpeedForAll) {
this.speed = speed;
} else {
this.speed = maxSpeedForAll;
}
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String toString() {
return "Car [name=" + name + ", speed=" + speed + "]";
}

}

