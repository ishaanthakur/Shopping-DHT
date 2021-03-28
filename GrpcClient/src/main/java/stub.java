import com.cloud.grpc.DHTGrpc;
import com.cloud.grpc.DHTOuterClass.putRequest;
import com.cloud.grpc.DHTOuterClass.getRequest;
import com.cloud.grpc.DHTOuterClass.putResponse;
import com.cloud.grpc.DHTOuterClass.getResponse;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class stub implements Serializable{

    // adapted from String.hashCode() java vs python hashing
    public static long hash(String string) {
        long h = 1125899906842597L;
        int len = string.length();

        for (int i = 0; i < len; i++) {
            h = 31*h + string.charAt(i);
        }
        return h;
    }
    public int stub_put(String Path, shopping.Shopper s, int version) throws Exception{

        List<Integer> port_set = new ArrayList<>();
        port_set.add(8000);
        port_set.add(8010);
        port_set.add(8020);
        port_set.add(8030);
        port_set.add(8040);
        port_set.add(8050);
        port_set.add(8060);
        port_set.add(8070);

        int ind = (int)(hash(Path)%(GrpcClient.server_running));

        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost", port_set.get(ind)).usePlaintext().build();
        DHTGrpc.DHTBlockingStub DHTStub = DHTGrpc.newBlockingStub(channel);
        long key_final = hash(Path);
        if(s == null) {
            byte[] tempByte = new byte[0];
            putRequest pr_null = putRequest.newBuilder().setKey(key_final).setVal(ByteString.copyFrom(tempByte)).setVersion(version).build();
            putResponse pr_null_response = DHTStub.put(pr_null);
            return pr_null_response.getSuccess();
        }
        byte[] data = BytesUtil.toByteArray(s);
        putRequest pr = putRequest.newBuilder().setKey(key_final).setVal(ByteString.copyFrom(data)).setVersion(version).build();
        putResponse pr_response = DHTStub.put(pr);
        return pr_response.getSuccess();

    }

    public shopping.Shopper stub_get(String Path) throws Exception{


        List<Integer> port_set = new ArrayList<>();
        port_set.add(8000);
        port_set.add(8010);
        port_set.add(8020);
        port_set.add(8030);
        port_set.add(8040);
        port_set.add(8050);
        port_set.add(8060);
        port_set.add(8070);

        int ind = (int)(hash(Path)%(GrpcClient.server_running));
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost", port_set.get(ind)).usePlaintext().build();
        DHTGrpc.DHTBlockingStub DHTStub = DHTGrpc.newBlockingStub(channel);

        long key_final = hash(Path);
        getRequest gr = getRequest.newBuilder().setKey(key_final).build();
        getResponse gr_response = DHTStub.get(gr);
        if(gr_response.getVal().size() == 0) return null;
        byte[] shopper_byte_arr = gr_response.getVal().toByteArray();
        int version = gr_response.getVersion();
        shopping.Shopper s = (shopping.Shopper) BytesUtil.toObject(shopper_byte_arr);
        if(s == null) return null;
        s.version = version + 1;
        return s;



//        int server_no = (int) (hash(Path)%(Main.N));
//        long key_final = hash(Path);
//        if(Main.dht_servers[server_no].get(key_final) == null) return null;
//
//        byte[] shopper_byte_arr = Main.dht_servers[server_no].get(key_final).y;
//        int version = Main.dht_servers[server_no].get(key_final).x;
//
//        shopping.Shopper s = (shopping.Shopper) BytesUtil.toObject(shopper_byte_arr);
//        if(s == null) return null;
//        s.version = version + 1;
//
//        return s;

    }

}
