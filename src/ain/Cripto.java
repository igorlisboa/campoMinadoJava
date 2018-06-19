package ain;

import java.util.Scanner;

public class Cripto {
	
    public String criptografar(String texto) {  
        
    	 String alfabeto = " <abcdefghijklmnopqrstuvwxyz��������ABCDEFGHIJKLMNOPQRSTUVWXYZ��������1234567890.;:?,�]}�[{�!@#$%&*()_+-=\\/|\'\">";   
      
         char[] t = texto.toCharArray();  
      
         String palavra="";  
      
         for (int i = 0; i < t.length; i++) {  
      
        	 int posicao = alfabeto.indexOf(t[i]) + 7;  
      
             if (alfabeto.length() <= posicao) {  
      
            	 posicao = posicao - alfabeto.length();  
      
             }  
      
             	palavra = palavra + alfabeto.charAt(posicao);  
      
            }  
      
         return palavra;  
      
    } 
    
    
    public String descriptografar(String texto) {  
        
   	 String alfabeto = " <abcdefghijklmnopqrstuvwxyz��������ABCDEFGHIJKLMNOPQRSTUVWXYZ��������1234567890.;:?,�]}�[{�!@#$%&*()_+-=\\/|\'\">";   
     
        char[] t = texto.toCharArray();  
     
        String palavra="";  
     
        for (int i = 0; i < t.length; i++) {  
     
       	 int posicao = alfabeto.indexOf(t[i]) - 7;  
     
            if (posicao < 0) {  
     
           	 posicao =  alfabeto.length() + posicao;  
     
            }  
     
            	palavra = palavra + alfabeto.charAt(posicao);  
     
           }  
     
        return palavra;  
     
       }
    
	
	
	
	public static void main(String[] args) {
		String texto="" ;
		Cripto codificada = new Cripto();
		Cripto normal = new Cripto();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\tSistema de criptografia ");
		System.out.println("Digite uma mensagem de ate 128 caracteres para ser criptografada:");
		texto = teclado.nextLine();
		if (texto.length() > 128) {
			System.out.println("Mensagem excedeu 128 caracteres, favor digitar mensagem menor.");
			texto = teclado.nextLine();
		}
		
		
		//CRIPTOGRAFANDO O TEXTO E MOSTRANDO
		texto = codificada.criptografar(texto);
		System.out.println("A mensagem criptografada �: "+texto);
		
		
		//DESCRIPTOGRAFANDO O TEXTO E MOSTRANDO
		texto = normal.descriptografar(texto);
		System.out.println("E a mensagem descriptografada �: "+texto);

	}

}
