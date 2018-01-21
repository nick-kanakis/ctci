package Moderate.Q25;

/**
 * Created by Nicolas on 21/1/2018.
 */
public class CacheNode {
    public CacheNode previous;
    public CacheNode next;
    private String key;
    private String value;

    public CacheNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CacheNode node = (CacheNode) o;

        if (key != null ? !key.equals(node.key) : node.key != null) return false;
        return value != null ? value.equals(node.value) : node.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
