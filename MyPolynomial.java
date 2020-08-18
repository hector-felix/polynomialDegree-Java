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
public class MyPolynomial
{
    private double[] coeffs;

    MyPolynomial(double[] coeffs)
    {
        this.coeffs = coeffs;
    }

    public int getDegree()
    {
        return coeffs.length - 1;
    }

    @Override
    public String toString()
    {
        String output = "";

        for(int i = 0; i < coeffs.length - 1; i++) // for loop split up with if statement
        {
            if(coeffs[i] > 0)
                output += (int)coeffs[i]; // prints eaceh coeff
            else if(coeffs[i] < 0)
                output += (int)coeffs[i] * -1;

            if(i == 1) // prints variable x
                output += "x";
            else if (i > 1)
            {
                output += "x^" + i;
            }


            if(coeffs[i + 1] > 0)
                output += " + ";
            else if(coeffs[i + 1] < 0)
                output += " - ";
        }

        if(coeffs[coeffs.length - 1] < 0) // solves the "- -" problem
            output += (int)(coeffs[coeffs.length - 1] * -1) + "x^" + (coeffs.length - 1);
         else
            output += (int)coeffs[coeffs.length - 1] + "x^" + (coeffs.length - 1);

        return output;
    }

    public double evaluate(double x)
    {
        double output = 0.0;

        for(int i = 0; i < coeffs.length; i++)
        {
            if(i >= 1)
                output += coeffs[i] * Math.pow(x, i);
            else if (i < 1)
                output += coeffs[0];


        }

        return output;
    }

    public MyPolynomial add(MyPolynomial right)
    {
        int size = 0;

        if(this.getCoeffs().length < right.getCoeffs().length)
        {
            size = this.getCoeffs().length;
            double[] tempList = new double[right.getCoeffs().length];

            for(int i = 0; i < size; i++)
            {
                tempList[i] = this.coeffs[i] + right.getCoeffs()[i];
            }

            for(int i = size; i < right.getCoeffs().length; i++)
            {
                tempList[i] += right.getCoeffs()[i];
            }

            this.coeffs = tempList;
        }
        else
        {
            size = right.getCoeffs().length;
            double[] tempList = new double[this.getCoeffs().length];

            for(int i = 0; i < size; i++)
            {
                tempList[i] = this.coeffs[i] + right.getCoeffs()[i];
            }

            for(int i = size; i < this.getCoeffs().length; i++)
            {
                tempList[i] += this.getCoeffs()[i];
            }

            this.coeffs = tempList;
        }

        return this;
    }

    public double[] getCoeffs()
    {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs)
    {
        this.coeffs = coeffs;
    }
}
