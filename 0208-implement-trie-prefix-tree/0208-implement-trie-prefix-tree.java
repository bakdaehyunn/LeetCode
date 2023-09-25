class Trie {
    class Node{
        public boolean isWord;
        public Node [] children = new Node[26];
    }
    Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node current =root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(current.children[c-'a']==null){
                current.children[c-'a']=new Node();
            }
            current= current.children[c-'a'];
        }
        current.isWord = true;
    }
    
    public boolean search(String word) {
        Node current = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(current.children[c-'a']==null) return false;
            current = current.children[c-'a'];
        }
        return current.isWord;
    }
    
    public boolean startsWith(String prefix) {
        Node current = root;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if(current.children[c-'a']==null)return false;
            current = current.children[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */