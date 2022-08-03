package org.hometask.corejava;

public class Language_Constructs_05 {

	// Problem 1
	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday == true) {
			if (speed <= 65) {
				System.out.println("You are booked with No ticket");
				return 0;
			} else if (66 <= speed && speed <= 85) {
				System.out.println("You are booked with Small ticket");
				return 1;
			} else if (86 <= speed) {
				System.out.println("You are booked with Big ticket");
				return 2;
			}
		}

		if (speed <= 60) {
			System.out.println("You are booked with No ticket");
			return 0;
		} else if (61 <= speed && speed <= 80) {
			System.out.println("You are booked with Small ticket");
			return 1;
		} else {
			System.out.println("You are booked with Big ticket");
			return 2;
		}
	}

	// Problem 2
	public boolean greatNumber6(int a, int b) {
		if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6 || Math.abs(b - a) == 6) {
			System.out.println("Either one of the entered number or sum or difference of the entered number is 6");
			return true;
		} else {
			System.out.println("Neither one of the entered number nor sum or difference of the entered number is 6");
			return false;
		}
	}

	// Problem 3
	public void teaParty(int tea, int candy) {

		if (tea < 5 || candy < 5) {
			System.out.println("The party is always bad");
		} else if ((tea >= 2 * candy) || (candy >= 2 * tea)) {
			System.out.println("The party is always great");
		} else {
			System.out.println("The party is good");
		}
	}

	//Problem 4
	public int blueTicket(int a, int b, int c)
	{
		int ab = a + b;
		int bc = b + c;
		int ca = c + a;
		if(ab == 10 || bc == 10 || ca == 10) {
			System.out.println("Result is 10");
			return 10;
		}
		else if(ab == bc + 10 || ab == ca + 10) {
			System.out.println("Result is 5");
			return 5;
		}else {
			System.out.println("Result is 0");
			return 0;
		}	
	}
	
	//Problem 5
	public boolean inOrder(int a, int b, int c, boolean bOk)
	{
		
			if(bOk)
				return (c > b);
			return (b > a && c > b);
		
	}
	
	//Problem 6
	public boolean shareDigit(int a, int b)
	{
		int aRDigit = a%10;
		int bRDigit = b%10;
		int aLDigit = a/10;
		int bLDigit = b/10;
		return (aLDigit == bLDigit || aLDigit == bRDigit || aRDigit == bLDigit || aRDigit == bRDigit);
	}
	
	//Problem 7
	public int numOfDigits(int num)
	{
		int count = 0;
		while(num != 0)
		{
			num = num / 10;
			count++;
		}	
		return count;
	}
	
	public int sumLimit(int a, int b)
	{
		int aLength = numOfDigits(a);
		int sum = a + b;
		if(aLength == numOfDigits(sum))
			return sum;
		return a;
	}
	
	//Problem8 
	public String withoutString(String base, String remove) {
		String result = "";
		for (int i = 0; i < base.length(); i++) {
			if (i > base.length() - remove.length()) {
				result += base.substring(i, base.length());
				break;
			} else {
				String substring = base.substring(i, i + remove.length());
				if (!(substring.equalsIgnoreCase(remove))) {
					result = result + base.charAt(i);
				} else {
					i = i + remove.length() - 1;
				}
			}
		}
		return result;
	}
	
	//Problem 9
	public int maxBlock(String str) {
		if (str.length() == 0)
			return 0;

		int largest = 0;
		int current = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1)) {
				if (current > largest)
					largest = current;
				current = 1;
			} else {
				current++;
			}
		}
		return Math.max(largest, current);
	}
	
	//Problem10
	public int sumNumbers(String str) {
		int len = str.length();
		int start = -1;
		int end = 0;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (start == -1) {
				if (Character.isDigit(str.charAt(i))) {
					start = i;
					end = i + 1;
				}
			} else {
				if (Character.isDigit(str.charAt(i)))
					end++;
				else {
					sum += Integer.parseInt(str.substring(start, end));
					start = -1;
				}
			}
		}
		if (start != -1)
			sum += Integer.parseInt(str.substring(start, end));
		return sum;
	}

	public static void main(String[] args) {

		Language_Constructs_05 l = new Language_Constructs_05();
		l.caughtSpeeding(86, true);
		l.greatNumber6(4, 2);
		l.teaParty(15, 15);
		l.blueTicket(12, 3, 2);
		System.out.println(l.inOrder(1, 2, 4, false));
		System.out.println(l.inOrder(1, 2, 1, false));
		System.out.println(l.inOrder(1, 1, 2, true));
		System.out.println(l.shareDigit(12, 23));
		System.out.println(l.shareDigit(12, 23));
		System.out.println(l.shareDigit(12, 43));
		System.out.println(l.shareDigit(12, 44));
		System.out.println(l.sumLimit(2, 3));
		System.out.println(l.sumLimit(8, 3));
		System.out.println(l.sumLimit(8, 1));
		System.out.println(l.withoutString("Hello there", "llo"));
		System.out.println(l.withoutString("Hello there", "e"));
		System.out.println(l.withoutString("Hello there", "x"));
		System.out.println(l.maxBlock("hoopla") );
		System.out.println(l.maxBlock("abbCCCddBBBxx")); 
		System.out.println(l.maxBlock("")); 
		System.out.println(l.sumNumbers("abc123xyz"));
		System.out.println(l.sumNumbers("aa11b33"));
		System.out.println(l.sumNumbers("7 11"));
		
	}

}
