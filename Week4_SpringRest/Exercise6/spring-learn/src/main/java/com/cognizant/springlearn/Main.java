
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8090), 0);
        JwtService jwtService = new JwtService();

        server.createContext("/authenticate", new AuthController(jwtService));
        server.setExecutor(null);
        server.start();

        System.out.println("Server started at http://localhost:8090");
    }
}
