import java.util.Scanner;
import java.text.DecimalFormat;

class Sphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter diameter: ");
		double d = sc.nextDouble();
		sc.close();

		double radius = d/2;
		double volume = (4/3)*Math.PI*Math.pow(radius, 3);
		double area = 4*Math.PI*Math.pow(radius, 2);
		
		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println("Volume: " + df.format(volume));
		System.out.println("Area: " + df.format(area));
		
	}
}