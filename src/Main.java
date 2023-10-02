import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, fator;
        Scanner in = new Scanner(System.in);
        System.out.print("Insira o número para realizar o calculo fatorial: ");
        num = in.nextDouble();
        for(fator=1; num>1; num = num - 1)
            fator=fator*num;

        System.out.print("O resultado de numero fatorado é " +fator);
        System.exit(0);
    }
}

