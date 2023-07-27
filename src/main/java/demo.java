import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class demo {
    public static void main(String[] args) {


    }
}

class Single {
    private static Single single;

    private Single() {
    }

    public Single getInstance() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }
}