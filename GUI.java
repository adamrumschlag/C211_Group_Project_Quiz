//Author(s): Noah Paprocki and Adam Rumschlag

//import java.util.Scanner;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class GUI {

	//Questions for Quiz
	static 	Question q1 = new Question(
			"a", 
			"I am an achievement-oriented person who seeks to excel.", 
			"c", 
			"I am a supportive, friendly person who seeks intimacy with others" 
		);
	
	static Question q2 = new Question(
			"d",
			"I tend to be methodical and cautious.", 
			"f", 
			"I tend to be spontaneous and adventurous."
		);

	static Question q3 = new Question(	
			"b",
			"I need to do work that is important to me.", 
			"e", 
			"I want to be rewarded for excellent work."
		);

	static Question q4 = new Question(
			"a",
			"I can come across as being too sure of myself.", 
			"c", 
			"I can come across as being unsure of myself."
		);

	static Question q5 = new Question(
			"d",
			"I like it when my life is unhurried, stable, and peaceful.", 
			"f", 
			"I like it when my life is fast-paced, intense, and exciting."
		);

	static Question q6 = new Question(
			"b",
			"I prefer private recognition to public recognition.", 
			"e", 
			"I prefer public recognition to private recognition."
		);

	static Question q7 = new Question(
			"d",
			"I am careful and try to prepare for unforeseen problems.", 
			"f", 
			"I am creative and prefer to improvise as probles come up."
		);

	static Question q8 = new Question(
			"a",
			"Most of the time, I enjoy taking the lead.", 
			"c", 
			"Most of the time, I prefer letting someone else lead."
		);

	static Question q9 = new Question(
			"b",
			"I am willing to forgo financial reward and personal recognition if it means doing work that makes a significant positive difference.", 
			"e", 
			"I have pursued work that had considerable potential for financial success and personal recognition"
		);

	static Question q10 = new Question(
			"a",
			"Basically, I am hard-driving, assertive, and confident", 
			"c", 
			"Basically, I am laid-back, open, and agreeable."
		);

	static Question q11 = new Question(
			"b",
			"Acquiring the finer things of life is not very important to me.", 
			"e", 
			"Acquiring the finer things of life is extremely important to me."
		);

	static Question q12 = new Question(
			"d",
			"I have tended to be focused and disciplined", 
			"f", 
			"I have tended to be impulsive and daring."
		);

	static Question q13 = new Question(
			"a",
			"I make things happen.", 
			"c", 
			"Whatever will be will be"
		);

	static Question q14 = new Question(
			"d",
			"I enjoy managing details.", 
			"f", 
			"I don't like dealing with details."
	);

	static Question q15 = new Question(
			"b",
			"Leaving a legacy of contribution to mankind is important to me.", 
			"e", 
			"Acquiring wealth and respect is important to me."
		);

	static Question q16 = new Question(
			"a",
			"I'd rather stand out than fit in.", 
			"c", 
			"I'd rather fit in than stand out."
		);

	static Question q17 = new Question(
			"e",
			"I'm interested in maintaining my stability and peace of mind.", 
			"f", 
			"I'm interested in challenging myself by doing new things."
		);

	static Question q18 = new Question(
			"b",
			"When considering a new job, the work itself is a primary issue.", 
			"e", 
			"When considering a new job, pay and perks are a primary issue."
		);

	static Question q19 = new Question(
			"a",
			"I like to challenge the status quo and shake things up.", 
			"c", 
			"I like to comfort people and calm them down."
		);

	static Question q20 = new Question(
			"b",
			"What others think of me is very important.", 
			"e", 
			"As long as I am true to myself, what others think is not important."
		);

	static Question q21 = new Question(
			"d",
			"Implementing ideas and ensuring procedures are followed is one of my major strengths.", 
			"f", 
			"Coming up with new ideas and getting people excited about them is one of my major strengths"
		);
	

	
	public static void main(String[] args) {
		
		
		//Test the output method on the Question class
		//q1.output();
		
		//Create array of all questions
		Question[] allquestions = new Question[21];
		allquestions[0] = q1;
		allquestions[1] = q2;
		allquestions[2] = q3;
		allquestions[3] = q4;
		allquestions[4] = q5;
		allquestions[5] = q6;
		allquestions[6] = q7;
		allquestions[7] = q8;
		allquestions[8] = q9;
		allquestions[9] = q10;
		allquestions[10] = q11;
		allquestions[11] = q12;
		allquestions[12] = q13;
		allquestions[13] = q14;		
		allquestions[14] = q15;
		allquestions[15] = q16;
		allquestions[16] = q17;
		allquestions[17] = q18;
		allquestions[18] = q19;
		allquestions[19] = q20;
		allquestions[20] = q21;
		
		String[] answers = new String[21];
		
		//Only used for testing console version
		/*for(int i = 0; i < allquestions.length; i++) {
			Scanner scn = new Scanner(System.in);
			allquestions[i].output();
			String answer = scn.nextLine().toLowerCase();
			answers[i] = answer;
		}
		
			
		Profile getProilfe = new Profile(answers);
		getProilfe.aboutProfile();*/
		
		/*Testing
		for(int i = 0; i < allquestions.length; i++) {
			System.out.println("Question " + i);
			System.out.println(allquestions[i].choice_one_type + " " + allquestions[i].choice_one);
			System.out.println(allquestions[i].choice_two_type + " " + allquestions[i].choice_two);
			System.out.println();
		}*/
		
		JFrame frame = new JFrame();
		JTextField instructions = new JTextField();
		JTextArea choice = new JTextArea();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		
		instructions.setBounds(0,0,600,50);
		instructions.setEditable(false);	
		instructions.setText("Enter the letter of the corresponding choice (a, b, c, etc) that matches you the best.");
		
		choice.setMargin(new Insets(75,30,30,30));
		choice.setLineWrap(true);
		choice.setText(
							//Testing the array
							//"Choice " + allquestions[0].choice_one_type + ": \n" + allquestions[0].choice_one + "\n\n" +
							//"Choice " + allquestions[0].choice_two_type + ": \n" + allquestions[0].choice_two		
							"Click the button below to start the quiz.\n\nEnter the letter of the choice that best describes you."
				);
		
		
		JButton btn = new JButton("Start");
		btn.setBounds(150, 300, 325, 50);	
		
		JTextField userInput = new JTextField("");
		userInput.setBounds(100, 250, 100, 50);
		choice.add(userInput);
		userInput.setVisible(false);

		choice.add(btn);
		
		ActionListener actionListener = new ActionListener() {
			int i = 0;
			@Override 
			  public void actionPerformed(ActionEvent e) {	
				
				if(i <= 20) {
					btn.setBounds(150, 350, 325, 50);
					btn.setText("Next");
					userInput.setVisible(true);
				  	choice.setText(
				  	"Enter " + allquestions[i].choice_one_type + " or " + allquestions[i].choice_two_type + " in the text field below.\n\n" +
					"Choice " + allquestions[i].choice_one_type + ": \n" + allquestions[i].choice_one + "\n\n" +
					"Choice " + allquestions[i].choice_two_type + ": \n" + allquestions[i].choice_two		
					);		  	
				  	answers[i] = userInput.getText();
				  	i++;
				  	userInput.setText("");
				} else if (i > 20) {
					instructions.setText("See your Motivational DNA Profile below!");
					btn.setVisible(false);
					userInput.setVisible(false);
					Profile test = new Profile(answers);
					String result = test.aboutProfile();
					choice.setText(
							result
					);
				}
			}
		};
		
		btn.addActionListener(actionListener);
		
		frame.add(instructions);
		frame.add(choice);
		
		frame.setVisible(true);
		
	}

}



