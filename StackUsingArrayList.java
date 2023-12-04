import java.util.*;

public class StackUsingArrayList {
  static class Stac{
   static ArrayList <Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
      return list.size() == 0;
    }

    //push function 
    public static void push(int data){
      list.add(data);
    }
    //pop function
    public static int pop(){
      if(isEmpty()){
        return -1;
      }
      int top = list.get(list.size()-1);
      list.remove(list.size()-1);
      return top;
    }
    //peek function
    public static int peek(){
      if(isEmpty()){
        return -1;
      }
      return list.get(list.size()-1);
    }
  }
  public static void main(String[] args) {
    Stac s = new Stac();
    
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    while(!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();
  }
 } 
}
