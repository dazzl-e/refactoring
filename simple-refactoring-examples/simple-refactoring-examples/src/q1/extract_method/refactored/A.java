package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      print(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   print(edgeList, p);
      return null;
   }

   // TODO: Your answer
   public <T extends Graph> void print(List<T> info, String p) 
   {
	   for(T item : info) 
	   {
		 if(item.contains(p)) 
		 {
			 System.out.println(item);
		 }  
	   }
	}
}

 class Graph
{
	 String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   } 
}

class Node extends Graph
{
   
}

class Edge extends Graph
{
}