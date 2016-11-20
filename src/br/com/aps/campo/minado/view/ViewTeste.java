package br.com.aps.campo.minado.view;

import br.com.aps.campo.minado.model.Campo;

public class ViewTeste {

	public static void main(String[] args) {
		Campo campo = new Campo(5, 5, 2);
		
		int[][] mn = campo.getMinas();
		int[][] cp = campo.getCampo();
		
		System.out.println("Array de minas!!!");
		for (int i = 0; i < mn.length; i++) {
			for (int j = 0; j < mn[i].length; j++) {
				System.out.print("\t"+mn[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n\n\n\n\n");
		
		
		System.out.println("Array do campo!!!");
		for (int i = 0; i < cp.length; i++) {
			for (int j = 0; j < cp[i].length; j++) {
				System.out.print("\t"+cp[i][j]+"\t");
			}
			System.out.print("\n");
		}
		

	}

}
