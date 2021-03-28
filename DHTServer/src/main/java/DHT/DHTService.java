package DHT;

import com.cloud.grpc.DHTGrpc.DHTImplBase;
import com.cloud.grpc.DHTOuterClass.getRequest;
import com.cloud.grpc.DHTOuterClass.putRequest;
import com.cloud.grpc.DHTOuterClass.putResponse;
import com.cloud.grpc.DHTOuterClass.getResponse;

import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;


public class DHTService extends DHTImplBase {
    public static int N;
    DHT_server[] server;

    public DHTService(){
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter no. of DHT Servers");
//        N = in.nextInt(); //change this for testing
        /**
         * Have made number of servers = 1 as
         * for every single port there would be a single
         * server running
         *
         * */
        N = 1;
        server = new DHT_server[N];
        for(int i=0; i<N; i++) server[i] =new DHT_server();
    }
    @Override
    public void put(putRequest request, StreamObserver<putResponse> responseObserver) {
        System.out.println("Put Request");
        long Key = request.getKey();
        byte[] Value = request.getVal().toByteArray();
        int version = request.getVersion();

        int serverNo =(int)( Key % N);
        int ret = server[serverNo].put(Key, Value, version);

        putResponse.Builder response = putResponse.newBuilder();

        response.setSuccess(ret);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void get(getRequest request, StreamObserver<getResponse> responseObserver) {
        System.out.println("Get Request");
        long Key = request.getKey();
        int serverNo =(int)(Key % N);

        DHT_server.Tuple t = server[serverNo].get(Key);
        getResponse.Builder response = getResponse.newBuilder();
        if(t == null){
            response.setVersion(0);
            byte[] byteArray = new byte[0];

            response.setVal(ByteString.copyFrom(byteArray));
        }
        else{
            response.setVersion(t.x);
            response.setVal(ByteString.copyFrom(t.y));
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
