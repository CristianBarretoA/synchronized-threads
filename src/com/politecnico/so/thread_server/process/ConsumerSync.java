package com.politecnico.so.thread_server.process;

public class ConsumerSync {

    public ConsumerSync() {

    }

    public synchronized void initConsumer() {
        try {
            System.out.println("Inicia el hilo consumidor");
            wait();
            System.out.println("El valor de la variable vacío es:");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
