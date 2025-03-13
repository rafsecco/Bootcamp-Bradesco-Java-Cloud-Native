public record Circle(double radius) implements GeometricForm {
	private static final double pi = 3.14159265358979323846;

	@Override
	public double getArea() {
		return pi * (radius * radius);
	}
}