package com.bridgelabz.TicTacToe;

public class TicTacToe {
	static char[] board; 
	
	
	
	public static void playerBoard() {
		 for(int i =1;i<10;i++) {
			 board = new char[10] ;
			 board[i] = ' ';
		 }
	}

}
