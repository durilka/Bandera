package doo.bandera;

import java.util.Date;

public class Parsers {
	public static int SafeParse(String what, int def) {
		try {
			return Integer.parseInt(what);
		} catch (Exception e) {
			return def;
		}
	}

	public static long SafeParse(String what, long def) {
		try {
			return Long.parseLong(what);
		} catch (Exception e) {
			return def;
		}
	}

	public static String SafeParse(Object what, String def) {
		return what == null ? def : what.toString();
	}

	public static Date SafeParse(Object what, Date def) {
		return what == null ? def : (Date)what;
	}

	public static int SafeParse(Object what, int def) {
		return SafeParse(what != null ? what.toString() : "", def);
	}
	
	public static long SafeParse(Object what, long def) {
		return SafeParse(what != null ? what.toString() : "", def);
	}
}
