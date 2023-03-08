package view;


import controller.ThreadsVetor;

public class Principal {

	public static void main(String[] args) {
		  int vet [] = new int[1000];
		
		 for(int i = 0; i < 1000; i++) {
			   vet[i]=(int) (Math.random()*100)+1;
		 }
	     Thread ThreadVetor1 = new 	ThreadsVetor(1, vet);
	     Thread ThreadVetor2 = new 	ThreadsVetor(2, vet);
	      ThreadVetor1.start();
	      ThreadVetor2.start();
			
		}
	 }
