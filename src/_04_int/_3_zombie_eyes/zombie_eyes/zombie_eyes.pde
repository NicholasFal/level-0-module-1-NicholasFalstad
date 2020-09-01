PImage zombie;

void setup() {
   size(500,500);
  zombie = loadImage("zombieeyes.png");
  zombie.resize(500,500);
}
void draw() {
image(zombie,0,0);
fill(mouseY, mouseX, mouseY);
ellipse(225,70,55,35);
fill(mouseX, mouseY, mouseY);
ellipse(305,70,60,60);
fill(0,0,0);
ellipse(225,70,10,10);
ellipse(305,70,12,12);


}
