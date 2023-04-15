package testTask;

public class RunTraining extends Training {

	private int distance;
	public RunTraining(int trainDuration, int avrgPulse, int athleteWeight, int distance) {
		super(trainDuration, avrgPulse, athleteWeight);
		this.distance = distance;
	}
	@Override
	public void printTraining() {
		System.out.println("Тренування з бігу! Тривалість: "+ trainDuration + " хвилин. Дистанція: "+ distance+ " км. Кілокалорії: " + calculateCalories());
	}
}
