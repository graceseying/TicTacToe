import java.util.Scanner;

public class MadHatter extends Biped
{
	int getIntegerFromUser(String msg)
	{
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		int answer = input.nextInt();
		return (answer);
	}
}
