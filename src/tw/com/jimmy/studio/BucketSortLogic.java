package tw.com.jimmy.studio;

import java.util.ArrayList;
import java.util.List;

public class BucketSortLogic {
	public static void main(String[] args) {
		List<Integer> beforeSort = new ArrayList<>();
		int[] afterSort = new int[200];
		System.out.print("beforeSort: ");
		for (int i = 0; i < 10; i++) {
			beforeSort.add(Util.getRandomNum());
			System.out.print(beforeSort.get(i) + " ");
		}
		System.out.println();
		for (Integer number : beforeSort) {
			afterSort[number + 100] = number;
		}
		System.out.print("afterSort: ");
		for (int i : afterSort) {
			if (i == 0) {
				// doNothing
			} else {
				System.out.print(i + " ");
			}
		}
	}

	
}
