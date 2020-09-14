package back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NullTest2 {
	public static void main(String[] args) {
        String[] nullInArray = {"1", "2", "", "4", "", null};

        List<String> list = new ArrayList<String>();
        for(String s : nullInArray) {
            if(s != null && s.length() > 0) {
               list.add(s);
            }
         }

        nullInArray = list.toArray(new String[list.size()]);
        
        System.out.println(Arrays.toString(nullInArray));
        
	}

}
