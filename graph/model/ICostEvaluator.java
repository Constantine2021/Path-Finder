package model;

/**
 * A cost evaluator is responsible for evaluating the weight of a given edge, 
 * the cost and the heuristic value of a given node with a necessary context.
 */

public interface ICostEvaluator {

	/**
	 * Evaluates the weight of an edge.
	 * @return the weight
	 */
	int evaluateWeight(IEdge edge);
	
	/**
	 * Evaluates the heuristic value of a node.
	 * @return the heuristic value
	 */
	int evaluateHeuristic(INode node, INode start, INode end);
	
	/**
	 * Evaluates the cost of a node.
	 * @return the cost
	 */
	int evaluateCost(INode candidate, IEdge edge, INode start, INode end);

}
