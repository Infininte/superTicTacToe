package gameLogic;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import gameLogic.LittleBoard;
import gameLogic.winner;

public class bigBoard 
{
	public void startBoard()
	{
		winner winner = new winner();
		String newMove;
			
		int cellPlace,
			turn = 1,
			gone;
		String[] bigBoard;
		bigBoard = new String[10];
		Scanner scan = new Scanner(System.in);
		LittleBoard[] listOfBoards;
		LittleBoard nextBoard;
		listOfBoards = new LittleBoard[10];
		
		cellPlace = 0;
		newMove = "X";
		
		//the nine small boards
		LittleBoard board1 = new LittleBoard();
		LittleBoard board2 = new LittleBoard();
		LittleBoard board3 = new LittleBoard();
		LittleBoard board4 = new LittleBoard();
		LittleBoard board5 = new LittleBoard();
		LittleBoard board6 = new LittleBoard();
		LittleBoard board7 = new LittleBoard();
		LittleBoard board8 = new LittleBoard();
		LittleBoard board9 = new LittleBoard();
		
		nextBoard = board1;
		
		//initializing listOfBoards
		listOfBoards[0] = board1;
		listOfBoards[1] = board2;
		listOfBoards[2] = board3;
		listOfBoards[3] = board4;
		listOfBoards[4] = board5;
		listOfBoards[5] = board6;
		listOfBoards[6] = board7;
		listOfBoards[7] = board8;
		listOfBoards[8] = board9;
	
		//This is the won state of the little boards
		bigBoard[0] = board1.getOwner();
		bigBoard[1] = board2.getOwner();
		bigBoard[2] = board3.getOwner();
		bigBoard[3] = board4.getOwner();
		bigBoard[4] = board5.getOwner();
		bigBoard[5] = board6.getOwner();
		bigBoard[6] = board7.getOwner();
		bigBoard[7] = board8.getOwner();
		bigBoard[8] = board9.getOwner();
		
		for( ; winner.decideWinner(bigBoard, newMove) != "none" ; turn++)
		{
			//I need to make sure that on the first move you choose twice (the little board an then the cell of the little board)
			if (turn == 1)
			{
				System.out.println("Please choose a little board to play in: ");
				cellPlace = scan.nextInt();
				cellPlace = cellPlace % 10;
				nextBoard = boardChooser(cellPlace, listOfBoards);
			}
			else
			{
				System.out.println("Please move: ");
				cellPlace = scan.nextInt();
				cellPlace = cellPlace % 10;
			}
			
			newMove = decidePlayer(turn);
			
			gone = makeMove(nextBoard, cellPlace, newMove, bigBoard);
			
			if (gone == 10)
				continue;
			else if (gone == 11)
			{
				System.out.println(newMove + " You won!");
				break;
			}
			else
				//cellPlace will be the new small board chosen
				turn++;
				cellPlace = gone;
		}
		
			
			
	}
	
	private int makeMove(LittleBoard board, int cellPlace, String newMove, String[] bigBoard)
	{
		String won = winner.decideWinner(bigBoard, newMove);
		if (board.board(cellPlace, newMove) == 10)
			return 10;
		else
			if(won == "none")
				return cellPlace;
			else
				return 11;
	}
	
	private String turnChooser(int turn)
	{
		if (turn % 2 == 0)
			return "O";
		else if (turn % 2 != 0)
			return "X";
		else
			return "X";
	}
	
	private LittleBoard boardChooser(int cellPlace, LittleBoard[] listOfBoards)
	{
		if (cellPlace == 1)
			return listOfBoards[0];
		else if (cellPlace == 2)
			return listOfBoards[1];
		else if (cellPlace == 3)
			return listOfBoards[2];
		else if (cellPlace == 4)
			return listOfBoards[3];
		else if (cellPlace == 5)
			return listOfBoards[4];
		else if (cellPlace == 6)
			return listOfBoards[5];
		else if (cellPlace == 7)
			return listOfBoards[6];
		else if (cellPlace == 8)
			return listOfBoards[7];
		else 
			return listOfBoards[8];
	}
	
	private String decidePlayer(int turn)
	{
		if (turn % 2 == 0)
			return "O";
		else
			return "X";
	}
}
