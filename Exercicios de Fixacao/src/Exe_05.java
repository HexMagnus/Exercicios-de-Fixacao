
public class Exe_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, valor;
		a=10;
		b=5;
		
		valor = ((a*b) + (a-b)) / b;
		
		switch(valor) {
		
		case 5:
			
			System.out.println("\n"+ valor + "=4");
			break;
		
		case 10:
		
			System.out.println("\n"+ valor + "=10");
			break;
			
		default:
			System.out.println("\n"+ valor + " diferente de 5 e 10");
			break;
			
		}
		
	}

}
