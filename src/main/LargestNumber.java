import java.util.List;

public class LargestNumber {

    public static void largestNumber(List<Integer> integerList) {
            List<String> result = integerList
                    .stream()
                    .map(Object::toString).sorted((o1, o2) -> {
                        String o1o2 = o1 + o2;

                        String o2o1 = o2 + o1;

                        return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
                    }).toList();
            for (String s : result) System.out.print(s);

    }
}
