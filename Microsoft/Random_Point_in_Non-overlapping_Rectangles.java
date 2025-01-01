/*
 * You are given an array of non-overlapping axis-aligned rectangles rects where rects[i] = [ai, bi, xi, yi] 
 * indicates that (ai, bi) is the bottom-left corner point of the ith rectangle and (xi, yi) is the top-right 
 * corner point of the ith rectangle. Design an algorithm to pick a random integer point inside the space covered 
 * by one of the given rectangles. A point on the perimeter of a rectangle is included in the space covered by the rectangle.
 *
 * Any integer point inside the space covered by one of the given rectangles should be equally likely to be returned.
 *
 * Note that an integer point is a point that has integer coordinates.
 *
 * Implement the Solution class:
 *
 * Solution(int[][] rects) Initializes the object with the given rectangles rects.
 * int[] pick() Returns a random integer point [u, v] inside the space covered by one of the given rectangles.
 */





class Solution {

	 Random rand;
	 TreeMap<Integer, Integer> map;
	 int[][] rects;
	 int area;
	 public Solution(int[][] rects) {
		rand = new Random();
		map = new TreeMap<>();
		this.rects = rects;
		for(int i = 0; i<rects.length; i++) {
		     int currArea = (rects[i][2] - rects[i][0]+1)* (rects[i][3] - rects[i][1]+1);
		     area += currArea;
		     map.put(area, i);
		}    
	}
	      
	public int[] pick() {
	     int randInt = rand.nextInt(area);
	     int index = map.higherKey(randInt);
	     int[] rectChoosen = rects[map.get(index)];
	     int x = rectChoosen[0] + (index-randInt-1) % (rectChoosen[2] - rectChoosen[0] +1);
             int y = rectChoosen[1] + (index-randInt-1) / (rectChoosen[2] - rectChoosen[0] +1);
	     return new int[]{x, y};
	 }
}

/**
 *  * Your Solution object will be instantiated and called as such:
 *   * Solution obj = new Solution(rects);
 *    * int[] param_1 = obj.pick();
 *     */
