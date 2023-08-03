# Gebuk Tikus Game


The Whack-a-Mole game is a classic arcade game where the player's objective is to hit as many moles as possible as they pop up from holes. This game is implemented using the LibGDX game development framework.

## Game Overview

The game consists of a 3x3 grid of holes from which moles randomly pop up. The player can tap or click on the moles to "whack" them, earning points for each successful hit. The game keeps track of the player's score and displays it at the top right corner of the screen.

## Game Mechanics

### Mole Class

The `Mole` class represents an individual mole character within the game. It manages the mole's movement, appearance, and interactions with the player. The class contains the following attributes and methods:

#### Attributes

- `moleSprite`: A sprite representing the mole's appearance to be displayed on the screen.
- `position`: A 2D vector representing the mole's position on the screen.
- `height` and `width`: The dimensions of the mole character.
- `scaleFactor`: A scaling factor used to adjust the size of the mole sprite.
- `state`: An enum representing the current state of the mole, including GOINGUP, GOINGDOWN, UNDERGROUND, and SNED (stunned).
- `currentHeight`: The current height of the mole, used for animating its movement.
- `speed`: The speed at which the mole moves up and down.
- `timeUnderGround`: The time the mole spends underground during its cycle.
- `maxTimeUnderGround`: The maximum time the mole stays underground before coming up again.
- `stunTime`: The duration of the stun effect when the mole is hit.
- `stunCounter`: A counter to keep track of the stun duration.
- `stunSprite`: A sprite representing the stunned appearance of the mole.

#### Methods

- `update()`: Updates the mole's state and appearance based on its current position and animation.
- `render(SpriteBatch batch)`: Renders the mole and its stun sprite on the screen.
- `randomizeWaitTime()`: Randomizes the maximum time the mole stays underground before going up again.
- `handleTouch(float touchX, float touchY)`: Handles touch input to interact with the mole. If the player touches the mole, it gets stunned, and the hit sound is played.

### GameManager Class

The `GameManager` class manages the overall game logic and handles game initialization, rendering, and disposal. It contains the following attributes and methods:

#### Attributes

- `moles`: An array of `Mole` instances representing the moles in the game.
- `moleTexture`: The texture image for the mole character.
- `backgroundTexture`: The texture image for the game background.
- `backgroundSprite`: A sprite for the background.
- `holeTexture`: The texture image for the holes in the game.
- `holeSprites`: An array of sprites representing the holes in the game.
- `stunTexture`: The texture image for the stunned appearance of the mole.
- `score`: An integer representing the player's score in the game.
- `hitSound`: A sound played when a mole is hit.

#### Methods

- `initialize(float width, float height)`: Initializes the game, creating mole instances, loading textures, and setting up the game elements.
- `renderGame(SpriteBatch batch)`: Renders the game elements, including the background, holes, and moles.
- `dispose()`: Disposes of any resources used by the game.

### InputManager Class

The `InputManager` class handles touch input and manages interactions with the game. It contains the following method:

- `handleInput(OrthographicCamera camera)`: Handles touch input on the screen. When the player taps on a mole, the game checks if the mole is in a vulnerable state and increments the player's score accordingly.

### TextManager Class

The `TextManager` class manages text display on the screen, including the player's score. It contains the following method:

- `displayMessage(SpriteBatch batch)`: Displays the player's score at the top right corner of the screen using a bitmap font.

## Usage

To use the Whack-a-Mole game in your LibGDX project, follow these steps:

1. Set up the LibGDX framework and create a new project.

2. Copy the `Mole`, `GameManager`, `InputManager`, and `TextManager` classes into your project's corresponding packages.

3. Load the required assets, such as mole and background textures, and sound files.

4. In your main game class, initialize the game using the `GameManager.initialize()` method, passing the screen's width and height as parameters.

5. In your main game's `render()` method, call the `GameManager.renderGame(batch)` method to render the game elements.

6. In your main game's `dispose()` method, call the `GameManager.dispose()` method to clean up resources.

7. Handle touch input by calling the `InputManager.handleInput(camera)` method in your main game's `touchDown()` or `touchUp()` method.

Remember to customize the game elements, suc has mole speed, mole appearance, background, and hole placement, according to your game's requirements.

License
The Whack-a-Mole game and its source code are provided under the MIT License. You are free to modify and use the code in your projects, including commercial projects.

Credits
The Whack-a-Mole game and its code were created by Your Name. If you find this game helpful, consider giving credit or starring the project repository on GitHub.

Resources
LibGDX Official Website
Mole and Hole Texture Images
Background Texture Image
Stun Texture Image
Sound Effect
Enjoy creating your Whack-a-Mole game! Happy coding
