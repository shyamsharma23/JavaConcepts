package com.blit.Collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"b", "eb"));
        list.add(new Customer(2,"c", "ea"));
        list.add(new Customer(3,"a", "ec"));
        EmailComparator emailComparator = new EmailComparator();
        Map myMap = new HashMap();
//        Collections.sort(list, emailComparator);
//        System.out.println(list);
//        Collections.sort(list, new NameComparator());
//        System.out.println(list);

//        Collections.sort(list);
//        System.out.println(list);
        Collections.sort(list, emailComparator);
        System.out.println(list);
    }


}
