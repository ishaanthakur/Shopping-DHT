package DHT;
import java.util.*;

public class DHT_server {
    private HashMap < Long, byte[] > mp;
    private HashMap < Long, Integer > version_mp;

    public DHT_server() {
        mp = new HashMap < > ();
        version_mp = new HashMap < > ();
    }
    class Tuple {
        public final int x; //version no.
        public final byte[] y; //byte array value
        public Tuple(int x, byte[] y) {
            this.x = x;
            this.y = y;
        }
    }

    public int put(long Key, byte[] value, int version) {
        if (version_mp.get(Key) == null) {
            version_mp.put(Key, 0);
            mp.put(Key, value);
            return 1;
        } else if (version == version_mp.get(Key) + 1) {
            if (value == null || value.length == 0) {
                mp.remove(Key);
                version_mp.remove(Key);
                return 0;
            } else {
                mp.put(Key, value);
                version_mp.put(Key, version);
                return 1;
            }
        }
        return -1;
    }

    public Tuple get(Long Key) {
        if (mp.get(Key) == null) return null;

        Tuple ret = new Tuple(version_mp.get(Key), mp.get(Key));
        return ret;
    }
}
