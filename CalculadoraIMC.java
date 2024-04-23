package fundamentos;
import java.util.Scanner;
import java.util.Formatter;
public class CalculadoraIMC {
    public static void main(String[] args) {
        //Inicio do Scanner
        Scanner valores = new Scanner(System.in);
        System.out.println("Olá para calcularmos o seu IMC vamos precisar das informações a baixo");
        System.out.println("informe o seu  peso atual: ");
        double peso= valores.nextDouble();
        System.out.println("Informe a sua altura atual : ");
        double altura = valores.nextDouble();
        double  calculo = peso / (altura * altura);
        System.out.println("O seu IMC pelos calculos é de %.2f%n" + calculo);
        valores.close();
        //Fechando o Scanner
    }
}
