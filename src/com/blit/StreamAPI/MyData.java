//package com.blit.StreamAPI;
//
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;
//
//public class MyData {
//    public static void main(String[] args) {
//
//        List<Employee> list = List.of(new Employee(1,"Bala", 10),
//                new Employee(2, "Haritha", 20),
//                new Employee(3, "John", 30),
//                new Employee(4, "Smith", 15));
//
//            List<String> myList = list.stream().map((item)-> performSomeLogic(item)).toList();
//
//        for (String name: myList
//             ) {
//
//            System.out.println(name);
//
//        }
//
//
//
//
//
////        list.stream().filter((item)-> item.getPoints()>15).forEach((item)-> System.out.println(item.getName()));
////        for (Employee emp: list
////             ) {
////            System.out.println(emp.getName());
////
////        };
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        Predicate<Employee> predicateObj = (emp) -> emp.getPoints()>20; //Predicate functional Interface
//
////        Consumer<Employee> consumerObj = (emp) -> System.out.println(emp.print()); // Consumer functional interface
//
////        list.stream().filter(MyData::test).forEach(System.out::println);
////        list.stream().filter(predicateObj).forEach(consumerObj);
//
////        Predicate<Employee> myVar = (employee)-> employee.getPoints()>15;
////        Consumer<Employee> print = (employee)-> System.out.println(employee.print());
//////        list.stream().filter((employee)-> employee.getPoints()>15).forEach(System.out::println);
////        list.stream().filter(MyData::test).forEach(System.out::println);
//    }
//
////    private static String performSomeLogic(Employee item) {
////       String name =  item.getName();
////       name.compareTo("John");
////
////    }
//
//    private static boolean test(Employee employee) {
//        return employee.getPoints() > 15;
//    }
//}
