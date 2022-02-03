import java.util.Scanner;

public class Palindromo_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();
        String palabra_invertida ="";

        StringBuilder stringBuilder = new StringBuilder(palabra);
        palabra_invertida = stringBuilder.reverse().toString();
        if (palabra.equals(palabra_invertida)) {
            System.out.println("Es palíndroma");
        } else {
            System.out.println("No es palíndroma");
        }
    }
}
