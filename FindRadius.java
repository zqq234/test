class FindRadius {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);

        int[] distances = new int[houses.length];
        for (int i = 0; i < houses.length; i++) {
            int left = 0;
            int right = heaters.length - 1;
            while (left < right) {
                int mid = (left + right + 1) >>> 1;
                if (heaters[mid] > houses[i]) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            if (heaters[left] == houses[i]) {
                distances[i] = 0;
            } else if (heaters[left] > houses[i] && left == 0) {
                distances[i] = heaters[left] - houses[i];
            } else if (heaters[left] < houses[i] && left == heaters.length - 1) {
                distances[i] = houses[i] - heaters[left];
            } else {
                distances[i] = Math.min((heaters[left + 1] - houses[i]), (houses[i] - heaters[left]));
            }
        }

        Arrays.sort(distances);
        return distances[distances.length - 1];
    }
}