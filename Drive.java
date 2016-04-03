import java.util.Scanner;

public class Drive 
{
	static char[] row1 = {'_','_','_'};
	static char[] row2 = {'_','_','_'};
	static char[] row3 = {'_','_','_'};
	
	
	public static void main(String[] arg)
	{
		Drive.displayBoard();
		System.out.print("Please enter a row:");
		int row = Drive.getIntFromUser();
		System.out.print("Please enter a column:");
		int column = Drive.getIntFromUser();
		Drive.makeMove(row, column, 'X');
		Drive.displayBoard();
	}

	

	
	
	
	public String gamePiece(int player)
	{
		String result = "";
		if(player == 1)
		{
			result = "X";
		}
		else if(player == 2)
		{
			result = "O";
		}
		return result;
		
	}
	
	static void makeMove(int row, int column, char move)
	{
		char [] theRow = row1;
		if(row == 2)
		{
			theRow = row2;
		}
		else if(row == 3)
		{
			theRow = row3;
		}
		theRow[column-1] = move;
	}
	
	static int getIntFromUser()
	{
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	static void displayRow(char[] row)
	{
		for(int i = 0; i < row.length; i = i + 1)
		{
			if(row[i] == '_')
			{
				System.out.print("___\t");
			}
			else if(row[i] == 'X')
			{
				System.out.print("_X_\t");
			}
			else
			{
				System.out.print("_O_");
			}
		}
		System.out.println("");
	}
	static void displayBoard()
	{
		Drive.displayRow(row1);
		Drive.displayRow(row2);
		Drive.displayRow(row3);
	}
	
}