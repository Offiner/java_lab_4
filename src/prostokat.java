public class prostokat extends Figura{
    private double a;
    private double b;
    @Override
    double obwod() {
        return 2*a+2*b;
    }


    @Override
    double pole() {
        return a*b;
    }
    double setA(double a){return this.a=a;};
    double setB(double b){return this.b=b;};
}
