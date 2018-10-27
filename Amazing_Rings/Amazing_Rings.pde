int w = 200;
int h = 200;
int x1 = 50;
int x2 = 450;


void setup(){
  size(500,500);
  
  
  
  
  
  
}
void draw(){
  noFill();
  ellipse(x1,200,w,h);
  if (w!=0 || h != 0){
 w -= 10;
 h -= 10;
  }
  else{
   w = 200;
   h = 200;
   x1 +=5;
   background(255);
  }
  
  
    noFill();
  ellipse(x2,200,w,h);
  if (w!=0 || h != 0){
 w -= 10;
 h -= 10;
 
 
  }
  else{
   w = 200;
   h = 200;
   x2-=5;
  }
  





}