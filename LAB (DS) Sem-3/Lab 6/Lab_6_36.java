
// Create methods to convert temperature from Celsius to Fahrenhit and vice  versa. 
//Take temperature input from user and call the appropriate conversion method.

import java.util.*;
class Converter{
    double cel;
    double far;
Scanner sc =new Scanner(System.in);

    public void toCelsius(){
        
        System.out.println("Enter temperature of Fahrenhit : ");
         far = sc.nextDouble();
         cel = ((far - 32) * 5/9);

        System.out.println("Fahrenhit "+far+" to Celsius : "+cel);
    }


    public void toFahrenhit(){
        
        System.out.println("Enter temperature of Celsius : ");
         cel = sc.nextDouble();
         far = (9*cel/5 + 32);

        System.out.println("Celsius "+cel+" to Fahrenhit : "+far);
    }
}

class Lab_6_36{
    public static void main(String[] args){
        Converter con = new Converter();
        Scanner sc = new Scanner(System.in);
        System.out.println("If you convert Fahrenhit to Celsius then enter 'c' or for invert process 'f'");
        char ch = sc.next().charAt(0);

        if(ch == 'C' || ch == 'c'){
            con.toCelsius();
        }
        else if(ch == 'F' || ch == 'f'){
            con.toFahrenhit();
        }
        else{
            System.out.println("Not Perfact ans");
        }
    }
}