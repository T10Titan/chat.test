package chat.model;

import javax.swing.JOptionPane;

import botchat.ArrayList;

public class ChatbotModel
{

	private void responseList()
	{

	}

	private void currentUser()
	{

	}

	private void content()
	{

	}

	
	private void spookyList()
	{

	}

	public void chatBot()
	{
		this.joke = "Why did the monkey cross the road? cause I watned to get to out village ";
		this.currentUser = new String("Then I beat the monkey");
		this.content = new String("Then the  monkey never came back to our village");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
private void buildTheLists()
	{
		responseList.add("No");
		responseList.add("goodbye.");
		responseList.add("Hi im TI who are you");
		responseList.add("give me info");
		responseList.add("Oh your just a normal human ok then.....")
		spookyList.add("Halloween is good for candy");
		spookyList.add("Hey listen to this.. Boo. Yea i got ya dont say I didnt CAUSE I DID!")
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
JOptionPane.showInputDialog(null,"Hey buddy Im not joking wit u");
		}
	}
	
	
}
