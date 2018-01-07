package Sorting_Searching.Q10;

/**
 * We create a BST that each node represent a generated number. Each node has 2 values.
 * Number of occurrences of this number
 * Size of left subtree. (Number of Nodes * number of occurrences).
 *
 * When a new number is generated we call track(int number) this function inserts the number in the tree. It starts from the root
 * and updates the size of the left subtree every time the number is less than the node. If the node exists it just update the occurrences
 * value, if it is not exist, we need to add a new node.
 *
 * When we need to know the rank of a number we call getRankOfNumber(int number) and we search for the number in the tree.
 * Every time we go right we count the size of all left subtrees as well as the size of the node if needed.
 */
public class RankNode {

    public int sizeOfLeftSubtree = 0;
    public int occurrences = 1;
    public RankNode left, right;
    public int value;

    public RankNode(int value) {
        this.value = value;
    }

    public void insert(int newData){
        /*In case we have duplicates do not create a new node update the occurrences variable*/
        if(newData == value) {
            occurrences++;
            return;
        }
        /*
        * If newData < value track it to the left, will increasing the sizeOfLeftSubtree variable.
        * else track it to the right.
        * */
        if(newData < value){
            sizeOfLeftSubtree++;
            if(left!= null)
                left.insert(newData);
            else
                left = new RankNode(newData);
        } else {
            if(right!= null)
                right.insert(newData);
            else
                right = new RankNode(newData);
        }
    }

    //returns rank for this node
    public int getRank(){
        return sizeOfLeftSubtree + occurrences;
    }
}
