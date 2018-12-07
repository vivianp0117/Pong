// Create the game Pong
// ball controlled by path need if statement if u bounce off the wall or panel 
// Mouse Listener  -- Right Panel 
// Key Listenr -- Left Panel

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pong implements ActionListener, KeyListener, MouseMotionListener{
	
	//	Properties
	JFrame frame;
	PongPanel panel;
	Timer timer;
	
	//	Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == timer){
			panel.repaint();
		}	
	}
	
	//	KeyListener Methods

	public void keyReleased(KeyEvent kevt){
		
		if(kevt.getKeyCode() == 38){
			panel.blnUp = false;
		}else if(kevt.getKeyCode() == 40){
			panel.blnDown = false;
		}
			
	}
	
	public void keyPressed(KeyEvent kevt){
		if(kevt.getKeyCode() == 38){
			panel.blnUp = true;
		}else if(kevt.getKeyCode() == 40){
			panel.blnDown = true;
		}
	}
	
	public void keyTyped(KeyEvent kevt){
	}
	
	//	MouseMotion Listener
	
	//	Overriden method for Mouse Listener
		public void mouseMoved(MouseEvent mevt){
			panel.intRect2Y = mevt.getY();
		}
		public void mouseDragged(MouseEvent mevt){
		
		
		}
	
	
	//	Constructor
	public Pong(){
	
		frame = new JFrame ("Pong");
		panel = new PongPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension (600,400));
		panel.addMouseMotionListener(this);
	
	//	frame
		frame.addKeyListener(this);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	
	//	Timer
		timer = new Timer(1000/60,this);
		timer.start();
	
	
	}
	
	//	Main Method
	public static void main (String[] args){
		new Pong();
	}



}
