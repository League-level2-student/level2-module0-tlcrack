package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] rob = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int i = 0;i<rob.length; i++) {
	rob[i] = new Robot("mini");
	rob[i].setSpeed(10);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for(int s = 0; s < 5; s++) {
	rob[s].setX(s*200+50);
	rob[s].setY(520);
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random r = new Random();
int z = 0;
int winner = 0;
boolean finished = false;
while(finished==false) {
	
for(int w = 0;w<5;w++) {
z = r.nextInt(50);
	rob[w].move(z);
	
	if(rob[w].getY()<20) {
		finished=true;
		winner = w + 1;
	}
}

}


	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
System.out.println("robot#" + winner + " is the winner!");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

	}
}
