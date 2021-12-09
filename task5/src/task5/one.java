package task5;


import java.util.Scanner;
public class one{
    public static void main(String agrs[]){
        Scanner in=new Scanner (System.in);
        // ‰»Î
        System.out.print("Enter a,b,c:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.print("Enter color:");
        String color=in.next();
        System.out.println("1.true     2.false");
        System.out.print("Enter filled:");
        int num = in.nextInt();
        boolean filled=true;
        if(num == 1)
            filled = true;
        else
            filled = false;
        //boolean filled=in.;
        //test1.setColor("");
        //test1.setFilled(false);
        SimpleGeometricObject test1=new SimpleGeometricObject( color,  filled);
        Triangle test = new Triangle(a,b,c);
        // ‰≥ˆ
        System.out.println(test.toString());
        System.out.println(test1.toString());
    }
}
class SimpleGeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
    public SimpleGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        //System.out.print("Enter color:");
        //Scanner cin = new Scanner(System.in);
        //String num = cin.next();
        //this.color = num;
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        //System.out.print("Enter filled:");
        //Scanner cin = new Scanner(System.in);
        //boolean num = cin.hasNextBoolean();
        //this.filled = num;
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on " + dateCreated + "\ncolor: "
                + color + " and  filled: " + filled;
    }
}
class Triangle extends SimpleGeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){
        super();
        side1 = side2 = side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double p = (side1 + side2+ side3) / 2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public String toString(){
        return "Triangle:  side1=" +side1+"  side2="+side2+"  side3="+side3+"\nArea: "
                + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
}

