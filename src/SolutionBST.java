import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
//    Node left;
//    Node right;
//    Node(){
//
//    }
//    Node(int x) {
//        data = x;
//    }
}

public class SolutionBST {
    //private Node prev = null;
    private Node node = new Node();
    private Node left = new Node();
    private Node right =new Node();
    private boolean bool = false;
    public boolean checkBST(Node root) {

//        Node node = new Node();
        if(node.data > root.data) {
            //Node right = new Node();
            if(right.data == node.data) {
                return true;
            } else if(right.data != node.data) {
                return false;
            }
        }else{
            //Node left = new Node();
            if(left.data == node.data) {
                return true;
            } else if(left.data != node.data)
                return false;
        }


        return true;

    }
    //    boolean checkBST(Node root) {
//        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    boolean checkBST(Node root, long minVal, long maxVal){
//        if (root == null)
//            return true;
//        if (root.data >= maxVal || root.data <= minVal)
//            return false;
//        return checkBST(root.left, minVal, root.data) && checkBST(root.right, root.data, maxVal);
//    }
    public void iterateNodeList(List<Node> nodeList) {


        for (int i = 0; i < nodeList.size(); i++) {

            bool = checkBST(nodeList.get(i));


        }
        if (bool) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
    public static void main (String[] args){
//        Node node;
        List<Node> nodeList = new ArrayList<>();
//        for (int i = 0; i < args.length ; i++) {
//            //nodes.add());
//            nodeList.add(new Node(Integer.valueOf(args[i])));
//        }
        SolutionBST solution = new SolutionBST();
        solution.iterateNodeList(nodeList);


    }
}

