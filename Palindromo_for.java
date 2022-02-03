import java.util.Scanner;

public class Palindromo_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su palabra: ");
        String palabra = sc.nextLine();
        String palabra_invertida = "";

        for (int i = palabra.length(); i >=0; i++) {
            palabra_invertida += palabra.charAt(i);
        }
        if (palabra.equals(palabra_invertida)) {
            System.out.println("Es palíndroma");
        } else {
            System.out.println("No es palíndroma");

        }

    }
}
