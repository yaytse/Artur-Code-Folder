//Keyboard input for movement

Walker william, eman, holden, kenji, richmond;


void setup(){
    size(1500, 700);

    william = new Walker(width/2, height/2, false);
    eman = new Walker(width/2+30, height/2-70, false);
    holden = new Walker((int)random(0, width), (int)random(0, height), true);
    kenji = new Walker((int)random(0, width), (int)random(0, height), true);
    richmond = new Walker((int)random(0, width), (int)random(0, height), true);

}

void draw(){
    background(255);
    william.display();
    eman.display();
    holden.display();
    holden.move(0);
    kenji.display();
    kenji.move(0);
    richmond.display();
    richmond.move(0);
}

void mousePressed(){

}

void keyPressed(){
    //For arrows, use, 'Keycode' and UP, DOWN, ENTER, etc...
    //For ACDII char's, use, 'key' and 'a', 'w', etc...

    if (key == 'w'){
        william.move(0);
    }
    else if (key == 'd'){
        william.move(1);
    }
    else if (key == 's'){
        william.move(2);
    }
    else if (key == 'a'){
        william.move(3);
    }


   if (keyCode == UP){
        eman.move(0);
    }
    else if (keyCode == RIGHT){
        eman.move(1);
    }
    else if (keyCode == DOWN){
        eman.move(2);
    }
    else if (keyCode == LEFT){
        eman.move(3);
    }
}