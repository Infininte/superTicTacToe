package gameLogic;

public class LittleBoard 
{
	public void board()
	{
		String cells[];
		cells = new String[10];
		String move = " ";
		String owner = "none";
		int ownerNum = 0;
		winner winner = new winner();
		
		cells[0] = " ";
		cells[1] = " ";
		cells[2] = " ";
		cells[3] = " ";
		cells[4] = " ";
		cells[5] = " ";
		cells[6] = " ";
		cells[7] = " ";
		cells[8] = " ";
		cells[9] = " ";
		
		//Determine the winner of the board
		if (winner.decideWinner(cells, move) != "none")
		{
			String win = winner.decideWinner(cells, move);
			if (win != owner)
			{
				if(ownerNum > 1)
					ownerNum -= 1;
				else if(ownerNum == 1)
					if (owner == "X")
					{
						owner = "O";
					}
					else if(owner == "O")
					{
						owner = "X";
					}
				else
					owner = win;
			}
			else if (win == owner)
				ownerNum++;
		}
	
	}


//move on the small board
public void changeMove(int cellPlace, String newMove, String[] cells)
{
	if(cellPlace == 1)
		cells[0] = newMove;
	else if(cellPlace == 2)
		cells[1] = newMove;
}

}