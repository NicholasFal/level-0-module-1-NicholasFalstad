PImage zombie;
void setup() {
   size(500,500);
  zombie = loadImage("zombieeyes.png");
  zombie.resize(500,500);
}
void draw() {
image(zombie,0,0);
fill(100,10,30);
ellipse(225,70,55,35);
fill(10,250,13);
ellipse(305,70,60,60);
}
