
public class MovableCircle implements Movable { 
  private MovablePoint center;
  private int radius;
  
  // TASK: Add the constructor here
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
    this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    this.radius = radius;

  }
  
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }
  @Override
  public void moveDown() {
	 center.moveDown();// move the center up
  }
  @Override
  public void moveLeft() {
	 center.moveLeft();// move the center up
  }
  @Override
  public void moveRight() {
	 center.moveRight();// move the center up
  }
  @Override
	public String toString(){
		return String.format("MovablePoint[x= %d,y= %d,xSpeed= %d,ySpeed= %d, radius= %d ]",center.x,center.y,center.xSpeed,center.ySpeed,radius);
	}

}
