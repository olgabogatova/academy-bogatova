package by.academy.classwork.collections;


import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		
		TreeSet<Integer> treeset = new TreeSet<>();
		

	
		
		treeset.add(1);
		treeset.add(154);
		treeset.add(132);
		treeset.add(641);
		treeset.add(195);
		treeset.add(1);
		treeset.add(132);
		treeset.add(132);
		treeset.add(197);
		treeset.add(0);
		
		System.out.println(treeset.size() + " " + treeset);
		
		
		TreeSet<String> s = new TreeSet<>();
		s.add("Abc");
		s.add("you");
		s.add("game");
		s.add("abcd");
		s.add("good");
		s.add("fake");
		s.add("obvious");
		s.add("property");
		s.add("abc");
		
		
		System.out.println(s);
		
		
	}
}
