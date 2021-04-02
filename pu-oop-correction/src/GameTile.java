import java.awt.*;

public class GameTile {

    private int row;
    private int col;
    private int tileSize;

    public GameTile(int row, int col) {

        this.row        = row;
        this.col        = col;
        this.tileSize   = 100;
    }

//    public void render(Graphics g) {
//
//        int tileX = this.col * this.tileSize;
//        int tileY = this.row * this.tileSize;
//
//        if(this.row % 2 == 0) {
//            g.setColor(Color.BLUE);
//        }
//        else {
//            g.setColor(Color.WHITE);
//        }
//
//        g.fillRect(tileX,tileY,this.tileSize, this.tileSize);
//    }
    public void render(Graphics g, int x, int y) {
        g.setColor(new Color(90, 86, 86));
        g.drawRect(x, y, 80, 80);
        g.fillRect(x + 2,y + 2,78,78);
    }
}