import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, ano, hora, minuto;
		
		System.out.println("Digite a Data DD, MM, AAAA.");
		System.out.print("Dia: ");
		dia = sc.nextInt();
		System.out.print("Mês: ");
		mes = sc.nextInt();
		System.out.print("Ano: ");
		ano = sc.nextInt();
		
		System.out.println("Digite a Hora e os Minutos HH:MM.");
		System.out.print("Hora: ");
		hora = sc.nextInt();
		System.out.print("Minuto: ");
		minuto = sc.nextInt();
		
		System.out.println("Hoje é " + dia + "/" + mes + "/" + ano + ", e são " + hora + " horas e " + minuto + " minutos.\n");
		
		if (hora > 04 && hora <= 12) {
		System.out.println("Bom Dia");
		}
			else if(hora > 12 && hora <= 17) {
			System.out.println("Boa Tarde");
			}
				else {
				System.out.println("Boa Noite");
				}

		int N, i;
		
		i = 0;
		N = 0; 
		
		char[] quest = new char[1];
		quest [0] = 's';
		
		do {
		System.out.print("Quantos funcionários serão digitados? ");
		N = sc.nextInt();
		
		int[] idade = new int[N];
		double[] salario = new double[N];
		double[] altura = new double[N];
		char[] genero = new char[N];
		String[] nome = new String[N];
		
		for (i = 0; i < N; i++) {		
		sc.nextLine();
		System.out.println("Digite o Nome: ");
		nome[i] = sc.nextLine();
		System.out.println("Digite o Gênero M ou F: ");
		genero[i] = sc.next().charAt(0);
		System.out.println("Digite a Idade (números apenas): ");
		idade[i] = sc.nextInt();
		System.out.println("Digite o Salário em R$ (números apenas): ");
		salario[i] = sc.nextDouble();
		System.out.println("Digite a Altura em Mts (números apenas): ");
		altura[i] = sc.nextDouble();
		}
		
		double salariototal = 0;
		
		for (i = 0; i < N; i++) {
			if (genero[i] == 'M' || genero[i] == 'm') {
				System.out.println("O Funcionário " + nome[i] + ", sexo " + genero[i] + ", altura " + String.format("%.2f", altura[i]) + " mts," + " ganha R$" + String.format("%.2f", salario[i]) + " e tem " + idade[i] + " anos.");
				sc.close();}
				else {
					System.out.println("A Funcionária " + nome[i] + ", sexo " + genero[i] + ", altura " + String.format("%.2f", altura[i]) + " mts," + " ganha R$" + String.format("%.2f", salario[i]) + " e tem " + idade[i] + " anos.");
		}
		
			
			salariototal = salariototal + salario[i];
		}
		
		double salariomedio = 0;
		salariomedio = salariototal / N;
		System.out.println(" A Média Salarial dos funcionários é de R$" + salariomedio + ".");
		
		System.out.println("Gostaria de continuar? S/N.");
		sc.nextLine();
		quest[0] = sc.next().charAt(0);
		} while (quest[0] == 's' || quest[0] == 'S');
		
		sc.close();
	}

}
