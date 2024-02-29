package P3.ArrayBangunRuang;

public class LimasSegiEmpat {
    private double panjangSisiAlas;
    private double tinggi;

    public LimasSegiEmpat(double psa, double t) {
        panjangSisiAlas = psa;
        tinggi = t;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double luasSisi = 4 * (0.5 * panjangSisiAlas * tinggi);
        return luasAlas + luasSisi;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggi;
    }
}