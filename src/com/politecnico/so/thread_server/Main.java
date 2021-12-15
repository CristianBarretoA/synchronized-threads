package com.politecnico.so.thread_server;

import com.politecnico.so.thread_server.process.InitSync;
import com.politecnico.so.thread_server.threads.MainThread;

public class Main {

    public static void main(String[] args) {

        // Clase que contiene los metodos sincronizados
        InitSync initSync = new InitSync();

        //Se instancian los hilos segun su funcion
        MainThread consumer = new MainThread(initSync, "CONSUMER");
        MainThread generator = new MainThread(initSync, "GENERATOR");

        //Se ejecutan los hilos
        consumer.start();
        generator.start();

    }
}
