public class kwadrat extends Figura{
    private double a;
    @Override
    double obwod() {
        return a*a;
    }

    @Override
    double pole() {
        return a*4;
    }
    double setA(double a){return this.a=a;};

}
