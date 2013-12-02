We have created a Frogger-esque tile-based movement-oriented game. The art style is a bit Zelda-ish with a fantasty theme of sorts. The object is, quite simply, to make it to the goal while avoiding death, which occurs by falling off the stage and getting hit by projectiles/enemies. The camera does not cover the whole stage at once, so it is instead be divided into sections that will be loaded as needed (for example, section B is above section A. As the character reaches the upper edge of section A, section B will loaded and the player will be placed on the tile of section B directly above the tile in section A that was just left). The size of these chunks are procedurally generated according to the size of the device. Tiles are stored as part of a logic array of sorts. When moving off an edge or onto an unstable or moving object, the player will leap upon moving rather than walk. A double jump functionality exists where if the player leaps and, upon finishing the leaping motion, has another directional key depressed, the player will perform a second leap in the direction specified.



        ***********************************DEVELOPERS ONLY***********************************
	Stage Creation Guide:
	
	- Create Stage# class
		- private static Map map = new Map(<ASCII map>);
		- private static Location startLoc = <start location>;
		- public Stage#()
			- super(map, startLoc);
			- <add enemies>
				- new <enemy type>(tileSize, this, <enemy-specific parameters>);
		- public Stage reset(float tileSize)
			- return new Stage#(tileSize);

	- Add TileTravelerScreen method
		- public void stage#Clicked()
			- currentStage = new Stage#(tileSize);
			- reset();

	- Modify the menu (res, menu, tile_traveler_screen.xml)
		- Stages > Sub-Menu, click last stage, add, Item, click item
			- Title, click String, New String
				- String: Stage #
				- New R.string: stage#
			- Id: @+id/stage#

