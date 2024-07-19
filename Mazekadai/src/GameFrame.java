public class GameFrame extends MyFrame {

    private int[][] arrayOfIntTwoDimensionsFromMazeWorld;
    private int tileSize; // タイルのサイズ
    private Player player;
    private MazeWorld mazeWorld;
    private int initialPlayerX = 1; // プレイヤーの初期 x 座標
    private int initialPlayerY = 1; // プレイヤーの初期 y 座標
    private int initialPlayerSpeedX = 0; // プレイヤーの初期 x 軸速度
    private int initialPlayerSpeedY = 0; // プレイヤーの初期 y 軸速度

    public GameFrame() {
    	while(true) {
        // 迷路の生成と初期設定
        mazeWorld = new MazeWorld(initialPlayerX, initialPlayerY);
        arrayOfIntTwoDimensionsFromMazeWorld = mazeWorld.getArrayOfIntTwoDimensions();
        tileSize = 20; // タイルのサイズも取得
        initializeGame();
        
    	}
    }

    private void initializeGame() {
        // Player の初期設定
        player = new Player(initialPlayerX, initialPlayerY, initialPlayerSpeedX, initialPlayerSpeedY,
                            arrayOfIntTwoDimensionsFromMazeWorld, tileSize);
        addKeyListener(player);

        // ゲームループの開始
        runGameLoop();
    }

    private void runGameLoop() {
    	
    	GameWorld.enterPressed=false;
        while (true) {
            clear();
            mazeWorld.draw(this);
            player.draw(this);
            player.move();
            if(GameWorld.enterPressed) {
    			break;
    		}
            sleep(0.1);
        }
    }

}
