package com.firstrun;

public class Main {
	
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Olympion", 8, 12);
		theatre.getSeats();
		if(theatre.resrveSeat("H11")) {
			System.out.println("Please pay");
		}else {
			System.out.println("Sorry, seat is taken");
		}
		if(theatre.resrveSeat("H11")) {
			System.out.println("Please pay");
		}else {
			System.out.println("Sorry, seat is taken");
		}
	}
}
