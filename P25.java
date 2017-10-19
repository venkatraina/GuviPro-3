package pro_set3;

import java.util.*;

public class P25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter K value: ");
		int k = in.nextInt();
		appendZeros(k);
		in.close();
	}

	public static void appendZeros(int n) {
		String bin = "";
		String last = "";
		for (int i = 0; i < n; i++) {
			bin += "0";
			last += 1;
		}
		System.out.print(bin + " ");
		ones(bin);
		System.out.println(last);

	}

	public static void ones(String s) {
		int i = 0;
		while (i < s.length() - 1) {
			s = s.substring(1);
			s += "1";
			ordering(s);
			i++;
		}
	}

	public static void ordering(String str) {
		ArrayList<String> al = new ArrayList<String>();
		int i = 0;
		while (i < str.length()) {
			str = str.substring(1) + str.charAt(0);
			al.add(str);
			i++;
		}
		print(al);

	}

	public static void print(ArrayList<String> al1) {
		String ar[] = new String[al1.size()];
		for (int i = 0; i < al1.size(); i++) {
			ar[i] = al1.get(i);
		}
		for (int i = 0; i < al1.size() - 1; i++) {
			for (int j = i + 1; j < al1.size(); j++) {
				if (ar[i].compareTo(ar[j]) > 0) {
					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (String s : ar) {
			System.out.print(s + " ");
		}
	}

}
