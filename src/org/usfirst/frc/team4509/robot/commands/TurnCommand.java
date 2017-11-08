package org.usfirst.frc.team4509.robot.commands;

import org.usfirst.frc.team4509.robot.subsystems.DrivingSubsystem;
import org.usfirst.frc.team4509.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Stops and turns the robot to the given angle
 * Has a +/- 0.5 degree margin of error
 * 
 * @author Kyle Brott
 */
public class TurnCommand extends Command {
	
	private boolean isFinished;
	private double targetAngle;
	
	public TurnCommand(double angle) {
		requires(Robot.drivingSubsystem);
		requires(Robot.gyroSubsystem);
		this.isFinished = false;
		this.targetAngle = angle;
	}

	@Override
	protected void initialize() {
		Robot.drivingSubsystem.setSpeed(0);
	}

	@Override
	protected void execute() {
		double gyroDiff = this.targetAngle - Robot.gyroSubsystem.getAngle();
		
		while(Math.abs(gyroDiff) > 0.5) {
			while(gyroDiff < -0.5)
				Robot.drivingSubsystem.setSpeed((int)(-1 * DrivingSubsystem.BASE_SPEED * (gyroDiff / 90)),
				                                (int)(-1 * DrivingSubsystem.BASE_SPEED * (gyroDiff / 90)));
			while(gyroDiff > 0.5)
				Robot.drivingSubsystem.setSpeed((int)(DrivingSubsystem.BASE_SPEED * (gyroDiff / 90)),
				                                (int)(DrivingSubsystem.BASE_SPEED * (gyroDiff / 90)));
		}
		
		this.isFinished = true;
	}

	@Override
	protected boolean isFinished() {
		return isFinished;
	}

	@Override
	protected void end() {
		Robot.drivingSubsystem.setSpeed(0);
	}

	@Override
	protected void interrupted() {}

}
