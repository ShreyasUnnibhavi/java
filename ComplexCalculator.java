public class ComplexCalculator {
    public static void main(String[] args) {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);

        Complex sol1 = Complex.add(a, b);
        sol1.print();
        
        Complex sol2 = Complex.subtract(a, b);
        sol2.print();

        Complex sol3 = Complex.multiply(a, b);
        sol3.print();
    }
}

class Complex {
    int real;
    int img;

    public Complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex subtract(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex multiply(Complex a, Complex b) {
        return new Complex((a.real * b.real)-(a.img * b.img), (a.real * b.img)+(a.img * b.real));
    }

    public void print() {
        if(real == 0 && img != 0) {
            System.out.println(img + "i");
        }else if(img == 0 && real != 0) {
            System.out.println(real);
        }else {
            System.out.println(real + ", " + img + "i");
        }
    }
}
