package ueb10.formen;

public abstract class Volumen {

    private double hoehe;

    public Volumen(double hoehe) {
        this.hoehe = hoehe;
    }

    public double volumen(){
        return getGrundflaeche() * hoehe ;
    }

    abstract public double getGrundflaeche();

}
