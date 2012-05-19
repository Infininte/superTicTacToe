package gameLogic;

public class winner 
{
	public String decideWinner(String[] cells, String move)
	{
		
		if (cells[7] == move && cells[8] == move && cells[9] == move)
			return move;
		else if (cells[4] == move && cells[5] == move && cells[6] == move)
			return move;
		else if (cells[1] == move && cells[2] == move && cells[3] == move)
			return move;
		else if (cells[7] == move && cells[4] == move && cells[1] == move)
			return move;
		else if (cells[8] == move && cells[5] == move && cells[2] == move)
			return move;
		else if (cells[9] == move && cells[6] == move && cells[3] == move)
			return move;
		else if (cells[7] == move && cells[5] == move && cells[3] == move)
			return move;
		else if (cells[9] == move && cells[5] == move && cells[1] == move)
			return move;
		else
			return "none";
		
	}
}
