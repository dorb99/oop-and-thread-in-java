package threads;

public interface Printer {
	public void greet(); 
    default String getThreadInfo() {
        return "\t\tTHREAD " + Thread.currentThread().getName() + "\n";
    }}
