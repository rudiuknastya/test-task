package testTask;

public class CrossFitTraining extends Training {
	
	private int avrgBarbellWeight;
	public CrossFitTraining(int trainDuration, int avrgPulse, int athleteWeight, int avrgBarbellWeight) {
		super(trainDuration, avrgPulse, athleteWeight);
		this.avrgBarbellWeight = avrgBarbellWeight;
	}
	@Override
	public void printTraining() {
		System.out.println("Тренування з кросфіту! Тривалість: "+ trainDuration + " хвилин. Середня вага штанги: "+ avrgBarbellWeight+ " кг. Кілокалорії: " + calculateCalories());
	}

}
