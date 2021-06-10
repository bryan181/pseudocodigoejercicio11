public class ejercicio11{
	public static void main(String[] args){

		int num;
		double promedPares;
		int pares=0;
		int cantNumPares=0;
		int cantNumImpares=0;
		int num_2aDocena=0;
		int numeroMayor=0;

		for (int i=0;i<10 ;i++) {
			num=(int)(Math.random()*10);
			System.out.println(num);

			if ((num % 2)==0) {
				if (num==0) {
					System.out.println("El '0' anterior se omite");	
				} 
				else {
					pares += num;
					cantNumPares++;
				}
			} 
			else {
				cantNumImpares++;
			}
			if (num>numeroMayor) {
				numeroMayor=num;
			}
			if (num<=24 && num>=13) {
				num_2aDocena++;
			}
		}
		promedPares=pares/cantNumPares;
		System.out.println("El numero mayor es: "+numeroMayor);
		System.out.println("Cantidad de numeros impares: "+cantNumImpares);
		System.out.println("Promedio de numeros pares: "+promedPares);
		System.out.println("Cantidad de numeros que estan en la segunda docena: "+num_2aDocena);
	}
}