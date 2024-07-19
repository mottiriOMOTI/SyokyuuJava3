import java.util.Random;

public class MazeWorld {
    int i, j;
    int[][] arrayOfIntTwoDimensions = new int[15][15];

    public MazeWorld(int i, int j) {
        this.i = i;
        this.j = j;
        // ～～～～～迷路の基礎を作るやつ～～～～～
        boolean FragI = true, FragJ = true;
        for (i = 0; i < arrayOfIntTwoDimensions.length; i++) {
            FragJ = false; // フラッグ初期化
            for (j = 0; j < arrayOfIntTwoDimensions[i].length; j++) {
                if (i == 0 || j == 0 || i == arrayOfIntTwoDimensions.length - 1
                        || j == arrayOfIntTwoDimensions.length - 1) // 壁沿いなら
                {
                    arrayOfIntTwoDimensions[i][j] = 1; // 外側の壁
                } else if (FragJ == true && FragI == true) {
                    arrayOfIntTwoDimensions[i][j] = 1;
                    FragJ = false;
                } else {
                    arrayOfIntTwoDimensions[i][j] = 0;
                    FragJ = true;
                }
                System.out.print(arrayOfIntTwoDimensions[i][j]);
            }
            System.out.println();

            if (FragI == true) {
                FragI = false;
            } else {
                FragI = true;
            }

        } // ～～～～～迷路基礎ここまで～～～～～

        // ～～～～～棒倒し～～～～～
        System.out.println();
        boolean Flag;
        int data[] = new int[2];
        for (i = 2; i + 2 < arrayOfIntTwoDimensions.length; i += 2) {
            for (j = 2; j + 2 < arrayOfIntTwoDimensions[i].length + 1; j += 2) {
                if (i == 2) { // 一行目上倒しアリ
                    arrayOfIntTwoDimensions[i][j] = 3;
                    Flag = true;
                    while (true) {
                        data = StickRamdum(i, j);
                        if (arrayOfIntTwoDimensions[data[0]][data[1]] == 0) {
                            arrayOfIntTwoDimensions[data[0]][data[1]] = 4;
                            break;
                        }
                    }

                } else {// 上倒しナシ
                    arrayOfIntTwoDimensions[i][j] = 5;
                    Flag = false;
                    while (true) {
                        data = StickRamdum(i, j);
                        if (arrayOfIntTwoDimensions[data[0]][data[1]] == 0) {
                            arrayOfIntTwoDimensions[data[0]][data[1]] = 8;
                            break;
                        }
                    }
                }
            }
        }
        // 配列確認用＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        for (i = 0; i < arrayOfIntTwoDimensions.length; i++) {
            for (j = 0; j < arrayOfIntTwoDimensions[i].length; j++) {
                System.out.print(arrayOfIntTwoDimensions[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getArrayOfIntTwoDimensions() {
        return arrayOfIntTwoDimensions;
    }

    public int[] StickRamdum(int i, int j) {
        Random random = new Random();
        int randomValue;
        if (i == 2) {
            randomValue = random.nextInt(4);
        } else {
            randomValue = random.nextInt(3);
        }
        int data[] = new int[2];
        switch (randomValue) {
        case 0: // →
            data[0] = i;
            data[1] = j + 1;
            break;
        case 1: // ←
            data[0] = i;
            data[1] = j - 1;
            break;
        case 2:
            data[0] = i + 1;
            data[1] = j;
            break;
        case 3:
            data[0] = i - 1;
            data[1] = j;
            break;
        }
        return data;
    }

    public void draw(MyFrame f) {
        // 配列確認用＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        for (i = 0; i < arrayOfIntTwoDimensions.length; i++) {
            for (j = 0; j < arrayOfIntTwoDimensions[i].length; j++) {
                if (arrayOfIntTwoDimensions[i][j] != 0) {
                    f.setColor(0, 0, 0);
                    f.fillRect(j * 20 + 50, i * 20 + 50, 20, 20); // j を x 座標、i を y 座標として描画
                }
            }
        }
        f.setColor(0, 0, 128);
        f.fillRect(1 * 20 + 50, 1 * 20 + 50, 20, 20); // Startの初期位置を修正
        f.setColor(128, 0, 0);
        f.fillRect((arrayOfIntTwoDimensions.length - 2) * 20 + 50, (arrayOfIntTwoDimensions.length - 2) * 20 + 50, 20,20);
    }
}
