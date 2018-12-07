import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class PongPanel extends JPanel{
	//Properties
	int intBallX = 280;
	int intBallY = 180;
	
	boolean blnBallR = true;
	boolean blnBallL = true;
	boolean blnBallUp = true;
	boolean blnBallDown = true;
	
	//Padel One
	int intRect1X = 0;
	int intRect1Y = 150;
	
	boolean blnDown = false;
	boolean blnUp= false;
	boolean blnLeft = false;
	boolean blnRight = false;
	
	//Padel Two
	int intRect2X = 575;
	int intRect2Y = 150;
	
	
	//Methods
	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0,0,600,400);
		g.setColor(Color.YELLOW);
		g.fillOval(intBallX,intBallY,20,20);
		
		g.setColor(Color.RED);
		
		//Rect one
		g.fillRect(intRect1X,intRect1Y,25,90);
		
		//Rect 1
		if (blnDown){
			intRect1Y = intRect1Y + 5 ;
		}else if (blnUp){
			intRect1Y = intRect1Y - 5 ;
		}
		
		if(intRect1Y < 0){
			intRect1Y = 0;
		}else if(intRect1Y > 310){
			intRect1Y = 310;
		}
		
		
		//Rect two
		g.fillRect(intRect2X,intRect2Y,25,90);
		
		// RECT 2
		
		if(intRect2X > 575){
			intRect2X = 575;
		}else if(intRect2Y < 0){
			intRect2Y = 0;
		}else if(intRect2Y > 310){
			intRect2Y = 310;
		}
		
		
		// Ball	moving Left and Right
		
		if (intBallX > (intRect2X)){
			blnBallR = false;
			blnBallL = true;
		}else if(intBallX < (intRect1X)){
			blnBallL = false;
			blnBallR = true;
		}
		
		if(blnBallR){
			intBallX = intBallX + 5;
		}else if(blnBallL){
			intBallX = intBallX - 5;
		}
		
		//Ball moving Up and Down
		if(intBallY > 380){
			blnBallUp = true;
			blnBallDown = false;
		}else if (intBallY < 0){
			blnBallUp = false;
			blnBallDown = true;
		}
		
		if(blnBallUp){
			intBallY = intBallY - 5;
		}else if(blnBallDown){
			intBallY = intBallY + 5;
		}
		
	}
	
	
	//Constructor
	public PongPanel(){
		
		
	}





}
