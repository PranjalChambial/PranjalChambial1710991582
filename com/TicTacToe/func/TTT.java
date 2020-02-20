package func;

import java.lang.System;
import java.util.Scanner;

public class TTT {

	public static Scanner sc=new Scanner(System.in);

	public static char board[][]=new char[3][3];

	public static void createBoard() {
		//char board[][]= {{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0,k=1;i<3;++i) {
			for(int j=0;j<3;++j) {
				board[i][j]=(char)(k+'0');
				++k;
			}
		}
	}

	public static void printBoard(boolean x) {
		System.out.println("\nBoard is :\n");
		for(int i=0;i<3;++i) {
			for(int j=0;j<3;++j) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
		if(x) {
			changeBoard();
		}else {
			
		}
	}

	public static void changeBoard() {

		System.out.println("Enter position and value 'X' or 'O'");
		int p=0,x=sc.nextInt();
		char c=sc.next().charAt(0);

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

		if(x==1||x==2||x==3) {
			if(board[0][0]==c && board[0][1]==c && board[0][2]==c) {
				printBoard(false);
				System.out.println("Winner is : "+c);
				cont();
			}
		}else if(x==4||x==5||x==6) {
			if(board[1][0]==c && board[1][1]==c && board[1][2]==c) {
				printBoard(false);
				System.out.println("Winner is : "+c);
				cont();
			}
		}else if(x==7||x==8||x==9) {
			if(board[2][0]==board[2][1] && board[2][1]==board[2][2]) {
				printBoard(false);
				System.out.println("Winner is : "+c);
				cont();
			}
		}

		if(x==1||x==5||x==9) {
			if(board[0][0]==c && board[1][1]==c && board[2][2]==c) {
				printBoard(false);
				System.out.println("Winner is : "+c);
				cont();
			}
		}
		if(x==3||x==5||x==7) {
			if(board[0][2]==board[1][1] && board[0][2]==board[2][2]) {
				printBoard(false);
				System.out.println("Winner is : "+c);
				cont();
			}
		}

		if(p==8) {
			printBoard(false);
			cont();
		}else {
			printBoard(true);
		}

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
