package src.Homework7_1;

import java.util.Scanner;

public class Complex {

    private double material;
    private double imaginary;

    public double getMaterial() {
        return material;
    }

    public void setMaterial(double material) {
        this.material = material;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex() {
    }

    public Complex(int material, int imaginary) {
        this.material = material;
        this.imaginary = imaginary;
    }

    public Complex(double material, double imaginary) {
        this.material = material;
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Complex complex1 = new Complex(scanner.nextInt(), scanner.nextInt());
        Complex complex2 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(complex1.addition(complex2));
        System.out.println(complex1.subtraction(complex2));
        System.out.println(complex1.multiplication(complex2));
        System.out.println(complex1.comparisonOfNumbers(complex2));
    }

    public Complex addition(Complex complex) {
        Complex result = new Complex();
        result.setMaterial(material + complex.getMaterial());
        result.setImaginary(imaginary + complex.getImaginary());
        return result;
    }

    public Complex subtraction(Complex complex) {
        Complex result = new Complex();
        result.setMaterial(material - complex.getMaterial());
        result.setImaginary(imaginary - complex.getImaginary());
        return result;
    }

    public Complex multiplication(Complex complex) {
        Complex result = new Complex();
        result.setMaterial(material * complex.getMaterial() - imaginary * complex.getImaginary());
        result.setImaginary(imaginary * complex.getMaterial() + material * complex.getImaginary());
        return result;
    }

    public String comparisonOfNumbers(Complex complex) {
        return "Комплексные числа нельзя сравнивать";
    }

    @Override
    public String toString() {
        return material + " + " + imaginary + "i";
    }
}
