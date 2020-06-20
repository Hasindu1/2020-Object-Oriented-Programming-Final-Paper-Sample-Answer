//Developed by Hasindu Dahanayake
package QUESTION1;

public class MenInBlackLevel2 extends MenInBlack {

	public MenInBlackLevel2(AlienPack alienPack) {
		super(alienPack);
		
	}

	@Override
	public void kill() {
		Alien tempAlienArr[] =alienPack.getAliens();
		int score = 0;
		for(int i = 0 ; i < tempAlienArr.length ; i++) {
			
			score = score + tempAlienArr[i].getScore();
			int damage = (int)(Math.random() *10) ;//Generating a random number to calculate the damage
			
			if(damage % 2 != 0) {//Check whether if the damage is containing an odd value
				score = score -2;
			}
			
			
		}
		this.score = score;
		
	}
	
	
	
	

}
