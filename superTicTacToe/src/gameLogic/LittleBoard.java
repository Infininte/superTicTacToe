package gameLogic;

public class LittleBoard 
{
	private static String owner = "none";
	private static int ownerNum = 0;
	
	public int board(int cellPlace, String newMove)
	{
		String cells[];
		cells = new String[10];
		String move = newMove;
		
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
		
		cellPlace = changeMove(cellPlace, move, cells);
		
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
		
		
	return cellPlace;
	}

	//move on the small board
	private int changeMove(int cellPlace, String newMove, String[] cells)
	{
		if(cellPlace == 1 && cells[0] == " ")
		{
			cells[0] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 2 && cells[1] == " ")
		{
			cells[1] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 3 && cells[2] == " ")
		{
			cells[2] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 4 && cells[3] == " ")
		{
			cells[3] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 5 && cells[4] == " ")
		{
			cells[4] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 6 && cells[5] == " ")
		{
			cells[5] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 7 && cells[6] == " ")
		{
			cells[6] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 8 && cells[7] == " ")
		{
			cells[7] = newMove;
			return cellPlace;
		}
		else if(cellPlace == 9 && cells[8] == " ")
		{
			cells[8] = newMove;
			return cellPlace;
		}
		else
			//10 is an error it will be picked up by the main class
			return 10;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public int getOwnerNum()
	{
		return ownerNum;
	}
}