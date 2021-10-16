package mathPackage;

public class Math {
	
	private final double PI = 3.14;

	public double circleArea(double r) {
		return PI * r * r;
	}
	
	public double circleCircumference(double r) {
		return 2 * PI * r;
	}
	
	public double circleDiameter(double r) {
		return 2 * r;
	}

}
