import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaExp {
    public static void main(String[] args) {

//        I intf = () -> System.out.println("hello");
//
//        intf.show();
//
//        Consumer<Integer> con = i -> System.out.println(i);
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//
//        list.forEach(i -> System.out.println(i)) ;
//
        List<Employee> emp = new ArrayList<>();

        emp.stream().filter(n ->n.getAge()==25).collect(Collectors.toList());

        }
}

class Employee{
    int age;

    public int getAge() {
        return age;
    }
}

interface I{
    int i =10 ;
    void show();
}
abstract class AA
{
    private int i =10;

    final void show() {

    }

}