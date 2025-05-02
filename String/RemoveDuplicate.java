import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sbl = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                sbl.append(ch);
            }
        }

        System.out.println(sbl);  // Output: progamin
    }
}

