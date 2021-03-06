package hard;

import java.util.ArrayList;

public class Trie {
	private TrieNode root;
	
	public Trie(String s){
		insertString(s, 0);
	}
	
	public Trie(){}
	
	
	public void insertString(String s, int location) {
		root.insertString(s, location);
	}
	
	public ArrayList<Integer> search(String s){
		return root.search(s);
	}
	
	public TrieNode getRoot(){
		return root;
	}
}
