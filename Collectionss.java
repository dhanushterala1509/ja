import java.util.*;
import java.io.*;

interface Collectionss {

    void printCollection(Collection<?> obj);

    boolean comparingCollections(Collection<?> obj1,Collection<?> obj);


    int collectionsize(Collection<?> oj);

    int collectionsizeMap(Map<?,?> obj);
    void iterateMapElements(Map<?, ?> mp);

    Collection<?> revrse(Collection<?> obj);

    void  collectionToArray(Collection<?> obj);

    List<?> replac(Collection<Object> obj,Object oval,Object nval);

    List<?> rotat(Collection<?> obj,Integer x);


    Map<?,?> listToMap(Collection<?> obj);

    Set<?> listToSet(List<?> obj);

}



class Test {

    public static void main(String[] args) {


        List<Object> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add("DHANUSH");

        Set<String> set=new HashSet<>();

        set.add("geeks");
        set.add("for");
        set.add("geeks");
        set.add("good");
        set.add("website");



        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "1");
        mp.put(2, "2");
        mp.put(3, "3");
        Implement obj = new Implement();

        obj.iterateMapElements(mp);

        obj.printCollection(al);

        System.out.println(obj.collectionsize(al));

        obj.printCollection(set);

        System.out.println(obj.collectionsize(set));


        //size of collection

        System.out.println(obj.collectionsizeMap(mp));

        System.out.println(obj.collectionsizeMap(mp));

        
        //comparingCollections

        if(obj.comparingCollections(al,set)) System.out.println("the set and arraylist are equal");
        else System.out.println("Collections they ae not equal");


        //reverse of Collection

        System.out.println(obj.revrse(al));

//Arrays as List Conversion
        List<Integer> al1=Arrays.asList(1,3,5,7);

        List<String> ll=Arrays.asList("a","b","c","d","e","d");

        obj.printCollection(al);

        obj.printCollection(ll);

        //  Collection to Array Conversion

        Set<Integer> st=new HashSet<>();

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);


        obj.collectionToArray(al1);


        //replace old values to new values


        /*System.out.println(obj.replac(Collections.singleton(st),30,10000));
*/


       //rotate elements

        System.out.println(al1);

        System.out.println(obj.rotat(al1,3));



    //listToMap
        List<Integer> al2=Arrays.asList(10,20,30,40,50,20,30,40);

        System.out.println(obj.listToMap(al2));


        // adding duplicate values to list


        System.out.println(obj.listToSet(al2));




    }
}
