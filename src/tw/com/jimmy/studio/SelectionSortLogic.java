package tw.com.jimmy.studio;

public class SelectionSortLogic {
	private static final int TOTAL_ARRAY_SIZE = 10;

	public static void main(String[] args) {
		int[] beforeSort = new int[10];
		System.out.println("beforeSort");
		for (int i = 0; i < TOTAL_ARRAY_SIZE; i++) {
			beforeSort[i] = Util.getRandomNum();
			System.out.print(beforeSort[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			int[] minNumInfo = getMinNum(beforeSort, i);
			beforeSort[minNumInfo[1]] = beforeSort[i];
			beforeSort[i] = minNumInfo[0];
		}
		System.out.println("afterSort");
		for (int num : beforeSort) {
			System.out.print(num + " ");
		}
	}

	public static int[] getMinNum(int[] beforeSort, int loc) {
		int min = beforeSort[loc];
		for (int i = loc; i < 10; i++) {
			if (min > beforeSort[i]) {
				min = beforeSort[i];
				loc = i;
			}
		}
//		System.out.println("min: " + min + ", loc: " + loc);
		int[] rtn = { min, loc };
		return rtn;
	}
}
