# Java Fraction Reduction Tool
This repository contains a Java program that reduces a given fraction to its lowest terms using the greatest common divisor (GCD) algorithm.

## Usage
To use this program, simply run the Main class. You can edit the numerator and denominator of the fraction in the main method to test with different values.
``` 
public static void main(String[] args) {
    int n = 24;
    int d = 12;

    System.out.println("Before reduction: " + n + "/" + d);

    int[] reducedFraction = reduce(n, d);
    n = reducedFraction[0];
    d = reducedFraction[1];

    System.out.println("After reduction: " + n + "/" + d);
}

``` 
## License
This project is licensed under the MIT License - see the LICENSE.md file for details.
