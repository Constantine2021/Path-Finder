package model;

/**
 * A graph path search algorithm.
 */
public interface IPathAlgorithm {

	/**
	 * Searches for a path between the origin and the destination.
	 * @return true if found a path, false otherwise
	 */
	boolean searchPath(INode start, INode end);

}
