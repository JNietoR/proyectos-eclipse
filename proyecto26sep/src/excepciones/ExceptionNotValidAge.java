package excepciones;

public class ExceptionNotValidAge extends Exception {
	public ExceptionNotValidAge(String e) {
		super("Edad < 0");
	}
}
