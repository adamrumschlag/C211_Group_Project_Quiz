//Author(s): Adam Rumschlag

public class Profile {
	//Attributes
	int production; //a
	int connection; //c
	int stability; //d
	int variety; //f
	int internal; //b
	int external; //e
	String yourProfile;
	
	public Profile(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("a"))
				this.production += 1;
			else if(arr[i].equals("b"))
				this.internal += 1;
			else if(arr[i].equals("c"))
				this.connection += 1;
			else if(arr[i].equals("d"))
				this.stability += 1;
			else if(arr[i].equals("e"))
				this.external += 1;
			else if(arr[i].equals("f"))
				this.variety += 1;
		}
	}
	
	//Only used for testing console version
	public void test() {
		System.out.println(production); //a
		System.out.println(connection); //c
		System.out.println(stability); //d
		System.out.println(variety); //f
		System.out.println(internal); //b
		System.out.println(external); //e
	}

    
    public String getDrives() {
    	
    	if(production > connection)
    		return "p";
    	else
    		return "c";
    }
    
    public String getNeeds() {
    	
    	if(stability > variety)
    		return "s";
    	else
    		return "v";
    }
    
    public String getAwards() {
    	
    	if(internal > external)
    		return "i";
    	else
    		return "e";
    }
    
    public String getProfile() {
    	String drives = getDrives();
    	String needs = getNeeds();
    	String awards = getAwards();
    	
    	return drives + needs + awards;
    }
    
    public String aboutProfile() {
    	String profile = getProfile();
    	
    	switch(profile) {
    	case "psi":
    	yourProfile = "Your profile is: The Director\n\n"
    	+ "Directors are strategic thinkers who have the ability to move projects forward. They have an eye for detail and energy for execution. Directors are practical and responsible. They are bottom-line people who like to get to the point. Directors are task-oriented and great problem solvers. They are good with schedules, systems, and organization. They focus on achievement and value results. Directors excel in organizations that allow them some autonomy. They know that they bring value to their companies and they need to feel genuinely appreciated for their contributions. Directors are mission-minded and want their work to make a positive contribution.";
    	break;
    	case "pse":
        yourProfile = "Your profile is: The Chief\n\n"
        + "Chiefs have a strong desire for tangible results combined with a need for precision. Chiefs are determined and strong-minded. They are independent and able to work unsupervised with good results. Chiefs can make quick decisions but prefer to do so when they first have all the facts. They enjoy having the authority to chart their own course. They have considerable organizational ability and are able to develop systems and procedures easily. Chiefs feel validated and esteemed by tangible benefits.  They methodically work toward goals that offer significant, concrete rewards. They are “mission accomplished” people with a need to achieve specific objectives.";
    	break;  
    	case "pvi":
        yourProfile = "Your profile is: The Visionary\n\n"
        + "Visionaries are persistent, energetic, and confident. They are able to organize people and projects. They exhibit strong leadership potential and react quickly to crisis. Creative thinkers, Visionaries have the ability to craft a vision and get others excited about it. They enjoy working on multiple projects at the same time and like to be involved in exploring alternative concepts. Farsighted and imaginative, Visionaries are good at finding original solutions to difficult problems.  Visionaries enjoy change and thrive under pressure. They have the ability to shift gears and turn on a dime. They are confident in their ability to master new skills. Visionaries enjoy challenge and desire personal growth. Visionaries want to know that their work matters and desire to “go where no man has gone before”.";
    	break;
    	case "pve":
    	yourProfile = "Your profile is: The Champion\n\n"
    	+ "Champions enjoy a challenge and love to win. They are charming and enthusiastic leaders. Champions are natural persuaders. They don’t mind being the center of attention and are good at working with others while advancing their own ideas. Champions tend to be engaging and charismatic. They are skilled at getting things done in spite of seemingly insurmountable obstacles. In fact, obstacles just make tasks more interesting for a Champion. They are quick decision makers and can be impatient with those who are not. As solid negotiators, Champions are willing to compromise to get the job done. Champions have an innate ability to get others to follow their lead.";
    	break; 
    	case "csi":
    	yourProfile = "Your profile is: The Supporter\n\n"
    	+ "Supporters are practical, dependable, and loyal. They are both people-oriented and detail-oriented. Supporters are natural supervisors. They thrive on helping others excel in their positions and will fight for the underdog. Methodical in their work, they like to have the facts before they act. They respect authority and organizational structure. Caring and careful with people and projects, Supporters are skillful at implementing procedures. They possess a strong work ethic. Having a clearly defined goal to work toward is important to them, and they follow through on objectives with conscientiousness. Psychological pay is of primary importance to them. They need to feel good about what they are doing and sense that their work makes a positive contribution.";
    	break;
    	case "cse":
    	yourProfile = "Your profile is: The Refiner\n\n"
    	+ "Refiners are systematic thinkers who value precision. They have the ability to see the big picture while still focusing on the details. Refiners are conscientious and disciplined. They are supportive and respectful of others. Personal and practical,Refiners tend to be family-oriented. They are deeply loyal and have a well-defined sense of right and wrong. They prefer a “democratic” style of leadership and expect others to play according to the rules. Refiners are dependable and diligent. Fair pay and sincere appreciation for their work make them feel valued. They are deliberate in their decision making and want to ensure that their choices do not adversely affect others.";
    	break; 
    	case "cvi":
    	yourProfile = "Your profile is: The Relater\n\n"
    	+ "Relaters are caring and creative. They relish life and cherish relationships. Relaters are outgoing, friendly, and well liked. They are resourceful and inventive, with an ability to compromise to get the job done. They are team players who bring out the best in others. Warm and enthusiastic, they balance concern for others with a zeal for personal growth. Relaters are personal and practical in their approach to problem solving. They have an innate ability to create win-win solutions. Relaters value what is really important and desire to make a positive contribution to society. Blending loyalty with adventure, Relaters are fun friends and devoted partners.";
    	break;
    	case "cve":
    	yourProfile = "Your profile is: The Explorer\n\n"
    	+ "Explorers are animated and spontaneous, with a love for adventure. They are perceptive, insightful, and very good at reading people. Warm, considerate, and thoughtful, Explorers light up in social situations. Explorers bring out the best in others by encouraging and appreciating them. They are creative problem solvers and are skilled at finding unique solutions. Explorers foster cooperation and are good at getting others to collaborate. They value hard work --- but they want their work to be fun and rewarding. Explorers like jobs that give them the opportunity to learn new skills and meet new people.";
    	break;

    	}
		return yourProfile;
    	
		//Only used for testing console version
    	/*switch(profile) {
    	case "psi":
    	System.out.println("Your profile is: The Director");
    	System.out.print("Directors are strategic thinkers who have the ability to move projects forward.  They have an eye for detail and energy for execution.  Directors are practical and responsible.  They are bottom-line people who like to get to the point.  Directors are task-oriented and great problem solvers.  They are good with schedules, systems, and organization.  They focus on achievement and value results.  Directors excel in organizations that allow them some autonomy.  They know that they bring value to their companies and they need to feel genuinely appreciated for their contributions.  Directors are mission-minded and want their work to make a positive contribution.");
    	break;
    	case "pse":
    	System.out.println("Your profile is: The Chief");
    	System.out.print("Chiefs have a strong desire for tangible results combined with a need for precision.  Chiefs are determined and strong-minded.  They are independent and able to work unsupervised with good results.  Chiefs can make quick decisions but prefer to do so when they first have all the facts.  They enjoy having the authority to chart their own course.  They have considerable organizational ability and are able to develop systems and procedures easily.  Chiefs feel validated and esteemed by tangible benefits.  They methodically work toward goals that offer significant, concrete rewards.  They are “mission accomplished” people with a need to achieve specific objectives.");
    	break;  
    	case "pvi":
    	System.out.println("Your profile is: The Visionary");
    	System.out.print("Visionaries are persistent, energetic, and confident.  They are able to organize people and projects.  They exhibit strong leadership potential and react quickly to crisis.  Creative thinkers, Visionaries have the ability to craft a vision and get others excited about it.  They enjoy working on multiple projects at the same time and like to be involved in exploring alternative concepts.  Farsighted and imaginative, Visionaries are good at finding original solutions to difficult problems.   Visionaries enjoy change and thrive under pressure.  They have the ability to shift gears and turn on a dime.  They are confident in their ability to master new skills.  Visionaries enjoy challenge and desire personal growth.  Visionaries want to know that their work matters and desire to “go where no man has gone before”.");
    	break;
    	case "pve":
    	System.out.println("Your profile is: The Champion");
    	System.out.print("Champions enjoy a challenge and love to win. They are charming and enthusiastic leaders. Champions are natural persuaders. They don’t mind being the center of attention and are good at working with others while advancing their own ideas. Champions tend to be engaging and charismatic. They are skilled at getting things done in spite of seemingly insurmountable obstacles. In fact, obstacles just make tasks more interesting for a Champion. They are quick decision makers and can be impatient with those who are not. As solid negotiators, Champions are willing to compromise to get the job done. Champions have an innate ability to get others to follow their lead.");
    	break; 
    	case "csi":
    	System.out.println("Your profile is: The Supporter");
    	System.out.print("Supporters are practical, dependable, and loyal. They are both people-oriented and detail-oriented. Supporters are natural supervisors. They thrive on helping others excel in their positions and will fight for the underdog. Methodical in their work, they like to have the facts before they act. They respect authority and organizational structure. Caring and careful with people and projects, Supporters are skillful at implementing procedures. They possess a strong work ethic. Having a clearly defined goal to work toward is important to them, and they follow through on objectives with conscientiousness. Psychological pay is of primary importance to them. They need to feel good about what they are doing and sense that their work makes a positive contribution.");
    	break;
    	case "cse":
    	System.out.println("Your profile is: The Refiner");
    	System.out.print("Refiners are systematic thinkers who value precision. They have the ability to see the big picture while still focusing on the details. Refiners are conscientious and disciplined. They are supportive and respectful of others. Personal and practical,Refiners tend to be family-oriented. They are deeply loyal and have a well-defined sense of right and wrong. They prefer a “democratic” style of leadership and expect others to play according to the rules. Refiners are dependable and diligent. Fair pay and sincere appreciation for their work make them feel valued. They are deliberate in their decision making and want to ensure that their choices do not adversely affect others.");
    	break; 
    	case "cvi":
    	System.out.println("Your profile is: The Relater");
    	System.out.print("Relaters are caring and creative. They relish life and cherish relationships. Relaters are outgoing, friendly, and well liked. They are resourceful and inventive, with an ability to compromise to get the job done. They are team players who bring out the best in others. Warm and enthusiastic, they balance concern for others with a zeal for personal growth. Relaters are personal and practical in their approach to problem solving. They have an innate ability to create win-win solutions. Relaters value what is really important and desire to make a positive contribution to society. Blending loyalty with adventure, Relaters are fun friends and devoted partners.");
    	break;
    	case "cve":
    	System.out.println("Your profile is: The Explorer");
    	System.out.print("Explorers are animated and spontaneous, with a love for adventure. They are perceptive, insightful, and very good at reading people. Warm, considerate, and thoughtful, Explorers light up in social situations. Explorers bring out the best in others by encouraging and appreciating them. They are creative problem solvers and are skilled at finding unique solutions. Explorers foster cooperation and are good at getting others to collaborate. They value hard work --- but they want their work to be fun and rewarding. Explorers like jobs that give them the opportunity to learn new skills and meet new people.");
    	break;
    	}*/
    }
    
}
