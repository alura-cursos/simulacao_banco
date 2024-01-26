package br.com.alura;

public class ExecutaTarefa implements Runnable{

    private static int CONTADOR = 0;
    @Override
    public void run() {
        CONTADOR++;
        System.out.println("Tarefa numero " + CONTADOR + " inicializada");
    }
}