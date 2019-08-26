import java.util.Set;
import java.util.*;
import java.lang.StringBuilder;

public class Encoding {

    public static Set<String> morseCodes(int m, int n) {
        Set<String> result = new TreeSet<>();
        
        if (m == 0 && n == 0) {
            result.add("");

        } else if (m == 0) {
            String s = "";
            for (int i = 0; i < n; i++) {
                s += "-";
            }
            result.add(s);
        } 
        else if (n == 0) {
            String t = "";
            for(int i =  0; i < m;i++){
                t += ".";
            }
            result.add(t);

        }
        else {
            Set<String> subresult1 = morseCodes(m - 1, n);
            Set<String> subresult2 = morseCodes(m, n - 1);

            for (String str : subresult1) {
                String toAdd = str + ".";
                result.add(toAdd);
            }
            for (String str : subresult2) {
                String toAdd = str + "-";
                result.add(toAdd);
            }

        }
        return result;
    }
}

