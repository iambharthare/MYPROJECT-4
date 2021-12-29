package in.co.rays.proj4.exception;
/**
 *  ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * 
 * @author ShubHam
 *
 */
public class ApplicationException extends Exception {

	    /**
	     * 
	     *            : Error message
	     */
	    public ApplicationException(String msg) {
	        super(msg);
	    }
	}



