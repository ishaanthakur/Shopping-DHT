import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.*;

public class GrpcClient {
    static int server_running;
    public static void BuyThenCheckout(String customer_id) throws Exception {
        shopping s = new shopping();
        String some_random_item = "aa";
        for (int j = 0; j < 100; j++) {
            HashMap<String, Integer[]> item_list = new HashMap<>();
            int number_items = 100 + (int) (Math.random() * ((100 - 0) + 1));
            int price_per_items = 500 + (int) (Math.random() * ((100 - 0) + 1));
            some_random_item += "a";
            item_list.put(some_random_item, new Integer[]{number_items, price_per_items});
            s.Buy(item_list, customer_id);
        }
        //Uncomment to try Listing part of the code
//        List<String> ls = s.Listing(customer_id);
//        System.out.println("Contents of cart for " + customer_id);
//        for(String st : ls) System.out.println(st);

        int temp = s.CheckOutPay(customer_id);
        if(temp == 0) System.out.println("Successfully checked out " + customer_id);


    }
    public static void main(String[] args) throws Exception {

//        String[] items = new String[]{"Car", "Bike", "Gloves", "Sweater", "Cap", "Hat", "Ball", "Bat", "Cake", "Drink"};
        String[] person = new String[]{"Robert", "Richard", "Claire", "James", "Ishaan", "David", "William",
                "Thomas", "Michael", "Charles", "Dogby", "Elizabeth", "Junior", "Senior", "Brooklyn", "Bestbuy",
                "Rupert","Harry", "Walmart", "Douglas"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of servers running: ");
        server_running = in.nextInt();
        System.out.println("Enter no. of concurrent shoppers");
        int no_of_users = in.nextInt(); //change this for testing
        long startTime = System.currentTimeMillis();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < no_of_users; ++i) {
            int finalI = i;
            Thread t = new Thread(){
                public void run(){
                    try {
                        GrpcClient.BuyThenCheckout(person[finalI]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            t.start();
            threads.add(t);
        }

        // and now wait for all of them to complete
        for (Thread t : threads) {
            t.join();
        }


        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;

        System.out.println("Process Ended! in " + timeElapsed + " millisec");



    }
}
