//Developed by Hasindu Dahanayake
package QUESTION1;

public class AlienPack {
	private Alien aliens[];

	public AlienPack(int numberOfAliens) {
		this.aliens = new Alien[numberOfAliens];
	}
	public void addAlien(Alien alien , int index) {
		aliens[index] = alien;
	}
	public Alien[] getAliens() {
		return aliens;
	}
	
	
	
	
	
	
	

}
