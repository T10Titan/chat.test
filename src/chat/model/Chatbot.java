package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Chatbot
{

	private String joke;
	private String currentUser;
	private String content;
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;

	
	public ArrayList<String> getResponseList()
	{
		return responseList;

	}

	public String getCurrentUser()
	{
		return currentUser;
	}

	public String getContent()
	{
		return content;
	}

	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}

	public Chatbot()
	{
		this.joke = "Why did the monkey cross the road? cause I watned to get to out village ";
		this.currentUser = new String("Then I beat the monkey");
		this.content = new String("Then the  monkey never came back to our village");

		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();

		buildTheLists();

	}

	public Chatbot(String content)
	{
		this.joke = "Why did the monkey cross the road? cause I watned to get to out village ";
		this.currentUser = new String("Then I beat the monkey");
		this.content = new String("Then the  monkey never came back to our village");

		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();

		buildTheLists();

	}

	public void buildTheLists()
	{
		responseList.add("No");
		responseList.add("goodbye.");
		responseList.add("Hi im T.I. who are you");
		responseList.add("give me info");
		responseList.add("Oh your just a normal human ok then.....");
		responseList.add("Halloween is good for candy");
		responseList.add("Hey listen to this.. Boo. Yea i got ya. dont say I didnt CAUSE I DID!");

	}

	public String processText(String userText)
	{
		String output = "";

		output += "You said: " + userText;

		return output;
	}

	public void askName()
	{
		String userAnswer = JOptionPane.showInputDialog(null, "What is your name");
		if (userAnswer == null)
		{
			JOptionPane.showInputDialog(null, "Hey buddy Im not joking wit u");
		}
	}

	public boolean legitimacyChecker(String input)
	{
		boolean isValid = false;
		if (input == null || input == "")
		{
			isValid = false;
		}
		return isValid;
	}
	
	public boolean spookyChecker(String input)
	{
		boolean isValid = false;
		if (input == null || input == "")
		{
			isValid = false;
		}
		return isValid;
	}
	
	public boolean contentChecker(String input)
	{
		boolean isValid = false;
		if (input == null || input == "")
		{
			isValid = false;
		}
		return isValid;
	}
	
	
}
