import java.lang.*;
import java.util.Scanner;

public class Triangle_Area {

    public static void main(String[] args){
        float base,height,area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base = sc.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextFloat();
    
        area = (base*height)/2;
    
        System.out.println("Area of triangle is "+ area);
    }
    
}
