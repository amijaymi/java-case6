import java.lang.Math;
public class complexNumber {
    private double real;
    private double imag;
    public complexNumber(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public static complexNumber conjugate(complexNumber z){
        
        return new complexNumber(z.real,-z.imag);
    }
    public static double absvalue(complexNumber z){
        return Math.sqrt((z.real*conjugate(z).real)-(z.imag*conjugate(z).imag));
    }
    public static complexNumber add(complexNumber z1, complexNumber z2){
        complexNumber z3= new complexNumber(0, 0);
        z3.real=z1.real+z2.real;
        z3.imag=z1.imag+z2.imag;
        return z3;
    }
    public static complexNumber multiplication(complexNumber z1, complexNumber z2){
        complexNumber z3=new complexNumber(0, 0);
        z3.real=z1.real*z2.real-z1.imag*z2.imag;
        z3.imag=z1.real*z2.imag+z1.imag*z2.real;
        return z3;

    }
    public String toString(){
        return "the complex number u achieved is "+ this.real +" +"+ this.imag+"i";
    }
}
