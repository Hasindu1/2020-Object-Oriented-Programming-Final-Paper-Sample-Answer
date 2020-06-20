//Developed by Hasindu Dahanayake
package QUESTION1;

public class MenInBlack {
	protected int score ;
	protected AlienPack alienPack;
	
	public MenInBlack(AlienPack alienPack) {
		super();
		this.score = 0;
		this.alienPack = alienPack;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public AlienPack getAlienPack() {
		return alienPack;
	}

	public void setAlienPack(AlienPack alienPack) {
		this.alienPack = alienPack;
	}
	
	public void kill() {
		Alien tempAlienArr[] =alienPack.getAliens();
		int score = 0;
		for(int i = 0 ; i < tempAlienArr.length ; i++) {
			score = score + tempAlienArr[i].getScore();
			
		}
		this.score = score;
		
		
	}
	
	

}
