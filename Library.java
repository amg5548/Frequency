
public class Library {

    public static String frequencyFinder(String string) {
        int counter1 = 0;
        String value1 = null;
        for (int i = 0; i < string.length(); i++) {
            if (i == 0) {
                value1 = String.valueOf(string.charAt(i));
                for (int j = 0; j < string.length(); j++) {
                    if (value1.equals(String.valueOf(string.charAt(j)))) {
                        counter1++;
                    }
                }
            }
            if (i != 0) {
                int counter2 = 0;
                String value2 = String.valueOf(string.charAt(i));
                for (int k = 0; k < string.length(); k++) {
                    if (value2.equals(String.valueOf(string.charAt(k)))) {
                        counter2++;
                    }
                }
                if (counter2 > counter1) {
                    value1 = value2;
                    counter1 = counter2;
                }
            }
        }
        return value1;
    }
}
