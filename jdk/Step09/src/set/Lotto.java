package set;

import java.util.HashSet;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			while (set.size() < 6)
				set.add(r.nextInt(45) + 1);
			System.out.println(set);
			set.clear();
		}
	}

}
