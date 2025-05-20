

package hangman;


public class GameController {


	private String word;
	private char[] hiddenWord;
	private int lives; 
	
	/*
	* stores the word the player needs to guess
	* creates the hidden ver of that word (with dashes)
	* calls the fillDashes, which will fill in the dashes so the game start with a blank word
	*/
	
	public GameController(String wordIn)
	{
		word = wordIn;
		hiddenWord = new char[word.length()];
		fillDashes();
		
	}
   
	/*
     * Handles a letter guess by the player.
     * If letter is correct, then hidden word will be revealed.
     * else, the player loses one life.
     */
	
	public void guessLetter(char achar)
	{
		boolean guess = false;
		for(int i = 0; i<word.length(); i++)
		{
			if(achar == word.charAt(i)){
				hiddenWord[i] = achar;
				guess = true;
			}	
		}
		if(!guess)
			lives--;
	
	}
	
	//checks whether the game has ended - ends if player guessed the word or has no lives left
	public boolean isEndGame()
	{
		if(word.equalsIgnoreCase(showDashes()) || lives == 0)
			return true;
		else 
			return false;
			
		

	}
	
	// returns the og word
	public String showWord()
	{
		return word;
	}
	
	
	public String showDashes()
	{
		String s ="";
		for(int i = 0; i< hiddenWord.length; i++)
			s +=hiddenWord[i];
		
		return s;
	}
	

	public void fillDashes()
	{
		for(int i = 0; i< hiddenWord.length; i++)
		hiddenWord[i]='-';		
	}
	
	
	public int getLives()
	{
		return lives;
	}
	

	public void setLives(int livesIn)
	{
		lives = livesIn;
	}
}
