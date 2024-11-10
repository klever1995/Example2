import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class app {
    public static void main(String[] args) throws IOException {
       
        
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8080), 0);
        
        
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                
                String response = "<html><body style='text-align:center; color:red;'>"
                                + "Hello, Engineer! This is a Docker container running a Java app."
                                + "</body></html>";
                
               
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        
       
        server.start();
        System.out.println("Server is listening on port 8080...");
    }
}

