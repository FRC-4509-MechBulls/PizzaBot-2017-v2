package org.usfirst.frc.team4509.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4509.robot.Robot;

/**
 *	Drives the robot forward until interrupted
 *
 *	@author Kyle Brott
 */
public class ClimbCommand extends Command {
	
	private boolean isFinished;
	
	public ClimbCommand() {
		requires(Robot.climbingSubsystem);
		this.isFinished = false;
	}

	@Override
	protected void initialize() {}

	@Override
	protected void execute() {
		Robot.climbingSubsystem.setSpeed(4);
	}

	@Override
	protected boolean isFinished() {
		return this.isFinished;
	}

	@Override
	protected void end() {
		Robot.climbingSubsystem.setSpeed(0);
	}

	@Override
	protected void interrupted() {
		this.isFinished = true;
	}
}
