class FlipAndInvertImage2 {
public int[][] flipAndInvertImage(int[][] A) {
	for (int i = 0; i < A.length; i++) {
		int start = 0, end = A[i].length - 1;
		while (start < end) {
			if (A[i][start] != A[i][end]) {
				start++;
				end--;
			} else {
				A[i][start] = A[i][start] == 1 ? 0 : 1;
				A[i][end] = A[i][end] == 1 ? 0 : 1;
				start++;
				end--;
			}
		}
		if (start == end) {
			A[i][start] = A[i][start] == 1 ? 0 : 1;
		}
	}
	return A;
}
