package ueb10.formen;

public class DreiecksPrisma extends Volumen{
	private double a,b,c;

	public DreiecksPrisma(double a, double b, double c, double h) {
		super(h);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getGrundflaeche() {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
