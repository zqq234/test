public int Reverse(int x) {
	int ans = 0;
	while (x != 0) {
		if ((ans * 10) / 10 != ans) {
			ans = 0;
			break;
		}
		ans = ans * 10 + x % 10;
		x = x / 10;
	}
	return ans;
}