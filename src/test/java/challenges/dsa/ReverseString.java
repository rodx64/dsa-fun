package challenges.dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseString {

    // Create a function that reverses a String

    static String reverse(String str){
        if(str == null || str.length() < 2) return str;

        String[] strSplit = str.split("");
        char[] reverse = new char[strSplit.length];

        // Big O(n)
        for (int i = 1;  i <= strSplit.length; i++) {
            reverse[i -1] = strSplit[strSplit.length - i].charAt(0);
        }

        return new String(reverse);
    }
    @Test
    void whenStringIn_validateReversedStringOut(){
        assertThat(reverse("Testando 123").equals("321 odnatseT"));
        assertNull(reverse(null));
        assertThat(reverse("").isEmpty());
        assertThat(reverse(" ").isBlank());
    }
}
