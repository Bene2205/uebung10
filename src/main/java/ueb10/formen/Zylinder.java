package ueb10.formen;

public class Zylinder extends Volumen{

	double r;

	public Zylinder(double r, double b) {
		super(b);
		this.r = r;
	}

	@Override
	public double getGrundflaeche() {
		return Math.PI * Math.pow(r,2);
	}
}
