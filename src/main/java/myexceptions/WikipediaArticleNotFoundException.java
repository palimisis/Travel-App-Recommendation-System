
package myexceptions;

public class WikipediaArticleNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WikipediaArticleNotFoundException (String message) {
		super();
		System.err.println("Wikipedia article not found for query: "+message+".\n");
	}
	
}
