
import monsters.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener, ActionListener {
        JButton dogEatingBug, drunkenKnight, magicCat, recklessCanibal, sandTurtle, sofisticatedSam;
        int x;
        int y;
        private GameTile gameboard[][];
        private Monster figureGrid[][];
        public GameBoard() {
            gameboard = new GameTile[12][12];
            figureGrid = new Monster[12][12];

            addButtonsChoicesForFigures();
            this.setLayout(null);
            this.addMouseListener(this);


            this.setSize(1120, 990);
            this.setVisible(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        }


        public void paint(Graphics g) {

            super.paint(g);

            for(int row = 0; row < 12; row++) {
                for(int col = 0; col < 12; col++) {

                  gameboard[row][col] = new GameTile(row,col);
                  gameboard[row][col].render(g,col*80,row*80+30);

                 if(figureGrid[row][col] != null){
                     figureGrid[row][col].render(g,x,y);
                 }

                }
            }
        }
    private GameTile getGameTile(int row, int col){
        return this.gameboard[row][col];
    }

    private boolean hasGameTile(int row, int col){
        return getGameTile(row, col) != null;
    }

    private void renderGameTile(Graphics g, int row, int col){
        if(hasGameTile(row, col)){
            GameTile tile = this.getGameTile(row, col);
            tile.render(g,row,col);
        }
    }
    private void addButtonsChoicesForFigures(){
        dogEatingBug = new JButton("DogEatingBug");
        drunkenKnight = new JButton("DrunkenKnight");
        magicCat = new JButton("MagicCat");
        recklessCanibal = new JButton("RecklessCanibal");
        sandTurtle = new JButton("SandTurtle");
        sofisticatedSam = new JButton("SofisticatedSam");

        this.add(dogEatingBug);
        this.add(drunkenKnight);
        this.add(magicCat);
        this.add(recklessCanibal);
        this.add(sandTurtle);
        this.add(sofisticatedSam);

        dogEatingBug.setBounds          (970, 120, 140, 40);
        drunkenKnight.setBounds         (970, 170, 140, 40);
        magicCat.setBounds              (970, 220, 140, 40);
        recklessCanibal.setBounds       (970, 270, 140, 40);
        sandTurtle.setBounds            (970, 320, 140, 40);
        sofisticatedSam.setBounds       (970, 370, 140, 40);

        dogEatingBug.addActionListener(this);
        drunkenKnight.addActionListener(this);
        magicCat.addActionListener(this);
        recklessCanibal.addActionListener(this);
        sandTurtle.addActionListener(this);
        sofisticatedSam.addActionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        x = e.getX()/80;
        y = (e.getY() - 30)/80;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == dogEatingBug){
            DogEatingBugPlacer();
            repaint();
        }
        if(e.getSource() == drunkenKnight){
            DrunkenKnight();
            repaint();
        }
        if(e.getSource() == magicCat){
            MagicCat();
            repaint();
        }
        if(e.getSource() == recklessCanibal){
            RecklessCanibal();
            repaint();
        }
        if(e.getSource() == sandTurtle){
            SandTurtle();
            repaint();
        }
        if(e.getSource() == sofisticatedSam){
            SofisticatedSam();
            repaint();
        }
    }
    private void DogEatingBugPlacer(){
        if(figureGrid[x][y] == null){
            figureGrid[x][y] = new DogEatingBug();
        }
    }
    private void DrunkenKnight(){
        if(figureGrid[x][y] == null){
            figureGrid[x][y] = new DrunkenKnight();
        }
    }
    private void MagicCat(){
        if(figureGrid[x][y] == null){
            figureGrid[x][y] = new MagicCat();
        }
    }
    private void RecklessCanibal(){
        if(figureGrid[x][y] == null){
            figureGrid[x][y] = new RecklessCanibal();
        }
    }
    private void SandTurtle(){
        if(figureGrid[x][y] == null){
            figureGrid[x][y] = new SandTurtle();
        }
    }
    private void SofisticatedSam(){
        if(figureGrid[x][y] == null){
            figureGrid[x][y] = new SofisticatedSam();
        }
    }
}
