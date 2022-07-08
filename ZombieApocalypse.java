//Importing scanner for player input

import java.util.Scanner;

//Declaring class

public class ZombieApocalypse {

	//Declaring main method

	public static void main( String[] args ) {
		
		//Clear screen for a cleaner look

		System.out.print("\033[H\033[2J");
		System.out.flush();




		//In game variables

		Scanner input = new Scanner(System.in);
		boolean gameOver = false;
		int colSizeOne = 10;
		int rowSizeOne = 10;
		int playerX = 0;
		int playerY = 0;
		int exitX = colSizeOne -1;
		int exitY = rowSizeOne -1;
		int zombieOneX = 5;
		int zombieOneY = 5;
		int zombieSixteenX = -104;
		int zombieSixteenY = -104;
		int zombieSeventeenX = -105;
		int zombieSeventeenY = -105;
		int zombieEighteenX = -106;
		int zombieEighteenY = -106;
		int zombieNineteenX = -107;
		int zombieNineteenY = -107;
		int playerArmorX = (int) (Math.random() * (4-1) + 1);
		int playerArmorY = (int) (Math.random() * (4-1) + 1);
		int playerWeaponX = (int) (Math.random() * (8-6) + 6);
		int playerWeaponY = (int) (Math.random() * (4-1) + 1);
		int playerBootsX = (int) (Math.random() * (4-1) + 1);
		int playerBootsY = (int) (Math.random() * (8-6) + 6);
		int keyX = 0;
		int keyY = 9;
		String floorTile = ". ";
		String playerTile = "p ";
		String zombieOneTile = "z ";
		String zombieSixteenTile = "z ";
		String zombieSeventeenTile = "z ";
		String zombieEighteenTile = "z ";
		String zombieNineteenTile = "z ";
		String exitTile = "# ";
		String playerArmorTile = "$ ";
		String playerWeaponTile = "+ ";
		String playerBootsTile = "& ";
		String keyTile = "% ";
		char myChar = '!';
		

		
		
		//"End game" screen variables

		int colSizeTwo = 20;
		int rowSizeTwo = 20;
		int zombieTwoX = (int) (Math.random() * 20);
		int zombieTwoY = (int) (Math.random() * 20);
		int zombieThreeX = (int) (Math.random() * 20);
		int zombieThreeY = (int) (Math.random() * 20);
		int zombieFourX = (int) (Math.random() * 20);
		int zombieFourY = (int) (Math.random() * 20);
		int zombieFiveX = (int) (Math.random() * 20);
		int zombieFiveY = (int) (Math.random() * 20);
		int zombieSixX = (int) (Math.random() * 20);
		int zombieSixY = (int) (Math.random() * 20);
		int zombieSevenX = (int) (Math.random() * 20);
		int zombieSevenY = (int) (Math.random() * 20);
		int zombieEightX = (int) (Math.random() * 20);
		int zombieEightY = (int) (Math.random() * 20);
		int zombieNineX = (int) (Math.random() * 20);
		int zombieNineY = (int) (Math.random() * 20);
		int zombieTenX = (int) (Math.random() * 20);
		int zombieTenY = (int) (Math.random() * 20);
		int zombieElevenX = (int) (Math.random() * 20);
		int zombieElevenY = (int) (Math.random() * 20);
		int zombieTwelveX = (int) (Math.random() * 20);
		int zombieTwelveY = (int) (Math.random() * 20);
		int zombieThirteenX = (int) (Math.random() * 20);
		int zombieThirteenY = (int) (Math.random() * 20);
		int zombieFourteenX = (int) (Math.random() * 20);
		int zombieFourteenY = (int) (Math.random() * 20);
		int zombieFifteenX = (int) (Math.random() * 20);
		int zombieFifteenY = (int) (Math.random() * 20);
		String zombieTwoTile = zombieOneTile;
		String zombieThreeTile = zombieOneTile;
		String zombieFourTile = zombieOneTile;
		String zombieFiveTile = zombieOneTile;
		String zombieSixTile = zombieOneTile;
		String zombieSevenTile = zombieOneTile;
		String zombieEightTile = zombieOneTile;
		String zombieNineTile = zombieOneTile;
		String zombieTenTile = zombieOneTile;
		String zombieElevenTile = zombieOneTile;
		String zombieTwelveTile = zombieOneTile;
		String zombieThirteenTile = zombieOneTile;
		String zombieFourteenTile = zombieOneTile;
		String zombieFifteenTile = zombieOneTile;

			

		
		//Narrator Explains Zombie Apocalypse

		System.out.println("It is the year 2025...");
		System.out.println("");
		System.out.println("A deadly plague has ravaged the planet turning everyone who dies into the living dead.");
		System.out.println("You find yourself trapped in your house, cornered by a zombie.");
		System.out.println("The only way to survive is to gather all of your gear... AND ESCAPE!");
		System.out.println("But, stay alert for more zombies!");
		System.out.println("");
		System.out.println("(Use w, s, a, and d and press ENTER to move up, down, left, and right.)");
		System.out.println("(Collect your armor ($), boots (&), weapon (+), and key (%) and head for the exit (#)!)");
		System.out.println("(You cannot leave before collecting all your gear and the key.)");
		System.out.println("");
		
		

		
		//Initializng Game Loop

		while (gameOver == false) {

			


			//Game Area

			for (int y=0; y < rowSizeOne; y++) {
				for (int x=0; x < colSizeOne; x++) {
					if (x == playerX && y == playerY) {
						System.out.print(playerTile);
					}
					else if (x == zombieOneX && y == zombieOneY) {
						System.out.print(zombieOneTile);
					}					
					else if (x == zombieSixteenX && y == zombieSixteenY) {
						System.out.print(zombieSixteenTile);
					}
					else if (x == zombieSeventeenX && y == zombieSeventeenY) {
						System.out.print(zombieSixteenTile);
					}
					else if (x == zombieEighteenX && y == zombieEighteenY) {
						System.out.print(zombieEighteenTile);
					}
					else if (x == zombieNineteenX && y == zombieNineteenY) {
						System.out.print(zombieNineteenTile);
					}
					else if (x == exitX && y == exitY) {
						System.out.print(exitTile);
					}
					else if (x == playerArmorX && y == playerArmorY) {
						System.out.print(playerArmorTile);
					}
					else if (x == playerWeaponX && y == playerWeaponY) {
						System.out.print(playerWeaponTile);
					}
					else if (x == playerBootsX && y == playerBootsY) {
						System.out.print(playerBootsTile);
					}
					else if (x ==keyX && y == keyY) {
						System.out.print(keyTile);
					}
					else if (playerWeaponX == -100 && playerWeaponY == -100) {
						System.out.print(floorTile);
					}
					else if (playerBootsX == -101 && playerBootsY == -101) { 
						System.out.print(floorTile);
					}
					else if (playerArmorX == -102 && playerArmorY == -102) {
						System.out.print(floorTile);
					}
					else if (keyX == -103 && keyY == -103) {
						System.out.print(floorTile);
					}
					else {
						System.out.print(floorTile);
					}								
				}
				System.out.print("\n");
			}	
				
				

				
				//Player actions

				String choice = input.nextLine();

					//Execute Player Input

						if (choice.equals("w")) {
								playerY--;
							}
							else if (choice.equals("s")) {
								playerY++;
							}
							else if (choice.equals("a")) {
								playerX--;
							}
							else if (choice.equals("d")) {
								playerX++;
							}

				//Keeping player in bounds

				if (playerX > 9) {
					playerX = 9;
				}
				if (playerX < 0) {
					playerX = 0;
				}
				if (playerY > 9) {
					playerY = 9;
				}
				if (playerY < 0) {
					playerY = 0;
				}

				//Refreshing the screen after each input for a cleaner look	

				System.out.print("\033[H\033[2J");
				System.out.flush();

				//Removing gear tile from the game area after it's been collected
				//Adding zombie to the play area after each piece of gear is collected

				if (playerX == playerWeaponX && playerY == playerWeaponY) {
					playerWeaponX = -100;
					playerWeaponY = -100;
					zombieSixteenX = 8;
					zombieSixteenY = 8;
					System.out.println("A meager weapon, but better than nothing.");
					System.out.println("Look out! Another zombie got in!");
					System.out.println("");
					System.out.println("(Press ENTER to continue)");
						choice = input.nextLine();
						System.out.print("\033[H\033[2J");
						System.out.flush();
				}

				else if (playerX == playerBootsX && playerY == playerBootsY) {
					playerBootsX = -101;
					playerBootsY = -101;
					zombieSeventeenX = 8;
					zombieSeventeenY = 8;
					System.out.println("Boots will offer your feet some protection on the long journey ahead.");
					System.out.println("Oh no! Another zombie!");
					System.out.println("");
					System.out.println("(Press ENTER to continue)");
						choice = input.nextLine();
						System.out.print("\033[H\033[2J");
						System.out.flush();						
				}

				else if (playerX == playerArmorX && playerY == playerArmorY) {
					playerArmorX = -102;
					playerArmorY = -102;
					zombieEighteenX = 8;
					zombieEighteenY = 8;
					System.out.println("Hopefully your armor can protect you!");
					System.out.println("Watch out! Another zombie!");
					System.out.println("");
					System.out.println("(Press ENTER to continue)");
						choice = input.nextLine();
						System.out.print("\033[H\033[2J");
						System.out.flush();
				}

				else if (playerX == keyX && playerY == keyY) {
					keyX = -103;
					keyY = -103;
					zombieNineteenX = 8;
					zombieNineteenY = 8;
					System.out.println("You found the key to unlock the door! Make sure you have all of your gear before you leave.");
					System.out.println("Oh no! Not another zombie!");
					System.out.println("");
					System.out.println("(Press ENTER to continue)");
						choice = input.nextLine();
						System.out.print("\033[H\033[2J");
						System.out.flush();
				}




				//Zombie Actions

				int zombieOneChoice = (int) (Math.random() * 4);
					if (zombieOneChoice == 0) {
						zombieOneX = (zombieOneX + 1) % colSizeOne;
					}
					else if (zombieOneChoice == 1) {
						zombieOneX = --zombieOneX >= 0 ? zombieOneX : (colSizeOne - 1);
					}
					else if (zombieOneChoice == 2) {
						zombieOneY = --zombieOneY >= 0 ? zombieOneY : (rowSizeOne - 1);
					}
					else if (zombieOneChoice == 3) {
						zombieOneY = (zombieOneY + 1) % rowSizeOne;
					}

				//Restricting additional zombies' movements until after the gear is collected
				//so they don't accidentally wander into the play area

				if (playerWeaponX == -100 && playerWeaponY == -100) {
					int zombieSixteenChoice = (int) (Math.random() * 4);
				
					if (zombieSixteenChoice == 0) {
						zombieSixteenX = (zombieSixteenX + 1) % colSizeOne;
					}
					else if (zombieSixteenChoice == 1) {
						zombieSixteenX = --zombieSixteenX >= 0 ? zombieSixteenX : (colSizeOne - 1);
					}
					else if (zombieOneChoice == 2) {
						zombieSixteenY = --zombieSixteenY >= 0 ? zombieSixteenY : (rowSizeOne - 1);
					}
					else if (zombieSixteenChoice == 3) {
						zombieSixteenY = (zombieSixteenY + 1) % rowSizeOne;
					}
				}
				if (playerBootsX == -101 && playerBootsY == -101) {
					int zombieSeventeenChoice = (int) (Math.random() * 4);
				
					if (zombieSeventeenChoice == 0) {
						zombieSeventeenX = (zombieSeventeenX + 1) % colSizeOne;
					}
					else if (zombieSeventeenChoice == 1) {
						zombieSeventeenX = --zombieSeventeenX >= 0 ? zombieSeventeenX : (colSizeOne - 1);
					}
					else if (zombieSeventeenChoice == 2) {
						zombieSeventeenY = --zombieSeventeenY >= 0 ? zombieSeventeenY : (rowSizeOne - 1);
					}
					else if (zombieSeventeenChoice == 3) {
						zombieSeventeenY = (zombieSeventeenY + 1) % rowSizeOne;
					}
				}
				if (playerArmorX == -102 && playerArmorY == -102) {
					int zombieEighteenChoice = (int) (Math.random() * 4);
				
					if (zombieEighteenChoice == 0) {
						zombieEighteenX = (zombieEighteenX + 1) % colSizeOne;
					}
					else if (zombieEighteenChoice == 1) {
						zombieEighteenX = --zombieEighteenX >= 0 ? zombieEighteenX : (colSizeOne - 1);
					}
					else if (zombieEighteenChoice == 2) {
						zombieEighteenY = --zombieEighteenY >= 0 ? zombieEighteenY : (rowSizeOne - 1);
					}
					else if (zombieEighteenChoice == 3) {
						zombieEighteenY = (zombieEighteenY + 1) % rowSizeOne;
					}
				}
				if (keyX == -103 && keyY == -103) {
					int zombieNineteenChoice = (int) (Math.random() * 4);
				
					if (zombieNineteenChoice == 0) {
						zombieNineteenX = (zombieNineteenX + 1) % colSizeOne;
					}
					else if (zombieNineteenChoice == 1) {
						zombieNineteenX = --zombieNineteenX >= 0 ? zombieNineteenX : (colSizeOne - 1);
					}
					else if (zombieNineteenChoice == 2) {
						zombieNineteenY = --zombieNineteenY >= 0 ? zombieNineteenY : (rowSizeOne - 1);
					}
					else if (zombieNineteenChoice == 3) {
						zombieNineteenY = (zombieNineteenY + 1) % rowSizeOne;
					}
				}
				
										


			//Check Win Condition

			if (playerX == exitX && playerY == exitY &&
				playerWeaponX == -100 && playerWeaponY == -100 &&
				playerBootsX == -101 && playerBootsY == -101 &&
				playerArmorX == -102 && playerArmorY == -102 &&
				keyX == -103 && keyY == -103) {
				gameOver = true;
				System.out.println("You made it outside! Only you find yourself in a much bigger mess.");
				System.out.println("THE END... FOR NOW.");
				System.out.println("");
			}

						

						
			//"End Game" screen

			while (gameOver == true) {
				playerX = 0;
				playerY = 0;
				for (int y=0; y < rowSizeTwo; y++) {
					for (int x=0; x < colSizeTwo; x++) {
						if (x == playerX && y == playerY) {
							System.out.print(playerTile);
						}
						else if (x == zombieTwoX && y == zombieTwoY) {
							System.out.print(zombieTwoTile);
						}							
						else if (x == zombieThreeX && y == zombieThreeY) {
							System.out.print(zombieThreeTile);
						}
						else if (x == zombieFourX && y == zombieFourY) {
							System.out.print(zombieFourTile);
						}
						else if (x == zombieFiveX && y == zombieFiveY) {
							System.out.print(zombieFiveTile);
						}
						else if (x == zombieSixX && y == zombieSixY) {
							System.out.print(zombieSixTile);
						}
						else if (x == zombieSevenX && y == zombieSevenY) {
							System.out.print(zombieSevenTile);
						}
						else if (x == zombieEightX && y == zombieEightY) {
							System.out.print(zombieEightTile);
						}
						else if (x == zombieNineX && y == zombieNineY) {
							System.out.print(zombieNineTile);
						}
						else if (x == zombieTenX && y == zombieTenY) {
							System.out.print(zombieTenTile);
						}
						else if (x == zombieElevenX && y == zombieElevenY) {
							System.out.print(zombieElevenTile);
						}
						else if (x == zombieTwelveX && y == zombieTwelveY) {
							System.out.print(zombieTwelveTile);
						}
						else if (x == zombieThirteenX && y == zombieThirteenY) {
							System.out.print(zombieTwoTile);
						}
						else if (x == zombieFourteenX && y == zombieFourteenY) {
							System.out.print(zombieFourteenTile);
						}
						else if (x == zombieFifteenX && y == zombieFifteenY) {
							System.out.print(zombieFifteenTile);
						}
						else {
							System.out.print(floorTile);
						}
					}
					System.out.print("\n");
				} choice = input.nextLine();
			}



						
			//Check Lose Condition		

			if ((playerX == zombieOneX && playerY == zombieOneY) ||
				(playerX == zombieSixteenX && playerY == zombieSixteenY) ||
			    (playerX == zombieSeventeenX && playerY == zombieSeventeenY) ||
			    (playerX == zombieEighteenX && playerY == zombieEighteenY) ||
			    (playerX == zombieNineteenX && playerY == zombieNineteenY)) {
				gameOver = true;
				System.out.println("You've been caught. Your screams fill the air, and you take your last breath.");
				System.out.println("The zombie feasts until nothing remains.");
				System.out.println("");

				//Drawing "Game Over" screen to remove the player tile

				for (int y=0; y < rowSizeOne; y++) {
					for (int x=0; x < colSizeOne; x++) {
						playerTile = zombieOneTile;						
						if (x == playerX && y == playerY) {
							System.out.print(playerTile);
						}
						else if (x == zombieOneX && y == zombieOneY) {
							System.out.print(zombieOneTile);
						}
						else if (x == zombieSixteenX && y == zombieSixteenY) {
							System.out.print(zombieSixteenTile);
						}
						else if (x == zombieSeventeenX && y == zombieSeventeenY) {
							System.out.print(zombieSixteenTile);
						}
						else if (x == zombieEighteenX && y == zombieEighteenY) {
							System.out.print(zombieEighteenTile);
						}
						else if (x == zombieNineteenX && y == zombieNineteenY) {
							System.out.print(zombieNineteenTile);
						}
						else if (x == exitX && y == exitY) {
							System.out.print(exitTile);
						}
						else if (x == playerArmorX && y == playerArmorY) {
							System.out.print(playerArmorTile);
						}
						else if (x == keyX && y == keyY) {
							System.out.print(keyTile);
						}
						else if (x == playerWeaponX && y == playerWeaponY) {
							System.out.print(playerWeaponTile);
						}
						else if (x == playerBootsX && y == playerBootsY) {
							System.out.print(playerBootsTile);
						}
						else if (playerWeaponX == -100 && playerWeaponY == -100) {
							System.out.print(floorTile);
						}
						else if (playerBootsX == -101 && playerBootsY == -101) {
							System.out.print(floorTile);
						}
						else if (playerArmorX == -102 && playerArmorY == -102) {
							System.out.print(floorTile);
						}
						else if (keyX == -103 && keyY == -103) {
							System.out.print(floorTile);
						}
						else {
							System.out.print(floorTile);
						}
					}
					System.out.print("\n");
				}
			}
				
		}

		//End of game loop
	}

	//End of main method
}

//End of class