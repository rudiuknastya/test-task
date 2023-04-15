package testTask;

public abstract class Training {

	protected int trainDuration;
	protected int avrgPulse;
	protected int athleteWeight;
	public Training(int trainDuration, int avrgPulse, int athleteWeight) {
		this.trainDuration = trainDuration;
		this.avrgPulse = avrgPulse;
		this.athleteWeight = athleteWeight;
	}
	protected double calculateCalories() {
		return 0.014*athleteWeight*trainDuration*(0.12*avrgPulse-7);
	}
	
	public abstract void printTraining();
}
