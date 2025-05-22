let player = 0; //keeps track of which player's turn it is
let theGame; //stores game state and plater data
let gameOver = false; //track if the game is over

const turnDisplay = document.getElementById("turn");
const scoreCounter = document.getElementById("scoreCounter");
const rulesDiv = document.getElementById("rulesDiv");
const diceImage = document.getElementById("diceImage");

const buttonStart = document.getElementById("start");
const buttonRoll = document.getElementById("roll");
const buttonStand = document.getElementById("stand");

//Start or end game
buttonStart.addEventListener("click", () => {
  if (buttonStart.textContent === "Start Game") {
    setup();
  } else {
    endGame();
  }
});

buttonRoll.addEventListener("click", rollDie);
buttonStand.addEventListener("click", stand);

function Game(player1, player2) {
  this.players = [player1, player2];
  this.scores = [0, 0];

  this.getScore = () => `${this.scores[0]} - ${this.scores[1]}`;
  this.currentPlayer = () => `Current Player: ${this.players[player]}`;
}

// sets up a new game when the button "Start Game" is clicked
function setup() {
  const p1name = document.getElementById("p1").value.trim();
  const p2name = document.getElementById("p2").value.trim();

  if (!p1name || !p2name) {
    alert("Please enter both players' names.");
    return;
  }

  theGame = new Game(p1name, p2name);
  player = 0;
  gameOver = false;

  updateUIForNewTurn(); //show the current player and score

  //Hide rules, show dice and game controls
  rulesDiv.style.display = "none";
  diceImage.style.display = "inline";
  diceImage.src = "rdice.png"; // show the image after player click on start but before rolling the dice

  //Enable and show roll and stand buttons
  buttonRoll.className = "on";
  buttonStand.className = "on";
  buttonRoll.disabled = false;
  buttonStand.disabled = false;

  buttonStart.textContent = "End Game"; //Change start to the end game button

  scoreCounter.className = "on";
  turnDisplay.className = "on";
}

function rollDie() {
  if (gameOver) return;

  const die = Math.floor(Math.random() * 6) + 1;
  diceImage.src = `dice_images/${die}.png`; //update die images based on roll

  theGame.scores[player] += die;

  updateUIForNewTurn();

  // if score > 21
  if (theGame.scores[player] > 21) {
    turnDisplay.textContent = `${theGame.players[player]} busted!`;
    gameOver = true;
    disableGameButtons();
  }
}

// check if player hits exactly 21
function stand() {
  if (gameOver) return;

  if (theGame.scores[player] === 21) {
    turnDisplay.textContent = `${theGame.players[player]} reached 21! You win!`;
    gameOver = true;
    disableGameButtons();
    return;
  }

  //switch to the other player
  player = (player + 1) % 2;
  updateUIForNewTurn();
}

// ends current game and reset U1
function endGame() {
  player = 0;
  gameOver = false;
  theGame = null;

  turnDisplay.textContent = "";
  scoreCounter.textContent = "";
  diceImage.style.display = "none";
  rulesDiv.style.display = "block";

  buttonRoll.className = "off";
  buttonStand.className = "off";
  buttonRoll.disabled = true;
  buttonStand.disabled = true;

  buttonStart.textContent = "Start Game";
}

function updateUIForNewTurn() {
  turnDisplay.textContent = theGame.currentPlayer();
  scoreCounter.textContent = `Score: ${theGame.getScore()}`;
}

//disable the roll and stand buttons
function disableGameButtons() {
  buttonRoll.disabled = true;
  buttonStand.disabled = true;
}
