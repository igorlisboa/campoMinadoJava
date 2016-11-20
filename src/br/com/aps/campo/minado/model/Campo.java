package br.com.aps.campo.minado.model;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Campo{
		private int qtdLinhas;
		private int qtdColunas;
		private int dificuldade;
		private int[][] campo;
		private int[][]	minas;
		
//Construtor, getters e setters
		public Campo(){}
		public Campo(int qtdLinhas, int qtdColunas, int dificuldade) {
			super();
			this.qtdLinhas = qtdLinhas;
			this.qtdColunas = qtdColunas;
			this.dificuldade = dificuldade;
			montaMinas();
			montarCampo();
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
		
		public int[][] montaMinas(){
			//usar metodo randomico para gerar matriz de 0s e 1s de acordo com a dificuldade
			Random aleatorio = new Random();
			int numBombas = numBombas();
			int [][] coordenadas = new int[numBombas][2];
			
			//monta um array com as coordenadas onde serão colocados as bombas(1s) 
			for (int i = 0; i < numBombas; i++) {
				
				coordenadas[i][0] = aleatorio.nextInt(qtdLinhas-1);
				coordenadas[i][1] = aleatorio.nextInt(qtdColunas-1);
				
				if(!unicaCoordenada(coordenadas, coordenadas[i][0],coordenadas[i][1])){
					boolean sair = false;
					while(sair == false){
						coordenadas[i][0] = aleatorio.nextInt(qtdLinhas-1);
						coordenadas[i][1] = aleatorio.nextInt(qtdColunas-1);
						
						 sair = unicaCoordenada(coordenadas, coordenadas[i][0],coordenadas[i][1]);
					}
				}
				
			}
			
			
			//monta as minas
			minas = new int[qtdLinhas][qtdColunas];
			for (int i = 0; i < coordenadas.length; i++) {
				int a = coordenadas[i][0];
				int b = coordenadas[i][1];
				
				minas[a][b] = 1;
				
			}
			
			
			
			
			return getMinas();
		}
		
		public boolean unicaCoordenada(int[][] coordenadas,int i, int j){
			int teste = 0;
			for (int a = 0; a < coordenadas.length; a++) {
				if((coordenadas[a][0] == i) && (coordenadas[a][1] == j)){
					teste++;
				}
			}
			if (teste == 1) {
				return true;
			}else{
				return false;
			}
			
		}
		
		
		public int numBombas(){
			int numBombas = 0;
			int areaTtl = qtdColunas * qtdLinhas;
			
			if(dificuldade == 1){
				numBombas = (int) Math.round(areaTtl * 0.1);
			}else if(dificuldade == 2){
				numBombas = (int) Math.round(areaTtl * 0.2);
			}else if(dificuldade == 3){
				numBombas = (int) Math.round(areaTtl * 0.5);
			}else if(dificuldade == 4){
				numBombas = (int) Math.round(areaTtl * 0.8);
			}
			
			return numBombas;
		}
		
		
		public int[][] montarCampo(){
			campo = new int[qtdLinhas][qtdColunas];
	
			for (int i = 0; i <qtdLinhas ; i++) {
				for (int j = 0; j <qtdColunas ; j++) {
					//conferindo a linha de cima
					int lc = i-1;
					int cc;
					for ( cc = j-1 ; cc <=j+1; cc++) {
							if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
								
							}else{
								int conferindo = minas[lc][cc];
								if (conferindo == 1) campo[i][j]++;
								
							}
						}
					
					
					//conferindo os valores da esquerda e da direita
					//esquerda
					lc = i;
					 cc = j-1;
					if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
						
					}else{
						int conferindo = minas[lc][cc];
						if (conferindo == 1) campo[i][j]++;
						
					}
					//direita
					lc = i;
					cc = j+1;
					if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
						
					}else{
						int conferindo = minas[lc][cc];
						if (conferindo == 1) campo[i][j]++;
						
					}
					
					//conferindo a linha de baixo
					 lc = i+1;
					for ( cc = j-1 ; cc <=j+1; cc++) {
						if ((lc < 0)||(cc < 0)||(lc>=5)||(cc>=5)) {
							
						}else{
							int conferindo = minas[lc][cc];
							if (conferindo == 1) campo[i][j]++;
							
						}
					}
				}
			}
			
			for (int i = 0; i < campo.length; i++) {
				for (int j = 0; j < campo[1].length; j++) {
					if(minas[i][j] == 1){
						campo[i][j] = 0;
					}
				}
			}
			
			return getCampo();
		}

}
