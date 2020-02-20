package func;

import java.lang.System;
import java.util.Scanner;

public class TTT {

	public static Scanner sc=new Scanner(System.in);
	public static int p=0;
	public static char board[][]=new char[3][3];

	public static void createBoard() {
		p=0;

		for(int i=0,k=1;i<3;++i) {
			for(int j=0;j<3;++j) {
				board[i][j]=(char)(k+'0');
				++k;
			}
		}
	}

	public static void printBoard(boolean x) {
		for(int i=0;i<3;++i) {
			for(int j=0;j<3;++j) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		if(x) {
			changeBoard();
		}else {

		}
	}

	public static void changeBoard() {

		char c;

		if(p%2==0) {
			System.out.println("Enter position for 'X' ");
			c='X';
		}else {
			System.out.println("Enter position for 'O' ");
			c='O';
		}

		int x=sc.nextInt();

		switch(x) {
		case 1 : board[0][0]=c;
		++p;
		break;
		case 2 : board[0][1]=c;
		++p;
		break;
		case 3 : board[0][2]=c;
		++p;
		break;
		case 4 : board[1][0]=c;
		++p;
		break;
		case 5 : board[1][1]=c;
		++p;
		break;
		case 6 : board[1][2]=c;
		++p;
		break;
		case 7 : board[2][0]=c;
		++p;
		break;
		case 8 : board[2][1]=c;
		++p;
		break;
		case 9 : board[2][2]=c;
		++p;
		break;
		}

		checkBoard(x,p,c);
	}

	public static void checkBoard(int x,int p,char c) {

		switch(x) {
		case 1 : ;
		if(checkRow1()||checkCol1()||checkDia1()) {
			printBoard(false);
			System.out.println("Winner is : "+c);
			cont();
		}
		break;
		case 2 : ;
		if(checkRow2()||checkCol1()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		case 3 : ;
		if(checkRow3()||checkCol1()||checkDia2()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		case 4 : ;
		if(checkRow1()||checkCol2()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		case 5 : ;
		if(checkRow2()||checkCol2()||checkDia1()||checkDia2()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		case 6 : ;
		if(checkRow3()||checkCol2()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		case 7 : ;
		if(checkRow1()||checkCol3()||checkDia2()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		case 8 : ;
		if(checkRow2()||checkCol3()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		case 9 : ;
		if(checkRow3()||checkCol3()||checkDia1()) {
			printBoard(false);
			System.out.println("\nWinner is : "+c);
			cont();
		}
		break;
		}

		if(p==8) {
			printBoard(false);
			System.out.println("\nBoard is full.");
			cont();
		}else {
			printBoard(true);
		}

	}

	public static boolean checkRow1() {
		return board[0][0]==board[1][0]&&board[0][0]==board[2][0];
	}

	public static boolean checkRow2() {
		return board[0][1]==board[1][1]&&board[0][1]==board[2][1];
	}

	public static boolean checkRow3() {
		return board[0][2]==board[1][2]&&board[0][2]==board[2][2];
	}

	public static boolean checkCol1() {
		return board[0][0]==board[0][1]&&board[0][0]==board[0][2];
	}

	public static boolean checkCol2() {
		return board[1][0]==board[1][1]&&board[1][0]==board[1][2];
	}

	public static boolean checkCol3() {
		return board[2][0]==board[2][1]&&board[2][0]==board[2][2];
	}

	public static boolean checkDia1() {
		return board[0][0]==board[1][1]&&board[0][0]==board[2][2];
	}

	public static boolean checkDia2() {
		return board[0][2]==board[1][1]&&board[0][2]==board[2][0];
	}

	public static void cont(){

		System.out.println("\nContinue y/n : ");
		char s=sc.next().charAt(0);
		if(s=='y') {
			createBoard();
		}else {
			System.out.println("\nOK, Bye! ");
			System.exit(0);
		}
	}

}
