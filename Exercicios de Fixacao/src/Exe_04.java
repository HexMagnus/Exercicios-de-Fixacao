
public class Exe_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, valor;
		a =10;
		b=5;
		
		valor = (a * b) + (a-b) /b;
		
		if(valor <5)
			System.out.println("\nValor " + valor + " menor que 5");
		else if(valor <=10)
			System.out.println("\nValor " + valor + " menor ou igual a 10");
		else
			System.out.println("\nvalor " + valor + " maior que 10");
		
	}

}
