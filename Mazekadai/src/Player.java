import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener {
    private int[][] maze; // 迷路の配列
    private int tileSize; // タイルのサイズ

    public Player(double x, double y, double vx, double vy, int[][] maze, int tileSize) {
    	super(y * tileSize + 50, x * tileSize + 50, vx, vy);  // Playerの位置を50ずらして設定
        this.maze = maze;
        this.tileSize = tileSize;
    }

    @Override
    public void move() {
        // 新しい座標を計算
        double newX = x + vx;
        double newY = y + vy;

        // 新しい座標での迷路上の位置を計算
        
        int tileX = (int) ((newX - 50) / tileSize);  // x座標を50ずらして計算
        int tileY = (int) ((newY - 50) / tileSize);  // y座標を50ずらして計算
        // 壁かどうかのチェック
        if (isValidMove(tileX, tileY)) {
            // 移動を許可
            x = newX;
            y = newY;
            // ゴール判定
            if (newX  == (maze.length - 2) * 20 + 50 && y  == (maze.length - 2) * 20 + 50) {
                System.out.println("ゴール！");
                // ここに画面に「ゴール！」と表示する処理だが！！特にゴールした際の指定はなああああい！！！！！！！！！！
            }
        }
        // 壁の場合は何もしない
    }

    private boolean isValidMove(int tileX, int tileY) {
        // 範囲外の場合は壁とみなす
        if (tileX < 0 || tileX >= maze[0].length || tileY < 0 || tileY >= maze.length) {
            return false;
        }

        // 迷路の配列での位置が壁（1以上）であれば移動不可
        return maze[tileY][tileX] == 0;
    }

    @Override
    public void draw(MyFrame f) {
        // プレイヤーの描画
        f.setColor(0, 128, 0);
        f.fillRect((int) x, (int) y, 20, 20); // 20x20 のサイズで描画
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // 必要に応じて実装
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // キー入力に応じた速度調整
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            vx = -20; // 速度を適宜調整
            vy = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            vx = 20; // 速度を適宜調整
            vy = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            vy = -20; // 速度を適宜調整
            vx = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            vy = 20; // 速度を適宜調整
            vx = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			System.out.println("Spaceキーが押されました");
			GameWorld.enterPressed=true;
		}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // キーが離されたときの処理
        vx = 0;
        vy = 0;
    }
}

