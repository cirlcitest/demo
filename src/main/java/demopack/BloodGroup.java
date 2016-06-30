package demopack;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class BloodGroup {

	List l = Arrays.asList(new String [] {"AB","A","0","B"});
	public boolean isValidGroup(String val){
		System.out.println(val);
		return l.contains(val);
	}
	
	
}
