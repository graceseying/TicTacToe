
void public class JavaLanguage 
{
	//memory -> variables
	//type name = value;
	int a = 5; //alice whole number
	String s = "hello"; //alice text string
	boolean b = false; //allice boolean
	
	//java arrays - collections of variables
	//type[] name = new type[how many];
	int[] ar = new int[10]; //empty array that I can add 10 things to
	
	
	//asking questions - conditionals
	//if(boolean-expr){ 1 or more statements } else { 1 or more statements }
	if(a < 10)
	{
		System.out.println("Less than 10!");
		a = a * 2;
	}
	else
	{
		a = a / 2;
	}
	
	//repetion
	//for loop
	//for(initial counter; boolean expr; change counter) { 1 or more statements }
	//while(boolean expr) { 1 or more statements }
	//do { 1 or more statements }while(boolean expr); post-check loop
	for(int i = 0; i < 10; i = i + 1) //counting problems
	{
		System.out.println(i);
	}
	
	int i = 0;
	while(i < 10) //problems where we do not know how many times we must repeat
	{
		System.out.println(i);
	}
	
	i = 0; 
	do //problems where the body must execute at least once
	{ 
		System.out.println(i);
		i = i + 1;
	}
	while(i < 10);
}

//return-type name(comma dilim inputs) { 1 or more statements }
static void javaFunction(int param1, char param2)
{
	System.out.println(param1 + " - " + param2);
}

}
