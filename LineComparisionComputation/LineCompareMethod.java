package Day8.LineComparisionComputation;

import java.util.Scanner;

public class LineCompareMethod {
    static int x1 = 55;
    static int y1 = 40;
    static int x2 = 10;
    static int y2 = 12;
    static int x3 = 55;
    static int y3 = 40;
    static int x4 = 10;
    static int y4 = 12;
    String length1 = " ";
    String length2 = " ";

    public void lengthCalculation(){
        length1 = String.valueOf(Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
        length2 = String.valueOf(Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2));
        System.out.println("The length between (x1, y1) and (x2, y2) is " + length1);
        System.out.println("The length between (x3, y3) and (x4, y4) is " + length2);
    }

    private void useEqualMethod(){
        //use equal method to check equality of two lines
        if (length1.equals(length2)){
            System.out.println("Length of two lines are equal");
        }
        else {
            System.out.println("Length of two lines are different");
        }
    }

    private void useCompareMethod(){
        //using compareTo method two lines
        double diff = (length1.compareTo(length2));
        System.out.println("Difference between two lines = " + diff);
    }

    public static void main(String[] args) {
    /*    int x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 point: ");
        x1 = sc.nextInt();
        System.out.print("Enter y1 point: ");
        y1 = sc.nextInt();
        System.out.print("Enter x2 point: ");
        x2 = sc.nextInt();
        System.out.print("Enter y2 point: ");
        y2 = sc.nextInt();

        System.out.println();

        int x3, y3, x4, y4;
        System.out.print("Enter x3 point: ");
        x3 = sc.nextInt();
        System.out.print("Enter y3 point: ");
        y3 = sc.nextInt();
        System.out.print("Enter x4 point: ");
        x4 = sc.nextInt();
        System.out.print("Enter y4 point: ");
        y4 = sc.nextInt();*/

        LineCompareMethod method = new LineCompareMethod();
        method.lengthCalculation();    //call method calculate lengths of two lines
        method.useEqualMethod();       //call method to check equality of line
        method.useCompareMethod();     //call method to compare length
    }
}
