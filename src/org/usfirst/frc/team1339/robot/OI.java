package org.usfirst.frc.team1339.robot;

import org.usfirst.frc.team1339.robot.commands.*;
import org.usfirst.frc.team1339.robot.commands.groups.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private Joystick xboxStick = new Joystick(RobotMap.xboxPort);
	private Joystick operatorStick = new Joystick(RobotMap.operatorPort);
	
	
	//Joystick Buttons
	private JoystickButton aButton = new JoystickButton(xboxStick, RobotMap.xboxAButton);
	private JoystickButton bButton = new JoystickButton(xboxStick, RobotMap.xboxBButton);
	private JoystickButton xButton = new JoystickButton(xboxStick, RobotMap.xboxXButton);
	private JoystickButton yButton = new JoystickButton(xboxStick, RobotMap.xboxYButton);
	private JoystickButton rightBumper = new JoystickButton(xboxStick, RobotMap.xboxRightBumper);
	private JoystickButton leftBumper = new JoystickButton(xboxStick, RobotMap.xboxLeftBumper);
	private JoystickButton viewButton = new JoystickButton(xboxStick, RobotMap.xboxViewButton);
	private JoystickButton menuButton = new JoystickButton(xboxStick, RobotMap.xboxMenuButton);
	private JoystickButton rightStickButton = new JoystickButton(xboxStick, RobotMap.xboxRightStickButton);
	private JoystickButton leftStickButton = new JoystickButton(xboxStick, RobotMap.xboxLeftStickButton);
	
	private JoystickButton oneButton = new JoystickButton(operatorStick, RobotMap.operatorOneButton);
	private JoystickButton twoButton = new JoystickButton(operatorStick, RobotMap.operatorTwoButton);
	private JoystickButton threeButton = new JoystickButton(operatorStick, RobotMap.operatorThreeButton);
	private JoystickButton fourButton = new JoystickButton(operatorStick, RobotMap.operatorFourButton);
	private JoystickButton fiveButton = new JoystickButton(operatorStick, RobotMap.operatorFiveButton);
	private JoystickButton sixButton = new JoystickButton(operatorStick, RobotMap.operatorSixButton);
	private JoystickButton sevenButton = new JoystickButton(operatorStick, RobotMap.operatorSevenButton);
	
	
	public OI(){
		//Xbox Buttons
		aButton.whenPressed(new ShiftLow());
		yButton.whenPressed(new ShiftHigh());
		xButton.whenPressed(new AutoDelivery());
		bButton.whileHeld(new RunVisionThrottle());
		rightBumper.whileHeld(new PixyVision());
		leftBumper.whenPressed(new UltraGear(12));
		
		//Operator Buttons
		twoButton.whenPressed(new AutoClimb(0.7, 35));
		threeButton.whenPressed(new GearRampUp());
		fiveButton.whenPressed(new GearRampDown());
		fourButton.whenPressed(new GearHolderUp());
		sixButton.whenPressed(new GearHolderDown());
		oneButton.whenPressed(new PancakeOut());
		sevenButton.whenPressed(new PancakeIn());
	}
	
	public Joystick getMadCatzStick(){
		return operatorStick;
	}
	public Joystick getXboxStick(){
		return xboxStick;
	}
	public JoystickButton getAButton(){
		return aButton;
	}
	public JoystickButton getBButton(){
		return bButton;
	}
	public JoystickButton getXButton(){
		return xButton;
	}
	public JoystickButton getYButton(){
		return yButton;
	}
	public JoystickButton getLeftBumper(){
		return leftBumper;
	}
	public JoystickButton getRightBumper(){
		return rightBumper;
	}
	public JoystickButton getLeftStickButton(){
		return leftStickButton;
	}
	public JoystickButton getRightStickButton(){
		return rightStickButton;
	}
	public JoystickButton getviewButton(){
		return viewButton;
	}
	public JoystickButton getMenuButton(){
		return menuButton;
	}
	public JoystickButton getTwoButton(){
		return twoButton;
	}
}
