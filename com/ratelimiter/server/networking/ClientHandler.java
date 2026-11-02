package com.ratelimiter.server.networking;

import java.net.Socket;

/** Stub: accepts a connection and logs the remote address. Extended in step 05. */
final class ClientHandler {

    private final Socket socket;
    private final int socketTimeoutMs;

    ClientHandler(Socket socket, int socketTimeoutMs) {
        this.socket = socket;
        this.socketTimeoutMs = socketTimeoutMs;
    }

    void run() {
        try (Socket s = socket) {
            System.out.println("[Handler] Got connection from " + socket.getRemoteSocketAddress());
        } catch (Exception e) {
            System.err.println("[ClientHandler] Error: " + e.getMessage());
        }
    }
}
