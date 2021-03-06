package org.usfirst.frc.team1339.robot.commands;

import java.util.Arrays;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoGear extends CommandBase{
	
	public AutoGear(){
		requires(chassis);
	}
	
	protected void initialize(){
		vision.start();
		chassis.visionTurnPID.setSetpoint(160);
		chassis.visionThrottlePID.setSetpoint(50);
	}
	
	public void execute(){
		int[] centerX = vision.getCenterX();
		int[] heights = vision.getArea();
		SmartDashboard.putString("CENTERX", Arrays.toString(centerX));
		SmartDashboard.putString("heights", Arrays.toString(heights));
		chassis.autoGear(centerX, heights);
	}
	
	public boolean isFinished(){
		return chassis.visionThrottlePID.onTarget(5);
	}
	
	protected void end(){
		vision.stop();
	}
	
	protected void interrupted(){
		vision.stop();
	}
}
