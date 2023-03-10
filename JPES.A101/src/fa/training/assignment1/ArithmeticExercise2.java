package fa.training.assignment1;


public class ArithmeticExercise2 {
	
	public int Sum(int a, int b) {
		return a+b;
	}
	
	public int Multiply(int a, int b) {
		return a*b;
	}
	
	public int Subtract(int a, int b) {
		return a-b;
	}
	
	public int Divide(int a, int b) {
		return a/b;
	}
	
	public int Remainder (int a, int b) {
		return a%b;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExercise2 a = new ArithmeticExercise2();
		System.out.println(a.Sum(125,24));
		System.out.println(a.Subtract(125,24));
		System.out.println(a.Multiply(125,24));
		System.out.println(a.Divide(125,24));
		System.out.println(a.Remainder(125,24));



	}

}
