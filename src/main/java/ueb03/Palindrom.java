package ueb03;

public class Palindrom<T> {
	static boolean istPalindrom(String s) {
		if (s.length() == 1)
			return true;

		Stack stack = new StackImpl();
		char[] cs = s.toLowerCase().replaceAll(" ", "").toCharArray();

		// die erste Haelfte auf den Stack legen
		int i = 0;
		for (; i < cs.length / 2; i++)
			stack.push(cs[i]);

		// ungerade Länge: ignoriere Buchstaben in der Mitte!
		if (cs.length % 2 == 1)
			i++;

		// die zweite Haelfte muss nun so vom Stack kommen!
		for (; i < cs.length; i++)
			if ((Character)stack.pop() != cs[i])
				return false;

		return true;
	}
}
