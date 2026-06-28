// Last updated: 29/06/2026, 00:15:49
1class Solution {
2    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
3        Arrays.sort(occupiedIntervals, (a, b) -> a[0] - b[0]);
4        List<List<Integer>> ans = new ArrayList<>();
5        int start = occupiedIntervals[0][0];
6        int end = occupiedIntervals[0][1];
7        for (int i = 1; i < occupiedIntervals.length; i++) {
8            if (occupiedIntervals[i][0] <= end + 1) {
9                end = Math.max(end, occupiedIntervals[i][1]);
10            } else {
11                if (end < freeStart || start > freeEnd) {
12                    ans.add(Arrays.asList(start, end));
13                } else {
14                    if (start < freeStart) {
15                        ans.add(Arrays.asList(start, freeStart - 1));
16                    }
17                    if (end > freeEnd) {
18                        ans.add(Arrays.asList(freeEnd + 1, end));
19                    }
20                }
21                start = occupiedIntervals[i][0];
22                end = occupiedIntervals[i][1];
23            }
24        }
25        if (end < freeStart || start > freeEnd) {
26            ans.add(Arrays.asList(start, end));
27        } else {
28            if (start < freeStart) {
29                ans.add(Arrays.asList(start, freeStart - 1));
30            }
31            if (end > freeEnd) {
32                ans.add(Arrays.asList(freeEnd + 1, end));
33            }
34        }
35        return ans;
36    }
37}