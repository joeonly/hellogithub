package sample.gitactions;

import java.util.Date;

public class HelloWorld {
	private final static HelloWorld logger = new HelloWorld();

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		logger.log(hw.hi("Zhang3"));
	}

	private void log(String msg) {
		System.out.println(new Date() + ": " + msg);
	}
	public HelloWorld() {
	}

	public String hi(String name) {
		return "Hello " + name;
	}
}
