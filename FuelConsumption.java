import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        double noOfLitres,distance;
        float litres_100km,miles,gallons,miles_gallons;
        
        System.out.println("Enter the no of litres to fill the tank");
        noOfLitres=sc.nextInt();
        if(noOfLitres<=0){
            System.out.println(noOfLitres+"is an invalid input");
            System.exit(0);
        }
        System.out.println("Enter the distance covered");
        distance=sc.nextInt();
        if(distance<=0){
            System.out.println(distance+"is an invalid input");
            System.exit(0);
        }
        litres_100km=(float) ((noOfLitres/distance)*100);
        System.out.println("litres_100km");
        System.out.printf("%.2f",litres_100km);
        System.out.println();
        miles=(float)(distance*0.6214);
        gallons=(float)(noOfLitres*0.2642);
        miles_gallons=miles/gallons;
        System.out.println("miles/gallons");
        System.out.printf("%.2f",miles_gallons);
    }
}
