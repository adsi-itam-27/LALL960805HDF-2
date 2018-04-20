package mx.com.itam.adsi.ejercicio;

public class Solution{

	public Solution(){
	}

	public boolean problema(String s){
		boolean res = false;//iniciamos suponiendo que el string no se compone de substrings repetidos
		String subCad = ""; //iniciamos nuestra sucadena como vacía
		double cont = 0; //índice para recorrer el String
		double lim = s.length()/2
		int veces = 0;
		String prueba ="";

		while(!res && cont < lim){
			subCad = subCad + s.charAt(cont)
			cont++;
			if((lim*2)%cont==0){
				veces = lim*2/cont;
				for(int i = 0;i<cont;i++){
					prueba = prueba + subCad;
				}
			res = s.equals(prueba);
			}
		}
		return res;
	}
}
