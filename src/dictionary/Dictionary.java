package dictionary;

public class Dictionary {
    Node root = new Node('\0');

    public void add(String word){
        add(root , word);
    }
    // helper dunction to add the word to the dictionary
    private void add(Node root , String word){
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }
        int index = word.charAt(0) - 'a';
        Node child = root.children[index];
        if(child == null){
            child = new Node(word.charAt(0));
            root.children[index] = child;
        }
        add(child , word.substring(1));
    }

}
