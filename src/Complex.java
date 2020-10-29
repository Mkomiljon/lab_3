public class Complex {
    private double real = 0.0;
    private double imaginary = 0.0;

    public Complex() {
        setReal(1.0);
        setImaginary(1.0);
    }

    public Complex(double real, double imaginary) {
        setReal(real);
        setImaginary(imaginary);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        if (real >= 0.0) {
            this.real = real;
        }else{
            throw new IllegalArgumentException("Value must be positive!");
        }
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        if (imaginary >= 0.0) {
            this.imaginary = imaginary;
        }else{
            throw new IllegalArgumentException("Value must be positive!");
        }
    }

    public Complex add(Complex complex){
        Complex result = new Complex();
        result.setReal(this.real + complex.real);
        result.setImaginary(this.imaginary + complex.imaginary);
        return result;
    }

    public Complex subtract(Complex complex){
        Complex result = new Complex();
        result.setReal(this.real - complex.real);
        result.setImaginary(this.imaginary - complex.imaginary);
        return result;
    }

    @Override
    public String toString() {
        return "Complex Number { " +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}
