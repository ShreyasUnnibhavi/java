public class ComplexCalculator {
    public static void main(String[] args) {
        Complex a = new Complex(2,5);
        Complex b = new Complex(2,3);
        
        Complex c = Complex.add(a,b);
        Complex d = Complex.subtract(a, b);
        Complex e = Complex.product(a, b);

        c.printComplex();
        d.printComplex();
        e.printComplex();
    }
}

class Complex{
    int real;
    int img;

    public Complex(int r, int i){
        real = r;
        img = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real),(a.img + b.img));
    }
    public static Complex subtract(Complex a, Complex b){
        return new Complex((a.real - b.real),(a.img - b.img));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex((a.real * b.real)-(a.img * b.img), (a.real * b.img)+(a.img * b.real));
    }

    public void printComplex(){
        if(real == 0 && img != 0){
            System.out.println(img + "i");
        }else if(img == 0 && real != 0){
            System.out.println(real);
        }else{
            System.out.println(real + " + " + img + "i");
        }
    }
}
