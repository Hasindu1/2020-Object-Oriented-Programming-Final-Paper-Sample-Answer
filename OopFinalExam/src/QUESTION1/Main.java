package QUESTION1;

public class Main {

	public static void main(String[] args) {
		AlienPack pack1 = new AlienPack(5);
		pack1.addAlien(new MarshmalloAlien(), 0);
		pack1.addAlien(new OrgenAlien(), 1);
		pack1.addAlien(new OrgenAlien(), 2);
		pack1.addAlien(new SnakeAlien(), 3);
		pack1.addAlien(new MarshmalloAlien(), 4);

		MenInBlack AgentK = new MenInBlack(pack1);
		AgentK.kill();

//		MenInBlackLevel2 AgentK = new MenInBlackLevel2(pack1);//To demonstrate the level 2 
//		AgentK.kill();
		System.out.println("Your score is " + AgentK.getScore());

	}

}
