package Hard.Q12;

/**
 * Created by Nicolas on 26/1/2018.
 */
public class Q12 {

    public static NodePair convertBST2DoubleLL(BiNode root){
        if(root == null)
            return null;

        BiNode left = root.node1;
        BiNode right = root.node2;

        /*
         * Node pair keep the current head and tail of the LL that is constantly is created,
         * HEAD is the min value
         * TAIL is the max value
         * */
        NodePair convertedLeftPart = convertBST2DoubleLL(left);
        NodePair convertedRightPart = convertBST2DoubleLL(right);

        if(convertedLeftPart != null){
            //Tail is the max element of the subtree
            concat(convertedLeftPart.tail, root);
        }

        if(convertedRightPart != null){
            //Head is the min element of the subtree
            concat(root, convertedRightPart.head );
        }

        return new NodePair(convertedLeftPart == null ? root : convertedLeftPart.head,
                            convertedRightPart == null ? root : convertedRightPart.tail);

    }

    private static void concat(BiNode previous, BiNode next) {
        previous.node2 = next;
        next.node1 = previous;
    }
}
