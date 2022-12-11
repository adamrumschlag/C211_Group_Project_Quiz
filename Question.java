//Author(s): Adam Rumschlag

public class Question {

	//Attributes
	String choice_one_type;
	String choice_one;
	String choice_two_type;
	String choice_two;
	
	//Default Constructor
	public Question() {
		choice_one_type = "z";
		choice_one = "";
		choice_two_type = "z";
		choice_two = "";
	}
	
	//Constructor
    public Question(String c1t, String c1, String c2t, String c2){
        choice_one_type = c1t;
        choice_one = c1;
        choice_two_type = c2t;
        choice_two = c2;
    }
    
    //Method - Output
    //Only used for testing console version
    public void output(){
        System.out.println("Please select the choice that most represents your style");
        System.out.println(choice_one_type + " :" + choice_one);
        System.out.println(choice_two_type + " :" + choice_two);
    }
}
