import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo paramentro");
        int paramentro2 = terminal.nextInt();

        try {

            // chamando o metodo contendo a logica do programa.
            contar(parametro1, paramentro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O Segundo parametro deve ser maior que o primeiro");

        }

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if (parametro2 < parametro1)
            throw new ParametrosInvalidosException();

        int contagem = parametro2 - parametro1;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imrprimindo o numero " + (i + 1));
        }
    }
}