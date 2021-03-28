
import java.io.Serializable;
import java.util.*;

public class shopping implements Serializable {
    class Shopper implements Serializable {
        HashMap < String, Integer[]> item_list; //Key corresponds to item id and values is an integer array with first value
        //corresponding to no. of items and second value being price per item
        String customer_id;
        int version;
        Shopper(HashMap < String, Integer[] > item_list, String customer_id) {
            this.item_list = item_list;
            this.customer_id = customer_id;
            this.version = 1;
        }
    }

    public int Buy(HashMap < String, Integer[] > item_list, String customer_id) throws Exception {

        String keypath = "/Customer_directory/" + customer_id;
        stub sb = new stub();
        Shopper s;
        if (sb.stub_get(keypath) == null) {
            s = new Shopper(item_list, customer_id);
        } else {
            s = sb.stub_get(keypath);
            for (Map.Entry < String, Integer[] > e: item_list.entrySet()) {
                s.item_list.put(e.getKey(), e.getValue());
            }

        }
        return sb.stub_put(keypath, s, s.version);
    }

    public List<String> Listing(String customer_id) throws Exception {
        String keypath = "/Customer_directory/" + customer_id;
        stub sb = new stub();
        Shopper s = sb.stub_get(keypath);
        if (s == null) {
//            System.out.println("Cart is Empty!");
            return Collections.emptyList();
        }

//        System.out.println("Listing for " + s.customer_id + " : ");
//        for (Map.Entry < String, Integer[]> e: s.item_list.entrySet()) {
//            System.out.println("Item: " + e.getKey() + " units: " + e.getValue()[0] + " Price: "+e.getValue()[1]);
//        }

        List<String> ret = new ArrayList<>();
        for (Map.Entry < String, Integer[]> e: s.item_list.entrySet()) {
            ret.add(e.getKey());
        }
        return ret;

    }

    public int Update(String customer_id, String item_number, int add_or_subt) throws Exception {
        String keypath = "/Customer_directory/" + customer_id;
        stub sb = new stub();
        Shopper s = sb.stub_get(keypath);
        if (s == null) return -1;

         if (s.item_list.getOrDefault(item_number, new Integer[]{0, 1})[0] + add_or_subt <= 0) s.item_list.remove(item_number);
        else s.item_list.put(item_number, new Integer[]{s.item_list.getOrDefault(item_number, new Integer[]{0, 1})[0] + add_or_subt, s.item_list.getOrDefault(item_number, new Integer[]{0, 1})[1]});
 
        return sb.stub_put(keypath, s, s.version);
    }

    public int CheckOutPay(String customer_id) throws Exception {
        String keypath = "/Customer_directory/" + customer_id;
        stub sb = new stub();
        Shopper s = sb.stub_get(keypath);
        if (s == null) return -1;
        return sb.stub_put(keypath, null, s.version);

    }
}
