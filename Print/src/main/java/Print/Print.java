package Print;

import java.io.*;

public class Print {
	// печать с переводом строки
	public static void print(Object obj) {
		System.out.println(obj);
	}

	// печать без перевода строки
	public static void printnb(Object obj) {
		System.out.print(obj);
	}

	// Новаф конструкция Java SE5 printf() (из языка С):
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

}
