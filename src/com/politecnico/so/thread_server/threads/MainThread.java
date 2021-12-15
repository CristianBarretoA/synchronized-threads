package com.politecnico.so.thread_server.threads;

import com.politecnico.so.thread_server.process.InitSync;

public class MainThread extends Thread {

    private String hilo;
    private final InitSync initSync;

    public MainThread(InitSync initSync, String hilo) {
        this.hilo = hilo;
        this.initSync = initSync;
    }

    /**
     * Inicia un proceso de sincronizado segun pedido
     */
    @Override
    public void run() {
        switch (hilo) {
            case "GENERATOR":
                this.initSync.initGenerator();
                break;
            case "CONSUMER":
                this.initSync.initConsumer();
                break;
        }
    }
}
