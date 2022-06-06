package util;

public class MathUtil {

	private MathUtil() {}

	/**
	 * Returns the direction from point (x1,y1) to point (x2,y2).
	 * @return the direction in radians
	 */
	public static double direction(double x1, double y1, double x2, double y2) {
		double xdiff = x2 - x1;
		double ydiff = y2 - y1;
		return Math.atan2(ydiff, xdiff);
	}

	/**
	 * Returns the distance between point (x1,y1) and point (x2,y2).
	 * @return the distance
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		double xdiff = x2 - x1;
		double ydiff = y2 - y1;
		return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
	}

	/**
	 * Find the coordinate at a direction and distance from the point (x,y).
	 * @param direction in radians
	 * @param distance
	 * @return the coordinate
	 */
	public static double[] coordinate(double x, double y, double direction, double distance) {
		double coordinate[] = new double[2];
		double xoffset = distance * Math.cos(direction);
		double yoffset = distance * Math.sin(direction);
		coordinate[0] = x + xoffset;
		coordinate[1] = y + yoffset;
		return coordinate;
	}
}
