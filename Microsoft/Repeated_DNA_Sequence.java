import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeated_DNA_Sequence {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i = 0; i<s.length()-9; i++) {
            String subStr = s.substring(i, i+10);
            if(seen.contains(subStr)) {
                repeated.add(subStr);
            }
            seen.add(subStr);
        }

        return new ArrayList(repeated);
    }
} 