package ru.netology;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    int port = 9999;
    int poolSizeThreads = 64;
    final var server = new Server(poolSizeThreads, port);
    server.start();
  }
}




