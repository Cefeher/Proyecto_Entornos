import java.util.Scanner;

public class Palindromo_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su palabra: ");
        String palabra = sc.nextLine();
        int let_1 = 0;
        int let_fin = palabra.length() - 1;
        boolean salir = false;
        while ((let_1 < let_fin) && (!salir)) {
            if (palabra.charAt(let_1) == palabra.charAt(let_fin)) {
                let_1++;
                let_fin--;
                System.out.println("Su palabra es palíndroma");
            } else {
                salir = true;
                System.out.println("Su palabra no es palíndroma");
            }
        }
    }
}