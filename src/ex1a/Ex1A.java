package ex1a;

import java.util.Scanner;
public class Ex1A {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.print("Posa el teu nom:");
        int a=0, e=0, ic=0, o=0, u=0, cons=0;
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for (int i = 0; i < name.length(); ++i) {
            switch(name.charAt(i)) {
            case 'a':   
            case 'A':
                a++;
                break;
            case 'e':
            case 'E':    
                e++;
                break;
            case 'i':   
            case 'I':
                ic++;
                break;
            case 'o':   
            case 'O':    
                o++;
                break;
            case 'u':   
            case 'U':
                u++;
                break;
            default: cons++;
                break;
            }
        }
        System.out.println(replacer(name));
        System.out.println("A: " + a + "\tE: " + e + "\tI: " + ic+ "\tO: " + o+ "\tU: "+u+ "\t  Cons: "+cons);
  }

    /*
     * Replace lower vowels to upper vowels
     * @author Marc Serret
     * @version 2017/October
     * @param name, input by user
     * @return name
     */
    private static String replacer(String name) {
        name=name.replaceAll("a", "A");
        name=name.replaceAll("e", "E");
        name=name.replaceAll("i", "I");
        name=name.replaceAll("o", "O");
        name=name.replaceAll("u", "U");
        return name;
    }
}
