import java.util.*;

public class ejercicio1{

	public static void main(String[] args) {

		Scanner num=new Scanner (System.in);
		System.out.println("Ingresear numero inicial");
		int inicio=num.nextInt();
		System.out.println("ingrese numero final");
		int fin=num.nextInt();

     	System.out.println("numeros pares");
		for (int i = inicio; i <=fin; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("numeros impares)");
		for (int j = inicio; j < fin; j++) {
			if(j%2!=0){
				System.out.println(j);
			}
		}
	}
}