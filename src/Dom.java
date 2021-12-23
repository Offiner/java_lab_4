public class Dom extends Budynek{

    private double pow;
    private String adres;
    private int lOkien;
    private int lMieszk;
    public Dom() {
    }

    public Dom(double pow, String adres, int lOkien, int lMieszk) {
        this.pow = pow;
        this.adres = adres;
        this.lOkien = lOkien;
        this.lMieszk = lMieszk;
    }


    @Override
    public double powierzchnia(double pow) {
        return this.pow=pow;
    }

    @Override
    public String adresBudynku(String adres) {
        return this.adres=adres;
    }

    @Override
    public int liczbaOkien(int value) {
        return this.lOkien=value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.lMieszk=value;

    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
    }

    @Override
    public void tanioCzyDrogo() {

    }
}
