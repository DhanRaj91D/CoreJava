
public class AreaCalculate {

	static final float pi = 3.14f;
	private double radius;

	public AreaCalculate() {

	}

	public AreaCalculate(double radius) {
		super();
		this.radius = radius;
	}

	void area() {

		double area;
		area = (pi * this.radius * this.radius);

		System.out.println("Area of circle is " + area);
	}

	void circumference() {

		double circumference = 0;

		circumference = (2 * pi * this.radius);
		System.out.println("circumference of circle is " + circumference);
	}

}
