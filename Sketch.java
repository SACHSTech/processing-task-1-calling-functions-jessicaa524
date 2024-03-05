import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(205, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(124, 207, 17);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    strokeWeight(10);
    stroke(47, 133, 24);
    line(100, 100, 100, 300);

    ellipse(95, 200, 10, 10);
    ellipse(105, 225, 10, 10);
    ellipse(95, 250, 10, 10);
    
    strokeWeight (8);
    stroke(133, 24, 24);

    fill(214, 32, 26);
    ellipse(50, 50, 100, 100);
    ellipse(150, 50, 100, 100);
    ellipse(50, 150, 100, 100);
    ellipse(150, 150, 100, 100);

    fill(235, 245, 44);
    ellipse(100, 100, 100, 100);

    strokeWeight(4);
    stroke(69, 60, 30);
    fill(84, 80, 50);
    rect(50, 260, 100, 100);

  }
  
  // define other methods down here.
}