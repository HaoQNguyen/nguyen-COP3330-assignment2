package ex26;

public class PaymentCalculator {
    private int n;
    private double APR;
    private double i;
    private double b;
    private double p;

    public void setAPR(double APR) {
        this.APR = APR;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setP(double p) {
        this.p = p;
    }

    public int getN() {
        return n;
    }

    public double getAPR() {
        return APR;
    }

    public double getI() {
        return i;
    }

    public double getB() {
        return b;
    }

    public double getP() {
        return p;
    }

    public int calculateMonthsUntilPaidOff() {
        this.i = this.APR / 365;
        this.n = (int) Math.ceil(-(1.0/30) * Math.log(1 + b/p * (1 - Math.pow(1 + i,30))) / Math.log(1 + i));

        return this.n;
    }
}
