package br.com.aps.campo.minado.model;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Campo{
	/*	private int qtdLinhas;
		private int qtdColunas;
		private int dificuldade;
		private int[][] campo;
		private int[][]	minas;
		
//Construtor, getters e setters
		public Campo(int qtdLinhas, int qtdColunas, int dificuldade) {
			super();
			this.qtdLinhas = qtdLinhas;
			this.qtdColunas = qtdColunas;
			this.dificuldade = dificuldade;
		}
		
		
		public int getQtdLinhas() {
			return qtdLinhas;
		}
		public void setQtdLinhas(int qtdLinhas) {
			this.qtdLinhas = qtdLinhas;
		}
		public int getQtdColunas() {
			return qtdColunas;
		}
		public void setQtdColunas(int qtdColunas) {
			this.qtdColunas = qtdColunas;
		}
		public int getDificuldade() {
			return dificuldade;
		}
		public void setDificuldade(int dificuldade) {
			this.dificuldade = dificuldade;
		}
		public int[][] getCampo() {
			return campo;
		}
		public void setCampo(int[][] campo) {
			this.campo = campo;
		}
		public int[][] getMinas() {
			return minas;
		}
		public void setMinas(int[][] minas) {
			this.minas = minas;
		}
		
		
//Metodos
		
		public int[][] montarCampo(){
			//usar metodo randomico para gerar matriz de 0s e 1s de acordo com a dificuldade
			Random aleatorio = new Random();
			int numBombas = numBombas();
			int [][] coordenadas = new int[numBombas][2];
			
			for (int i = 0; i < numBombas; i++) {
				
				coordenadas[i][0] = aleatorio.nextInt(qtdLinhas-1);
				coordenadas[i][1] = aleatorio.nextInt(qtdColunas-1);
				
				if(!unicaCoordenada(coordenadas, coordenadas[i][0],coordenadas[i][1])){
					boolean sair = false;
					while(true){}
					
					coordenadas[i][0] = aleatorio.nextInt(qtdLinhas-1);
					coordenadas[i][1] = aleatorio.nextInt(qtdColunas-1);
				}
				
			}
			
			
			return getCampo();
		}
		
		public boolean unicaCoordenada(int[][] coordenadas,int i, int j){
			for (int a = 0; a < coordenadas.length; a++) {
				if((coordenadas[a][0] == i) && (coordenadas[a][1] == j)){
					
				}else{
					return false;
				}
			}
			
			return true;
			
		}
		
		
		public int numBombas(){
			int numBombas;
			int areaTtl = qtdColunas * qtdLinhas;
			
			if(dificuldade == 1){
				numBombas = (int) Math.round(areaTtl * 0.1);
			}else if(dificuldade == 2){
				numBombas = (int) Math.round(areaTtl * 0.2);
			}else if(dificuldade == 3){
				numBombas = (int) Math.round(areaTtl * 0.5);
			}else if(dificuldade == 4){
				numBombas = (int) Math.round(areaTtl * 0.8);
			}else 
			
			return numBombas;
		}
		
		
	
		/*int [][] minas = {{0,1,0,1,1},
						  {0,0,0,1,0},
						  {0,0,1,1,1},
						  {0,0,0,1,0},
						  {1,0,0,0,0}};
		int[][] campo = new int[5][5];
		
		
		
		
		for (int i = 0; i < minas.length; i++) {
			for (int j = 0; j < minas.length; j++) {
				
			}
		}*/
		
		
	 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//int entrada[][] = new int[5][5];
		int jogo[][] = new int[5][5];
		
		int[][] entrada = {{1,0,0,0,0},
						   {0,0,0,0,0},
						   {1,1,1,1,1},
						   {0,0,0,0,1},
						   {1,0,0,0,1}};
		
		
		//System.out.println("Coloque os valores do campo minado [1-bomba / 0-vazio]:");
		
		/*for (int i = 0; i < 5; i++) {
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
			
			
			
			/*JOptionPane.showMessageDialog(null, jog);o[0]+"\n"+jogo[1]+"\n"+jogo[2]+"\n"+jogo[3]+"\n"+jogo[4];*/
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(jogo[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
