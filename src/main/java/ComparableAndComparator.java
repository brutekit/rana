
import java.util.*;
import java.util.stream.Collectors;

public class ComparableAndComparator {

    public static void main(String[] args) {

        List<Laptop> listLap= new ArrayList<Laptop>();
        listLap.add(new Laptop("Asus",12,60000));
        listLap.add(new Laptop("Mi",4,80000));
        listLap.add(new Laptop("Dell",8,40000));
        listLap.add(new Laptop("HP",16,48000));
        listLap.add(new Laptop("Mi",6,30000));
        listLap.add(new Laptop("Mi",4,82000));

//        System.out.println(listLap);

        List<String> stringList = Arrays.asList("heman","pika","mamba","simba","pika","simsa");

        System.out.println(stringList.stream().collect(Collectors.groupingBy(s -> s.toUpperCase() ,Collectors.counting())));

//        Map<String,Long> map = new HashMap();
//
//        for (Laptop l : listLap) {
//            if(map.containsKey(l.getName())){
//                map.put(l.getName(),map.get(l.getName()) + 1L);
//            }
//            else{
//                map.put(l.getName(), 1L);
//            }
//        }
//
//        map = listLap.stream().collect(Collectors.groupingBy(Laptop::getName,Collectors.counting()));
//
//        map.forEach((s, i) -> System.out.println(s+" occured "+i+" time") );

//        Collections.sort(listLap,((o1, o2) -> o2.getPrice()- o1.getPrice()));
//        System.out.println(listLap);
//
//        listLap.stream().sorted(Comparator.comparingInt(Laptop::getPrice).reversed().thenComparing(Comparator.comparingInt(Laptop::getRam)));


//        Optional<Laptop> lappy = listLap.stream().sorted(Comparator.comparingInt(Laptop::getPrice).reversed()).skip(1).findFirst();
//        System.out.println(lappy);



//        listLap.forEach(System.out::println);

//        Comparator comparator = new Comparator<Laptop>() {
//            public int compare(Laptop l1, Laptop l2) {
//                if(l1.getRam()> l2.getRam()){ return 1;}
//                if(l1.getRam() < l2.getRam()){ return -1;}
//                else { return 0 ;}
//            }
//        };

//        Collections.sort(listLap,comparator);

    }
}

// Comparable
class Laptop /* implements Comparable<Laptop>*/
{
    private String name;
    private int ram;
    private int price;

    public Laptop(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    //    public int compareTo(Laptop lap) {
//        if(this.ram > lap.ram){ return 1;}
//        if(this.ram < lap.ram){ return -1;}
//        else { return 0 ;}
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
