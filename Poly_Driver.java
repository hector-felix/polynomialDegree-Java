/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author mac
 */
public class Poly_Driver
{
    public static void main(String[] args)
    {
        double[] coeff1 = {3, 7, 9};
        double[] coeff2 = {-3, 7, -9};
        double[] coeff3 = {2, -10, 3, 11};

        MyPolynomial poly1 = new MyPolynomial(coeff1);
        MyPolynomial poly2 = new MyPolynomial(coeff2);
        MyPolynomial poly3 = new MyPolynomial(coeff3);

        System.out.println("poly1: " + poly1 + " " + "Degree: " + poly1.getDegree());
        System.out.println("poly 1 evaluated if x = 2: " + poly1.evaluate(2) + "\n");

        System.out.println("poly2: " + poly2 + " " + "Degree: " + poly2.getDegree());
        System.out.println("poly 2 evaluated if x = 3: " + poly2.evaluate(3) + "\n");

        System.out.println("poly2: " + poly2 + " added to poly 3: " + poly3);
        System.out.println("poly2: " + poly2.add(poly3) + "\n");

        System.out.println("poly3: " + poly3 + " added to poly1: " + poly1);
        System.out.println("poly3: " + poly3.add(poly1));


    }
}
