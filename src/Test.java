import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//3
public class Test {

    public static void main(String[] arguments) {
//        Test1();
//        Test2();
//        Test();
        List<String> listString = new ArrayList<>();
        listString.add("aaaavs");
        listString.add("aaa");
        listString.add("abaavs");
        listString.add("vxaaaaavs");
        filterWord(listString);
    }

    public static void filterWord(List<String> word) {
        List<String> result = new ArrayList();
        String findString = "aaa";
        for (String string : word) {
            if (string.indexOf(findString) != 0) {
                result.add(string);
                System.out.println("Add element: " + string);
            }
        }
        System.out.println("Result:" + result);
    }

//    private static void Test() {
//        Stream.of(5, 3, 4, 55, 2).min();
//    }

    private static void Test1() {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);
    }

    private static void Test2() {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(98);
        number.add(99);
        number.add(100);
        number.add(101);
        number.add(102);

        number.replaceAll(x -> x < 100 ? x + 1 : x);

//        for (Integer numb : number) {
//            if (numb < 2) {
//                number.remove(numb);
//            }
//        }

//        Iterator<Integer> iterator = number.iterator();
//        while (iterator.hasNext()) {
//            Integer numb = iterator.next();
//            if (numb < 100) {
//                iterator.remove();
//            }
//        }

        System.out.println(number);
        //        number.removeIf(x -> x < 3);

//        for (Integer numb : number) {
//            if (numb > 2) {
////                System.out.println(numb);
//                number.remove(numb);
//            }
//        }

//        for (Integer numb : number) {
//            System.out.println(numb);
//        }
    }

}
