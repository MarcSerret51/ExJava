package ex3a;

import java.util.Scanner;

public class Ex3A {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Escriu l'opcio");
        Scanner sc = new Scanner(System.in);
        boolean exit=false;
        String DNA;
        String ARN;
        do {
            System.out.println("1. ADN a ARN");
            System.out.println("2. ARN a ADN");
            System.out.println("0. Exit");
            int option=sc.nextInt();
            switch (option) {
                case 0: //exit
                    exit = true;
                    break;
                case 1: 
                    System.out.println("Escriu l'ADN");
                    DNA=sc.next();
                    System.out.println(adnToArn(DNA));
                    break;                
                case 2: 
                    System.out.println("Escriu l'ARN");
                    DNA=sc.next();
                    System.out.println(arnToDna(DNA));
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }  
        } while(!exit);
        System.out.println("Exitting application!"); 
    }

    /*
     * Converts DNA to RNA
     * @author Marc Serret
     * @version 2017/October
     * @param DNA, input by user
     * @return ARN
     */
    private static String adnToArn(String DNA) {
        String ARN;
        DNA=DNA.toUpperCase();
        ARN = DNA.replaceAll("T", "U");
        return ARN;
    }
    /*
     * Converts RNA to ADN
     * @author Marc Serret
     * @version 2017/October
     * @param DNA, input by user
     * @return ARN
     */
    private static String arnToDna(String DNA) {
        String ARN;
        DNA=DNA.toUpperCase();
        ARN = DNA.replaceAll("U", "T");
        return ARN;
    }
}