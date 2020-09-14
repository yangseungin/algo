package back;

import java.util.Arrays;

public class NullTest {
	public static void main(String[] args) {
        String[] nullInArray = {"1", "2", "", "4", "", null};

        nullInArray = Arrays.stream(nullInArray)
                     .filter(s -> (s != null && s.length() > 0))
                     .toArray(String[]::new);
        
        System.out.println(Arrays.toString(nullInArray));
        
	}

}
