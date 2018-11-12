package chat.controller;

import javax.swing.JOptionPane;


public class ChatController
{
	private void SimpleBot()
	{

	}
	public void chatController()
	{
		Chatbot = new SimpleBot();
		
	}

public void start()
	
	{
		String userInput = " ";
		
		while (!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput)
					
		}
	}
	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(text);
		chatbotSays = simpleBot.processText(userInput);
		
		return chatbotSays;
	}

	public void get()
	{

	}

	public void ChatController()
	{

	}



}
