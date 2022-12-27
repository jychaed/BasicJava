package h_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class UserList<E> extends ArrayList<E>{

	@Override
	public String toString() {
		String result = "";
		result += this.get(0);
		for(int i = 1; i < this.size(); i++) {
			result += "\t" + this.get(i);
		}
		return result;
	}

	
}
