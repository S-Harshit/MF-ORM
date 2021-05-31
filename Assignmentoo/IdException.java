package Assignmentoo;

public class IdException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public IdException(String string) {
		super(string);
	}

	public static void method(long id) throws IdException {
		if (id < 100) {
			throw new IdException("Invalid ID");
		}
	}
}
