package controller;

// 0) Criar em java um projeto com uma Thread chamada
// ThreadVetor, que receba um valor numérico e vetor como
// parâmetros. Caso o valor numérico seja par, a thread deve percorrer
// o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e
// contar o tempo para percorrer o vetor. Caso o valor numérico seja
// ímpar, a thread deve percorrer o vetor utilizando uma estrutura
// foreach e contar o tempo para percorrer o vetor. No final, ambas as
// possibilidades devem apresentar o tempo em segundos.
// A operação main deve gerar um vetor de 1000 posições com
// valores aleatórios de 1 a 100. Deve iniciar 2 ThreadVetor e para
// uma passar o número 1 e o vetor e para a outra, passar o número 2
// e o mesmo vetor.

public class ThreadsVetor extends Thread{
	
    private int valor;
  private int [] vet;
    public  ThreadsVetor(int valor, int[] vet) {
   	 this.valor = valor;
   	 this.vet=vet;
    }
    @Override
    public void run() {
    
		if(valor % 2 ==1 ) {
			ThreadVetorImp();
		}else {
			ThreadVetorPar();
		    	
	}
  }
	private void ThreadVetorPar() {
		double tempoinicial = System.nanoTime();
		long somaPar=0;
		
		for (int i =0; i < 1000; i++) {
			somaPar+= i;

    	}

    	double tempofinal = System.nanoTime();
    	double tempototal = tempofinal - tempoinicial;
    	tempototal = tempototal/ Math.pow(10,9);
    			System.out.println("tempo do vetor par = "+tempototal+"s." );
		
	}
	private void ThreadVetorImp() {
		double tempoinicial = System.nanoTime();
		long somaImpar=0;
		
		for (int vetor: vet) {
		    somaImpar += vetor;
		
	}
		double tempofinal = System.nanoTime();
    	double tempototal = tempofinal - tempoinicial;
    	tempototal = tempototal/ Math.pow(10,9);
    			System.out.println("tempo do vetor impar = "+tempototal+"s." );
    }
  }		

