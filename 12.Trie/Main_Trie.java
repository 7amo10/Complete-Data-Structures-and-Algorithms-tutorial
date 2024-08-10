public class Main_Trie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        //! Insert Method
        trie.insert("Ahmed");
        trie.insert("Ali");
        trie.insert("Ayman");
        //! Search Method
        trie.search("Ah");
        //! Delete Method
        trie.delete("Al");
    }
}
