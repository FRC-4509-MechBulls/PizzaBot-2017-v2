package org.usfirst.frc.team4509.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4509.robot.Robot;

/**
 *	Drives the robot forward
 */
public class DriveCommand extends Command {
	
	private boolean isFinished;
	
	public DriveCommand() {
		requires(Robot.drivingSubsystem);
		this.isFinished = false;
	}

	@Override
	protected void initialize() {}

	@Override
	protected void execute() {
		Robot.drivingSubsystem.setSpeed();
	}

	@Override
	protected boolean isFinished() {
		return this.isFinished;
	}

	@Override
	protected void end() {
		Robot.drivingSubsystem.setSpeed(0);
	}

	@Override
	protected void interrupted() {
		this.isFinished = true;
	}
}
