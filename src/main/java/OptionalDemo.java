

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();

        s.add("ashish");
        s.add("rana");
        s.add(null);
        s.add("123");
        s.add("ashu");
        s.add("rayar");
        s.add(null);

        List<Optional<String>> os = s.stream().map(Optional::ofNullable).collect(Collectors.toList());
        os.forEach(System.out::println);

    }
}
