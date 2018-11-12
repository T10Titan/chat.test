package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;

public class ChatController
{
	private Chatbot simpleBot;
	private String chatBotInput;

	public ChatController()
	{
		simpleBot = new Chatbot();

	}

	public void start()
	{
		String userInput = " ";
		
		while (!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
					
		}
	}

	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(text);
		chatBotInput = simpleBot.processText(userInput);

		return chatBotInput;
	}

	public Chatbot getChatbot()
	{

		return simpleBot;
	}

	public boolean chatbotCheckers()
	{
		boolean isCheck = false;

		return isCheck;
	}

}
