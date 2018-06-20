package ueb10.formen;

import ueb10.bremsen.Bremse;

public class ZylindrischesRohr extends Volumen{
	double r1, r2;

	public ZylindrischesRohr(double r1, double r2, double h) {
		super(h);
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public double getGrundflaeche() {
		double flaeche1 = Math.PI * Math.pow(r1,2);
		double flaeche2 = Math.PI * Math.pow(r2,2);
		if (flaeche1 < flaeche2) {
			return flaeche2 - flaeche1;
		}
		return flaeche1 - flaeche2;
	}
}
