

/**
 * Algoritmo de ordenamiento por seleccion
 *
 */
public class OrdenarPorSeleccion {
	final static int MAX=5;
	final static int MAXNUM=100000;
	
	/**
	 * O(n^2)
	 */
	public void seleccion(int arr[]) {
		int i, j, menor, pos, tmp;
		for (i = 0; i < MAX; i++) { // tomamos como menor el primero
			menor = arr[i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (j = i + 1; j < MAX; j++){ // buscamos en el resto
				if (arr[j] < menor) { // del array algún elemento
					menor = arr[j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i){ // si hay alguno menor se intercambia
				tmp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = tmp;
			}
		}
	}
	
	public void cargarArrAleaorio(int arr[], int e) {
		for (int i = 0 ; i < e; i++)
			arr[i] = (int)(Math.random()*MAX+1);
		}
	
		public void mostrarArreglo(int[] arr) {
		for (int i=0;i<MAX;i++)
			System.out.println(arr[i]);
	}
}
	
