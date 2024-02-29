package P3.ArrayBangunRuang;

public class Kerucut {
    private double jariJari;
    private double sisiMiring;

    public Kerucut(double jrJr, double sm) {
        jariJari = jrJr;
        sisiMiring = sm;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}