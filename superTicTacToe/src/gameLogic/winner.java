package gameLogic;

public class winner 
{
	public static String decideWinner(String[] cells, String move)
	{
		
		if (cells[7] == move && cells[8] == move && cells[9] == move && cells[7] != "none" && cells[8] != "none" && cells[9] != "none")
			return move;
		else if (cells[4] == move && cells[5] == move && cells[6] == move && cells[4] != "none" && cells[5] != "none" && cells[6] != "none")
			return move;
		else if (cells[1] == move && cells[2] == move && cells[3] == move && cells[1] != "none" && cells[2] != "none" && cells[3] != "none")
			return move;
		else if (cells[7] == move && cells[4] == move && cells[1] == move && cells[7] != "none" && cells[4] != "none" && cells[1] != "none")
			return move;
		else if (cells[8] == move && cells[5] == move && cells[2] == move && cells[8] != "none" && cells[5] != "none" && cells[2] != "none")
			return move;
		else if (cells[9] == move && cells[6] == move && cells[3] == move && cells[9] != "none" && cells[6] != "none" && cells[3] != "none")
			return move;
		else if (cells[7] == move && cells[5] == move && cells[3] == move && cells[7] != "none" && cells[5] != "none" && cells[3] != "none")
			return move;
		else if (cells[9] == move && cells[5] == move && cells[1] == move && cells[9] != "none" && cells[5] != "none" && cells[1] != "none")
			return move;
		else
			return "none";
		
	}
}
