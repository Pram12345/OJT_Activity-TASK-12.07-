import java.util.*;
public class stack1 {
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack);
        
        stack.push(101);
        stack.push("Ajay");
        System.out.println(("do element add karne ke baad stack"+stack));
        stack.push("Ajay");
        stack.push(1025);
        stack.push(-86.26f);

        System.out.println("Sare Element Add karne ke bss stack"+stack);


        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) 
        {
           System.out.println(iterator.next()); 
        }
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
