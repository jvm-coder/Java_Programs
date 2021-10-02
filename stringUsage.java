

import java.io.*;
import java.util.*;
class stringUsage {

	
	public static void main(String[] args)
	{

		
		String gfg[] = { "Are", "You", "A", "Programmer" };

	
		StringBuilder obj = new StringBuilder();

		
		obj.append(gfg[0]);
		obj.append(" " + gfg[1]);
		obj.append(" " + gfg[2]);
		obj.append(" " + gfg[3]);

		

		
		String str = obj.toString();

		
		System.out.println(
			"Single string generated using toString() method is --> "
			+ str);
	}
}
