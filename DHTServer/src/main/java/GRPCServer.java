import DHT.DHTService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.Scanner;


public class GRPCServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Port No. (Sequentially One of 8000,8010,8020,8030,8040,8050, 8060,8070): ");
        int port = in.nextInt();
        Server s =ServerBuilder.forPort(port).addService( new DHTService()).build();
        s.start();
        System.out.println("Server started at " + s.getPort() );

        s.awaitTermination();

    }
}
