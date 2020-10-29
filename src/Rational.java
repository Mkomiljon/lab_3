public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }else{
            throw new IllegalArgumentException("Denominator is zero");
        }
    }


    private static void reducedForm(int numerator, int denominator){
        boolean reducible =true;
        do {
            for (int i = 2; i <= 10; i++) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    reducible = true;
                }else
                    reducible = false;
            }
        }while (reducible);
    }

    public static Rational add(Rational r1, Rational r2){
        Rational result = new Rational();
        result.setNumerator((r1.numerator* r2.denominator) + (r2.numerator* r1.denominator));
        result.setDenominator(r1.denominator * r2.denominator);
        reducedForm(result.numerator, result.denominator);
        return result;
    }

    public static Rational subtract(Rational r1, Rational r2){
        Rational result = new Rational();
        result.setNumerator((r1.numerator * r2.denominator) - (r2.numerator * r1.denominator));
        result.setDenominator(r1.denominator * r2.denominator);
        reducedForm(result.numerator, result.denominator);
        return result;
    }

    public static Rational multiply(Rational r1, Rational r2){
        Rational result = new Rational();
        result.setNumerator(r1.numerator * r2.numerator );
        result.setDenominator(r1.denominator * r2.denominator);
        reducedForm(result.numerator, result.denominator);
        return result;
    }

    public static Rational divide(Rational r1, Rational r2){
        Rational result = new Rational();
        result.setNumerator(r1.numerator * r2.denominator);
        result.setDenominator(r1.denominator * r2.numerator);
        reducedForm(result.numerator, result.denominator);
        return result;
    }

    @Override
    public String toString() {
        return "Rational Number = " + this.numerator + "/" + this.denominator
                + "\nIn Floating Number Format = " + (this.numerator/this.denominator);
    }
}
