package SyntaxTest

import org.eclipse.jetty.server.Server

class EmbeddedJetty {

    static void main(String[] args) {
        def server = new Server(8080);
        server.start();
        server.join();
    }

}
