class Solution {
    class TrieNode{
        TrieNode[] child = new TrieNode[26];
        int index;
    }
    TrieNode root = new TrieNode();
    String[] words;
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
       words = wordsContainer;
       root.index = getSmallestIndex(wordsContainer);
       for(int i=0;i<wordsContainer.length;i++){
        insert(wordsContainer[i],i);
       }
       int[] ans = new int[wordsQuery.length];
       for(int i=0;i<wordsQuery.length;i++){
        ans[i] = search(wordsQuery[i]);
       } 
       return ans;
    }

    public void insert(String word,int idx) {
        TrieNode node = root;
        for(int i=word.length()-1;i>=0;i--){
            int c = word.charAt(i)-'a';
            if(node.child[c] == null){
                node.child[c] = new TrieNode();
                node.child[c].index = idx;
            }
            node = node.child[c];
            int oldIndex = node.index;

            if(words[idx].length() < words[oldIndex].length()){
                node.index = idx;
            }
            else if(words[idx].length() == words[oldIndex].length() && idx < oldIndex) {
                node.index = idx;
            }
        }
    }
    public int search(String query){
        TrieNode node = root;
        for(int i=query.length()-1;i>=0;i--){
            int c = query.charAt(i)-'a';
            if(node.child[c] == null) break;
            node = node.child[c];
        }
        return node.index;
    }
    public int getSmallestIndex(String[] words){
        int idx = 0;
        for(int i=1;i<words.length;i++){
            if(words[i].length() < words[idx].length()) idx = i;
        }
        return idx;
    }

}