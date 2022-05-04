import java.util.List;

public class LargestNumber {

    /**
     * This function is mapping list of integers to list of strings. Compares them and prints the
     * arrangement with the largest value.
     * @param integerList
     */
    public static void largestNumber(List<Integer> integerList) {
        try {
            if (largestNumberValidation(integerList)) {
                List<String> inputIntegerListAsString = integerList
                        .stream()
                        .map(Object::toString).sorted((o1, o2) -> {
                            String o1o2 = o1 + o2;

                            String o2o1 = o2 + o1;

                            return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
                        }).toList();
                for (String s : inputIntegerListAsString) System.out.print(s);
            }
        } catch (NullPointerException e){
            System.out.print("List is null");
        }
    }

    private static Boolean checkNegativeNumbers(List<Integer> integerList) {
        for (Integer integer : integerList) {
            if (integer < 0) {
                return true;
            }
        }
        return false;
    }

    private static Boolean largestNumberValidation(List<Integer> integerList) {
        boolean validated = true;
        if (checkNegativeNumbers(integerList)) {
            validated = false;
            System.out.print("There are negative numbers");
        }
        if ((integerList.isEmpty())) {
            validated = false;
            System.out.print("List is empty");
        }
        return validated;
    }
}
