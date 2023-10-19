package Weekly;

public class Week7 {

	public static int devision(int n, int m) {
		if (m == 0) {
			System.out.println("Cant devide by 0!");
			return -1;
		}
		return n / m;
	}

	public static void friday() {
		int n = 0, m = 1;
		n = m++; // m = 2, n = 1
		// System.out.println(n++); // First print n, and then add 1
		// System.out.println(n);

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		String[] arr = { "Volvo", "BMW" };
		for (int i = 0; i < arr.length; i++) { // 0,* 1,2, ...., 50
			System.out.println(arr[i]);
			// int n = 0;
			n++;
			--n;
			n = n + 5;
			n += 5;
			n /= 5;
			n %= 2;
			n += 1;
			int age = 12 * (2 + 2);
			boolean flag = age >= 13 && age++ <= 19 && age != 15;
			// System.out.p1rintln(flag);
			if (flag) {
				System.out.println("You are a teenager");
			}
			// System.out.println(age);//syso + ctrl + space

			// System.out.println(devision(4,0));
			char c = '\'';
			String s = "Hi", name = "Ali";
			System.out.print(s + "\n");
			System.out.println(s + "\"" + name + "\"");
			System.out.printf(" %c %s %s\n", c, s, name);
		}
	}

	public static void saturday() {
		
	}
	
	public static void main(String[] args) {
		int n = 4; 
		
		System.out.println(n++);
		System.out.println(n);
	}
}
