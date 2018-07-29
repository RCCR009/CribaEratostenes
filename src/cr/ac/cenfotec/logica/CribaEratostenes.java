package cr.ac.cenfotec.logica;

public class CribaEratostenes {

	public static int[] generaCriba(int tope){
		if (tope >= 2){
			int dim = tope+1;
			boolean[] primo = determinarPrimos(dim);	
			int[] primos = obtenerNumerosPrimos(dim, primo);	
			return primos;			
		} else {
			return new int[0];
		}
	}

	private static int[] obtenerNumerosPrimos(int dim, boolean[] primo) {
		int cuenta = 0;		
		for (int i = 0; i < dim; i++){
			if (primo[i])
				cuenta++;
		}
		int[] primos = new int[cuenta];
		for (int i=0, j=0; i < dim; i++){
			if (primo[i])
				primos[j++] = i;
		}
		return primos;
	}

	private static boolean[] determinarPrimos(int dim) {
		boolean[] primo = new boolean[dim];	
		for (int i = 0; i < dim; i++){
			primo[i] = true;
		}
		primo[0] = primo[1] = false;
		for (int i = 2; i< Math.sqrt(dim) + 1; i++){
			if (primo[i]){
				for (int j = 2*i; j < dim; j+=i){
					primo[j] = false;
				}
			}
		}
		return primo;
	}
}