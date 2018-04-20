package mx.com.itam.adsi.ejercicio;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test; 

public class TestSolution{
	public Solution s = new Solution();

	public boolean pruebaSolucion(String s, Boolean esConcatenado){
		boolean res = false;
		
		res = s.problema(s);

                return res;
	}

	@Test
        public void prueba1(){
                assertTrue("La línea es 'blabla'",pruebaSolucion("blabla"));
}
