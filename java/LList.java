import java.util.LinkedList;

import java.util.ArrayList;
import java.util.*;
public class LList {
public static void main(String[] args) {
    LinkedList<Integer> L1=new LinkedList<>();
    L1.add(5);
    L1.add(1);
    L1.add(7);
    L1.add(9);
    L1.add(3);
    L1.add(50);
    L1.add(40);
    L1.add(30);
    L1.add(20);
    L1.add(10);

    L1.remove();
    L1.removeLast();
    L1.removeFirst();
    L1.remove(3);

    for (int i = 0; i < L1.size(); i++) {
        System.out.print(L1.get(i));
        
    }

    Iterator It=L1.iterator();
    while (It.hasNext()) {
        System.out.println(It.next());
    }

    System.out.println(L1.contains(5));

    System.out.println("------------------------------------------");
    java.util.Stack<Integer> stk = new java.util.Stack<> ();
    LinkedList<Integer> LX=new LinkedList<>();

    stk.push(78);  
    stk.push(113);  
    stk.push(90);  
    stk.push(120);

    LX.addAll(stk);

    Iterator Ixt=LX.iterator();
    while (Ixt.hasNext()) {
        System.out.println(Ixt.next());
    }

}    
}
