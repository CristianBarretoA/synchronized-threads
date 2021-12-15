package com.politecnico.so.thread_server.process;
import java.util.Date;
public class InitSync {
    private boolean empty;
    /**
     * Incia un hilo consumidor a la espera del cambio de la variable empty
     */
    public synchronized void initConsumer() {
        try {
            System.out.println("["+new Date()+"] Inicia el hilo consumidor");
            wait();
            System.out.println("["+new Date()+"] El valor de la variable vacío en el hilo consumidor es: " + empty);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Inicializa y cambia el valor de la varialbe empty luego de 2 segundos
     */
    public synchronized void initGenerator() {
        try {
            this.empty = true;
            System.out.println("["+new Date()+"] Inicia el hilo generador con variable vacio en: " + empty);
            java.lang.Thread.sleep(2000);
            this.empty = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
