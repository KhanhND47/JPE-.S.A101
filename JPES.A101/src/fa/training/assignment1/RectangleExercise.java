package fa.training.assignment1;
import java.util.Scanner;

public class RectangleExercise {
	
	public double Area(double w, double h) {
		return w*h;
	}
	
	public double Perimeter(double w, double h) {
		return 2*(w+h);
	}

	
	public static void main(String[] args) {
		
		RectangleExercise a= new RectangleExercise();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Width=");
		double width= sc.nextDouble();
		System.out.print("Enter Height=");
		double height= sc.nextDouble();
		
		System.out.println("Area is "+ width+"*"+ height+"="+ a.Area(width,height));
		System.out.println("Perimeter is 2*("+ width+"+ "+ height+") =" +a.Perimeter(width,height));

	}
}
