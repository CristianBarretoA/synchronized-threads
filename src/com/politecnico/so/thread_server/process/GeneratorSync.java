package com.politecnico.so.thread_server.process;

public class GeneratorSync {

    private boolean empty;

    public GeneratorSync() {
        this.empty = true;
    }

    public synchronized void initGenerator() {
        try {
            System.out.println("Inicia el hilo generador con variable vacio en: " + this.empty);
            java.lang.Thread.sleep(2000);
            this.empty = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
