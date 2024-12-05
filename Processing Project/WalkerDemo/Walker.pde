class Walker {
    int x, y; //Position Variables
    int size;
    int speed;
    int cr, cg, cb; //colours
    boolean npc; //is this a computer

    //Constructor
    Walker(int tempx, int tempy, boolean tempnpc) {
        x = tempx;
        y = tempy;
        size = 25;
        speed = 25;
        npc = tempnpc;
        cr = (int) random (0, 255);
        cg = (int) random (0, 255);
        cb = (int) random (0, 255);

    }

    void display() {
        fill(cr, cg, cb);
        //rect(xpos, ypos, width, height)
        rect(x, y, size, size); 
    }

    // dir var --> 0 = up, 1 = right, 2 = down, 3 = left
    void move(int dir) {
        //computer movement
        if(npc){
            dir = (int)random(0, 3);
        }

        if (dir == 0 && y > 0){
            y = y - speed;
        }
        else if (dir == 1 && x < width){
            x = x + speed;
        }
        else if (dir == 2 && y < height){
            y = y + speed;
        }
        else if (dir == 3 && x > 0){
            x = x - speed;
        }
        
        
    }

}