package recursion.controller;

import recursion.view.RecursionPopupDisplay;

public class RecursionController
{
	private RecursionPopupDisplay display;
	
	public RecursionController()
	{
		display = new RecursionPopupDisplay();
	}
	
	public void start()
	{
	recursionPop("Display sample");
	}
	private void recursionPop(String message)
		{
		if(message.length() == 1)
			{
			display.displayText(message);
			}
		else
		{
		
		recursionPop(message.substring(1,  message.length()));
		display.displayText(message);
		}
	}
}
