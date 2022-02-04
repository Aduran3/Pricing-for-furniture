// Furniture pricing based on dimensions of the product

import java.util.*;
class Sofa
{
    private String name;
    private double width,height,depth;

    public String getName() {
        return name;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getDepth() {
        return depth;
    }

    public void setName(String i) {
        name = i;
    }
    public void setWidth(double i) {
        width = i;
    }
    public void setHeight(double i) {
        height = i;
    }
    public void setDepth(double i) {
        depth = i;
    }
    public double Price(double cost) {
        return cost*(width+height+depth);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Sofa mySofa = new Sofa();
        String newName;
        double temp;

        System.out.println("=====================");
        System.out.println("Your furniture");
        System.out.println("=====================");

        System.out.print("Name: ");
        newName=s.next();
        mySofa.setName(newName);

        System.out.print("\nWidth: ");
        temp=s.nextDouble();
        mySofa.setWidth(temp);

        System.out.print("\nHeight: ");
        temp=s.nextDouble();
        mySofa.setHeight(temp);

        System.out.print("\nDepth: ");
        temp=s.nextDouble();
        mySofa.setDepth(temp);

        System.out.print("\nCost: ");
        temp=s.nextDouble();

        System.out.println("=====================");
        System.out.println("Data");
        System.out.println("=====================");
        System.out.print("\nName: "+mySofa.getName());
        System.out.print("\nWidth: "+mySofa.getWidth());
        System.out.print("\nHeight: "+mySofa.getHeight());
        System.out.print("\nDepth: "+mySofa.getDepth());
        System.out.print("\nCost: "+mySofa.Price(temp));
    }
}