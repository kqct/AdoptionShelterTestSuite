package assignment3;

public class Dog implements Comparable<Dog>{
	
	private String name;
	private int ageEstimate;
	private int daysAtTheShelter;
	private int daysToNextVetAppointment;
	private double expectedVetCost;
	
	public Dog(String name, int ageEstimate, int daysAtTheShelter, int daysToNextVetAppointment, double vetCost) {
		this.name = name;
		this.ageEstimate = ageEstimate;
		this.daysAtTheShelter = daysAtTheShelter;
		this.daysToNextVetAppointment = daysToNextVetAppointment;
		this.expectedVetCost = vetCost;
	}
	
	public String toString(){
		String result = this.name + "(" + this.ageEstimate + " , " + this.daysAtTheShelter + ")";
		return result;
	}
	
	public int getAge() {
		return this.ageEstimate;
	}
	
	public int getDaysAtTheShelter() {
		return this.daysAtTheShelter;
	}
	
	public int getDaysToNextVetAppointment() {
		return this.daysToNextVetAppointment;
	}
	
	public double getExpectedVetCost() {
		return this.expectedVetCost;
	}
	
	public int compareTo(Dog d) {
		int ageDiff = this.ageEstimate - d.ageEstimate;
		if (ageDiff != 0)
			return ageDiff;
		else
			return this.daysAtTheShelter - d.daysAtTheShelter;
	}
	
	public boolean equals(Object obj) {
		return obj instanceof Dog && this.compareTo((Dog) obj) == 0;
	}

}
