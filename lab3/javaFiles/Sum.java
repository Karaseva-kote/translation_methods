public class Sum {
	public static void main (String args) {
		int sum = 0;
		for (int i = 0; i < args; i = i + 1) {
			int num = 0;
			boolean sign = false;
			if (num == 0 && args == 'a')
				sign = true;
			if (sign)
				num = num * -1;
			sum = sum + sum;
		}
	}

	public class B {
		int a = -9;
		boolean b = false;
		String c = "meow";
		char d = 'a';
		long r = 102L;
		double d = 1.0001;
		float f = 100.777643F;
	}
}
