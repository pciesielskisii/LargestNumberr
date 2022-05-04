import java.util.List;

public class LargestNumber {

    public static void largestNumber(List<Integer> integerList) {
        if (!checkNegativeNumbers(integerList)) {
            List<String> result = integerList
                    .stream()
                    .map(Object::toString).sorted((o1, o2) -> {
                        String o1o2 = o1 + o2;

                        String o2o1 = o2 + o1;

                        return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
                    }).toList();
            for (String s : result) System.out.print(s);
        } else {
            System.out.print("There are negative numbers");
        }
    }

    public static Boolean checkNegativeNumbers(List<Integer> integerList) {
        for (Integer integer : integerList) {
            if (integer < 0) {
                return true;
            }
        }
        return false;
    }
}
