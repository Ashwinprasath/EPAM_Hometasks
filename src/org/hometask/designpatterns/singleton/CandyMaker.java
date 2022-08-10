package org.hometask.designpatterns.singleton;

public class CandyMaker {
	
		private static boolean empty;
		private static boolean boiled;
	  
		private CandyMaker() {
			empty = true;
			boiled = false;
		}
	  
		static CandyMaker candyMaker = new CandyMaker();
		
		public static CandyMaker getInstance() {
			
				 return candyMaker;
			
		}

		public void fill() {
			if (isEmpty()) {
				empty = false;
				boiled = false;
				System.out.println("Filled the candyMaker with milk and choclate mix");
			}
		}
	 
		public void drain() {
			if (!isEmpty() && isBoiled()) {
				empty = true;
				System.out.println("Drain the boiled milk and chocolate");
			}
		}
	 
		public void boil() {
			if (!isEmpty() && !isBoiled()) {
				boiled = true;
				System.out.println("Its boiled");
			}
		}
	  
		public static boolean isEmpty() {
			return empty;
		}
	 
		public synchronized static boolean isBoiled() {
			return boiled;
		}
		
		public static void main(String[] args) {
			System.out.println(CandyMaker.isBoiled());
			System.out.println(CandyMaker.isEmpty());
		}
}
