public class MainSegEntrega {
	
	public static void main(String[] args) {

		long t_inicial, t_final;
		int arr50[]= new int[50];
		int arr100[]= new int [100];
		int arr1000[]= new int [1000];
		int arr10000[]= new int [10000];
		int arr100000[]= new int [100000];
		int arr1000000[]= new int [1000000];
		int arr10000000[]= new int [10000000];
		
		OrdenarPorSeleccion ops50 = new OrdenarPorSeleccion();
		ops50.cargarArrAleaorio(arr50,50);
		t_inicial = System.nanoTime();
		ops50.seleccion(arr50);
		t_final = System.nanoTime();
		System.out.println(" El metodo Seleccion con  :"+ 50 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		OrdenamientoMergeSort oms50 = new OrdenamientoMergeSort();
		oms50.setValores(arr50);
		t_inicial = System.nanoTime();
		oms50.sort();
		t_final = System.nanoTime();
		System.out.println(" El metodo mergeSort con  :"+ 50 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		System.out.println("----------------------------------------------------------------");
		
		OrdenarPorSeleccion ops100 = new OrdenarPorSeleccion();
		ops100.cargarArrAleaorio(arr100,100);
		t_inicial = System.nanoTime();
		ops100.seleccion(arr100);
		t_final = System.nanoTime();
		System.out.println(" El metodo Seleccion con  :"+ 100 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		OrdenamientoMergeSort oms100 = new OrdenamientoMergeSort();
		oms100.setValores(arr100);
		t_inicial = System.nanoTime();
		oms100.sort();
		t_final = System.nanoTime();
		System.out.println(" El metodo mergeSort con  :"+ 100 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		System.out.println("----------------------------------------------------------------");
		
		OrdenarPorSeleccion ops1000 = new OrdenarPorSeleccion();
		ops1000.cargarArrAleaorio(arr1000,1000);
		t_inicial = System.nanoTime();
		ops100.seleccion(arr1000);
		t_final = System.nanoTime();
		System.out.println(" El metodo Seleccion con  :"+ 1000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		OrdenamientoMergeSort oms1000 = new OrdenamientoMergeSort();
		oms1000.setValores(arr1000);
		t_inicial = System.nanoTime();
		oms1000.sort();
		t_final = System.nanoTime();
		System.out.println(" El metodo mergeSort con  :"+ 1000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		System.out.println("----------------------------------------------------------------");
		
		OrdenarPorSeleccion ops10000 = new OrdenarPorSeleccion();
		ops10000.cargarArrAleaorio(arr10000,10000);
		t_inicial = System.nanoTime();
		ops10000.seleccion(arr10000);
		t_final = System.nanoTime();
		System.out.println(" El metodo Seleccion con  :"+ 10000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		OrdenamientoMergeSort oms10000 = new OrdenamientoMergeSort();
		oms10000.setValores(arr10000);
		t_inicial = System.nanoTime();
		oms10000.sort();
		t_final = System.nanoTime();
		System.out.println(" El metodo mergeSort con  :"+ 10000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		System.out.println("----------------------------------------------------------------");
		
		OrdenarPorSeleccion ops100000 = new OrdenarPorSeleccion();
		ops100000.cargarArrAleaorio(arr100000,100000);
		t_inicial = System.nanoTime();
		ops100000.seleccion(arr100000);
		t_final = System.nanoTime();
		System.out.println(" El metodo Seleccion con  :"+ 100000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		OrdenamientoMergeSort oms100000 = new OrdenamientoMergeSort();
		oms100000.setValores(arr100000);
		t_inicial = System.nanoTime();
		oms100000.sort();
		t_final = System.nanoTime();
		System.out.println(" El metodo mergeSort con  :"+ 100000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		System.out.println("----------------------------------------------------------------");
		
		OrdenarPorSeleccion ops1000000 = new OrdenarPorSeleccion();
		ops1000000.cargarArrAleaorio(arr10000000,1000000);
		t_inicial = System.nanoTime();
		ops1000000.seleccion(arr1000000);
		t_final = System.nanoTime();
		System.out.println(" El metodo Seleccion con  :"+ 1000000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		OrdenamientoMergeSort oms1000000 = new OrdenamientoMergeSort();
		oms1000000.setValores(arr1000000);
		t_inicial = System.nanoTime();
		oms1000000.sort();
		t_final = System.nanoTime();
		System.out.println(" El metodo mergeSort con  :"+ 1000000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		System.out.println("----------------------------------------------------------------");
		
		OrdenarPorSeleccion ops10000000 = new OrdenarPorSeleccion();
		ops10000000.cargarArrAleaorio(arr10000000,10000000);
		t_inicial = System.nanoTime();
		ops10000000.seleccion(arr10000000);
		t_final = System.nanoTime();
		System.out.println(" El metodo Seleccion con  :"+ 10000000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		OrdenamientoMergeSort oms10000000 = new OrdenamientoMergeSort();
		oms10000000.setValores(arr10000000);
		t_inicial = System.nanoTime();
		oms10000000.sort();
		t_final = System.nanoTime();
		System.out.println(" El metodo mergeSort con  :"+ 10000000 + " elementos tardó: "+ (  t_final- t_inicial )/1000000.0 +" milisegundos");
		System.out.println("----------------------------------------------------------------");
		
		

			
		}
}
