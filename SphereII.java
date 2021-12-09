import java.util.Scanner;
import java.text.DecimalFormat;

class SphereII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter: ");
        double d = sc.nextDouble();
        sc.close();

        double volume = computeVolume(d);
        double area = computeArea(d);

        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Volume: " + df.format(volume));
        System.out.println("Area: " + df.format(area));
    }

    public static double computeVolume(double diameter) {
        double r = diameter/2;
        return (4/3)*Math.PI*Math.pow(r, 3);
    }

    public static double computeArea(double diameter) {
        double r = diameter/2;
        return 4*Math.PI*r*r;
    }
}