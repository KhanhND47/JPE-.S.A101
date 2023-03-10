package fa.training.assignment1;

public class CircleExercise {
	
	public double Perimeter(double r) {
		return Math.PI*(r*2);
	}
	
	public double Area(double r) {
		return Math.PI*Math.pow(r,2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleExercise a = new CircleExercise();
		System.out.println("Perimeter is ="+a.Perimeter(7.5));
		System.out.println("Area is ="+a.Area(7.5));



	}
	

}
