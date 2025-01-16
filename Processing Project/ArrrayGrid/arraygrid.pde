grid g;

void setup(){
  size(900, 514);

    g = new grid(9, 5);
}

void draw(){
    background(220);
    g.displayGrid();
}

void mousePressed(){
    g.click(mouseX, mouseY);
}




class grid {
    int ROWS, COLS;
    
    boolean[][] gridarray;
    // constructor
    grid(int tempr, int tempc){
        ROWS = tempr;
        COLS = tempc;
        gridarray = new boolean[ROWS][COLS];
        for (int y = 0; y < ROWS; y++){
            for (int x = 0; x < COLS; x++ ){
                gridarray[y][x] = false;
            }
        }
    }
    
    
    void displayGrid(){
      int xcor = 220;
      int ycor = 70;
      for (int y = 0; y < ROWS; y++){
        for (int x = 0; x < COLS; x++ ){
              if (gridarray[y][x] == false){
              fill(255);
              }
              else{
              fill(0);
              }
  
           rect(xcor, ycor, 70, 85);
           ycor = ycor + 85;
        }
           xcor = xcor + 70;
           ycor = 70;
      }
    }

    void click(int mx, int my){
        if (mx > 220 && mx < 850 && my > 70 && my < 495){ 
        int x = (mx - 220) / 70;
        int y = (my - 70) / 85;

        if (gridarray[x][y]== false){
            gridarray[x][y] = true;
        }
        else{
            gridarray[x][y] = false;
        }
        }
    }
  
  
}


/*
class grid {
    int ROWS, COLS;
    boolean[][] gridarray;
    // constructor
    grid(int tempr, int tempc){
        ROWS = tempr;
        COLS = tempc;
        gridarray = new boolean[ROWS][COLS];
        clear();
        five();
        for (int y = 0; y < ROWS; y++){
            for (int x = 0; x < COLS; x++ ){
                gridarray[y][x] = false;
            }
        }
    }
    
    
    void displayGrid(){
      for (int y = 0; y < ROWS; y++){
        for (int x = 0; x < COLS; x++ ){
              if (gridarray[y][x] == false){
              fill(255);
              }
              else{
              fill(0);
              }
              int cellWidth = width / COLS;
              int cellHeight = height / ROWS;
  
              rect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
        }
      }
    }

    void click(int mx, int my){
        int cellWidth = width / COLS;
        int cellHeight = height / ROWS;

        int x = mx / cellWidth;
        int y = my / cellHeight;

        if (gridarray[y][x]== false){
            gridarray[y][x] = true;
        }
        else{
            gridarray[y][x] = false;
        }

    }
    
    void clear(){
      for (int y = 0; y < ROWS; y++){
        for (int x = 0; x < COLS; x++ ){
            gridarray[y][x] = false;
        }
      }
    }
    
    void five(){
      for (int y = 0; y < ROWS; y++){
        for (int x = 0; x < COLS; x++ ){
          if (y==5 || x==5){
             gridarray[y][x] = true;

          }
        }
      }
    }
}
*/
