package testTask;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Training [] weekTrainings = new Training[4];
		weekTrainings[0] = new RunTraining(rand.nextInt(101)+30,rand.nextInt(41)+ 60,rand.nextInt(61)+ 60,rand.nextInt(10)+1);
		weekTrainings[1] = new RunTraining(rand.nextInt(101)+30,rand.nextInt(41)+ 60,rand.nextInt(61)+ 60,rand.nextInt(10)+1);
		weekTrainings[2] = new CrossFitTraining(rand.nextInt(101)+30,rand.nextInt(41)+ 60,rand.nextInt(61)+ 60,rand.nextInt(20)+1);
		weekTrainings[3] = new BoxTraining(rand.nextInt(101)+30,rand.nextInt(41)+ 60,rand.nextInt(61)+ 60);
		System.out.println();
		for(Training training:weekTrainings) {
			training.printTraining();
		}
	}

}
