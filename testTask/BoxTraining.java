package testTask;

public class BoxTraining extends Training {

	public BoxTraining(int trainDuration, int avrgPulse, int athleteWeight) {
		super(trainDuration, avrgPulse, athleteWeight);
	}
	@Override
	public void printTraining() {
		System.out.println("Тренування з боксу! Тривалість: "+ trainDuration + " хвилин. Кілокалорії: " + calculateCalories());
	}
}
