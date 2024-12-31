/* You are given a circle represented as (radius, xCenter, yCenter) and an axis-aligned rectangle represented as (x1, y1, x2, y2), where (x1, y1) are the coordinates of the bottom-left corner, and (x2, y2) are the coordinates of the top-right corner of the rectangle.

Return true if the circle and rectangle are overlapped otherwise return false. In other words, check if there is any point (xi, yi) that belongs to the circle and the rectangle at the same time. 

Approach
Calculate the closest point on the rectangle to the center of the circle. This can be done by finding the coordinates (closestX, closestY) where closestX is the maximum of x1 and the minimum of xCenter and x2, and closestY is the maximum of y1 and the minimum of yCenter and y2.

Calculate the distance between the closest point (closestX, closestY) and the center of the circle (xCenter, yCenter) using the differences in x and y coordinates: distanceX = xCenter - closestX and distanceY = yCenter - closestY.

Calculate the squared distance between the closest point and the center of the circle: squaredDistance = distanceX * distanceX + distanceY * distanceY.

Compare the squared distance with the squared radius of the circle. If squaredDistance is less than or equal to radius * radius, then there is an overlap; otherwise, there is no overlap.

*/



public class Circle_and_Rectangle_Overlapping {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nearestX = Math.max(x1, Math.min(x2, xCenter));
        int nearestY = Math.max(y1, Math.min(y2, yCenter));
 
        int distX = xCenter - nearestX;
        int distY = yCenter - nearestY;
        return (distX*distX+distY*distY) <= radius*radius;
     }
    
}