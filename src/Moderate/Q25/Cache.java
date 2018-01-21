package Moderate.Q25;

import java.util.HashMap;

/**
 * In order to create a LRU cache we need to combine a HashMap and a LinkedList, the LL will determine the order in which
 * the values have last been accessed. Newest elements will be at the top will oldest will be at the end.
 *
 * When inserting a new element we must check if there is enough space for the new element. If not remove the oldest element (last one)
 * from the linkedlist as well as the hashmap. After that insert the element to the front of the LL.
 *
 * When accessing a element before returning the value update the LL, set the accessed element as the newest in the LL.
 */
public class Cache {
    private int maxSize = 0;
    private CacheNode newest;
    private CacheNode oldest;
    private HashMap<String, CacheNode> cache = new HashMap<>();

    public Cache(int maxSize) {
        this.maxSize = maxSize;
    }

    public void insert(String key, String value) {

        /*TODO: If element exists update the value and set it as newest*/

        if (cache.size() >= maxSize) {
            removeOldestElement();
        }
        CacheNode node = new CacheNode(key, value);
        if (newest == null) {
            newest = node;
            oldest = node;
        } else {
            insertNewestNode(node);
        }
        cache.put(key, node);
    }


    public String get(String key) {
        CacheNode node = cache.get(key);
        if (node == null)
            return "";
        moveNodeToNewest(node);

        return node.getValue();
    }

    private void removeOldestElement() {
        CacheNode toBeRemoved = oldest;
        //First remove it from the linkedlist
        oldest = oldest.previous;
        oldest.next = null;

        //Then remove it from the hashmap
        cache.remove(toBeRemoved.getKey());
    }

    private void insertNewestNode(CacheNode node) {
        node.next = newest;
        newest.previous = node;
        newest = node;
    }

    private void moveNodeToNewest(CacheNode node) {
        //If it already newest do nothing
        if (node.equals(newest)) {
            return;
        } else if (node.equals(oldest)) {
            //If it is the oldest move it to top

            newest.previous = oldest;
            oldest.next = newest;
            newest = oldest;
            oldest.previous.next = null;
            oldest = oldest.previous;
        } else {
            //remove node from list.
            node.previous = node.next;

            //mark it as the newest
            node.next = newest;
            newest.previous = node;
            newest = node;
        }
    }
}
