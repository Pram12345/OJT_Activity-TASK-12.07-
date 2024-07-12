import java.util.*;

public class ll {
    

    public static void main(String[] args) {
        

        LinkedList<String> lili = new LinkedList<>();


        System.out.println("befor adding nodes"+lili);


        lili.add("Aman");
        lili.add("Sanju");
        lili.add("Kunjesh");
        lili.add("Sanjay");

        System.out.println("After Adding Nodes"+lili);



        System.out.println("---------Using Iterators-----");


        Iterator<String> iterator = (Iterator<String>) lili.iterator();
            while (iterator.hasNext()) {

                System.out.println(iterator.next());
                
            }
            lili.addFirst("Ram");
            System.out.println(lili);
            lili.addLast("kavita");
            System.out.println(lili);

            Collections.sort(lili);
            System.out.println(lili);

            Collections.sort(lili, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2){
                    return o2.compareTo(o1);
                } 
            });
            

            System.out.println(lili);

            lili.add("mohit");
            lili.add("Ram");
            System.out.println(lili);


            lili.removeAll(Collections.singleton(("Ram")));
            System.out.println(lili);

            lili.clear();
            System.out.println(lili);
    }
}
