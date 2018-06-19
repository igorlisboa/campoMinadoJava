package ain;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CampoMinadoJOption {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//int entrada[][] = new int[5][5];
		int jogo[][] = new int[5][5];
		
		int[][] entrada = {{1,0,0,0,0},{0,0,0,0,0},{1,1,1,1,1},{0,0,0,0,1},{1,0,0,0,1}};
		
		
		//System.out.println("Coloque os valores do campo minado [1-bomba / 0-vazio]:");
	/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				//entrada[i][j] = teclado.nextInt();
				String resp = JOptionPane.showInputDialog("Coloque os valores do campo minado [1-bomba / 0-vazio]:");
				entrada[i][j] =  Integer.parseInt(resp);

			}
		}*/
		
		for (int i = 0; i <5 ; i++) {
			for (int j = 0; j < 5; j++) {
				//entrada[i][j];
				//int /*linhaconfere*/lc = i - 1;
				//int /*colunaconfere*/cc = j - 1;
				//for ( int lc = i-1 ; lc <= i+1; lc++) {
				
				
				//conferindo a linha de cima
				int lc = i-1;
				int cc;
				for ( cc = j-1 ; cc <=j+1; cc++) {
						if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
							
						}else{
							/*if(entrada[lc][cc] == entrada[lc][cc]){
								
							}else*/
							int conferindo = entrada[lc][cc];
							if (conferindo == 1) jogo[i][j]++;
							
						}
					}
				
				
				//conferindo os valores da esquerda e da direita
				//esquerda
				lc = i;
				 cc = j-1;
				if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
					
				}else{
					int conferindo = entrada[lc][cc];
					if (conferindo == 1) jogo[i][j]++;
					
				}
				//direita
				lc = i;
				 cc = j+1;
				if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
					
				}else{
					int conferindo = entrada[lc][cc];
					if (conferindo == 1) jogo[i][j]++;
					
				}
				
				//conferindo a linha de baixo
				 lc = i+1;
				for ( cc = j-1 ; cc <=j+1; cc++) {
						if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
							
						}else{
							/*if(entrada[lc][cc] == entrada[lc][cc]){
								
							}else*/
							int conferindo = entrada[lc][cc];
							if (conferindo == 1) jogo[i][j]++;
							
						}
					}
				
				
				/*for ( int lc = i+1 ; lc < 1; lc++) {
					for ( int cc = j-1 ; cc < 3; cc++) {
						if (entrada[lc][cc] == 1) {
							jogo[i][j]++;
						}
					}
				}*/
				
			}
		}
		
		
		String jog = jogo[0].toString();
		
		
		
		JOptionPane.showMessageDialog(null, jog);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(jogo[i][j]+"\t");
				
			}
			System.out.println("\n");
		}/*
		o[0]+"\n"+jogo[1]+"\n"+jogo[2]+"\n"+jogo[3]+"\n"+jogo[4]
		*/

	}

}
