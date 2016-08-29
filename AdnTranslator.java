package BB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdnTranslator {
static boolean valor=false;
static String cadena="";
	public static Boolean isADN(String ADNCandidate){
		return null;
		
		
		
		
	}
	public static Boolean isARN(String ARNCandidate) {
		return null;

	}
	public static Boolean isValidADN(String ADNCandidate) {
if(ADNCandidate.matches("[ATCG]{1,}")){
			
			return true;
		}else{
			
			
			return false;
			
		}
	}
	public static Boolean isValidARN(String ARNCandidate) {
		
if(ARNCandidate.matches("[AUCG]{1,}")){
					
			return true;
		}else{
			
			return false;
		}

	}
	public static String toADN(String ADNCandidate) {
		return ADNCandidate.replace('U', 'T');
	}
	public static String toARN(String ARNCandidate) {
		return ARNCandidate.replace('T', 'U');
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String genes=bf.readLine();
		System.out.println(genes);
		
		valor=isValidADN(genes);
		if(valor==true){
			cadena=toARN(genes);
		}else{
			cadena=toADN(genes);
		}
		System.out.println(cadena);

	}
	

}
