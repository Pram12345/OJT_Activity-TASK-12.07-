import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class arraylist{


    public static void main(String[] args) {
       ArrayList<String> name = new ArrayList<String>();


       System.out.print("Empty ArrayList"+name);


       name.add("Aman");
       name.add("Kunjesh");
       name.add("mukesh");
       name.add("Sanju");
       System.out.print("Array list in add name :"+name);


       for(int i=0; i<=name.size()-1; i++){
        System.out.println("index "+ i + " Value ;- " +name.get(i));
       }

       System.out.println("Using Iterator");

       Iterator itr = name.iterator();
       while (itr.hasNext()) {
        System.out.println(itr.next()+ " ");


        
       }

       System.out.println("using List Iterator");
       ListIterator li1 = name.listIterator();
       while(li1.hasNext()){
        System.out.println(li1.next()+ " ");
       }



       System.out.println("in reverse order ");

       while(li1.hasPrevious()){
        System.out.println(li1.previous()+ " ");
       }


       ArrayList<String> clone = (ArrayList<String>) name.clone();
       System.out.println(name);
       System.out.println(clone);


    }
}