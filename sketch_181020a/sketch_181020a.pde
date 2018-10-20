int x = 200;
int y = 200;


void setup(){
  size(500,500);
  
  
  
  
  
  
}
void draw(){
  noFill();
  ellipse(200,200,x,y);
  if (x!=0 || y != 0){
 x -= 10;
 y -= 10;
  }
  
    noFill();
  ellipse(250,250,x,y);
  if (x!=0 || y != 0){
 x -= 10;
 y -= 10;
  }
  }