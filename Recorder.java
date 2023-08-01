import java.util.HashMap;

public class Recorder {
    private HashMap<String, String> keyValueMap;

    public Recorder() {
        keyValueMap = new HashMap<>();
    }

    public void put(String key, String value) {
        keyValueMap.put(key, value);
        System.out.println("[" + key + "] = [" + value + "]");
    }

    public void get(String key) {
        if (keyValueMap.containsKey(key)) {
            System.out.println(keyValueMap.get(key));
        } else {
            throw new IllegalArgumentException("Key not found: " + key);
        }
    }

    public void delete(String key) {
        if (keyValueMap.containsKey(key)) {
            keyValueMap.remove(key);
            System.out.println("deleted: " + key);
        } else {
            throw new IllegalArgumentException("Key not found: " + key);
        }
    }

    public void delete() {
        keyValueMap.clear();
        System.out.println("deleted all");
    }
}
