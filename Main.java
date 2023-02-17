
public class Main
{
	public static void main(String[] args) {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(3, 4);

        Fraction sum = a.add(b);
        System.out.println("Sum: " + sum.toString());
    }
}


