package gui;
import gameLogic.LittleBoard;

public class printBoard 
{
	public void printTheBoard(LittleBoard board)
	{
		String[] board1 = board.getBoard();
		
		System.out.println(board1[6] + "|" + board1[7] + "|" + board1[8]);
		System.out.println("-----");
		System.out.println(board1[3] + "|" + board1[4] + "|" + board1[5]);
		System.out.println("-----");
		System.out.println(board1[0] + "|" + board1[1] + "|" + board1[2]);
	}

}
