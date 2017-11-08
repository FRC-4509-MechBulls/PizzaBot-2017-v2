package org.usfirst.frc.team4509.robot.commands;

import org.usfirst.frc.team4509.robot.Robot;
import org.usfirst.frc.team4509.robot.subsystems.DrivingSubsystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

public class DriveForFeetCommand extends Command {
	
	private boolean isFinished;
	private double feet, secondsToDriveFor;
	
	public DriveForFeetCommand(double feet) {
		requires(Robot.drivingSubsystem);
		this.isFinished = false;
		this.feet = feet;
		this.secondsToDriveFor = feet * DrivingSubsystem.FEET_PER_SECOND;
	}

	@Override
	protected void initialize() {
		Robot.drivingSubsystem.setSpeed(0);
	}

	@Override
	protected void execute() {
		Timer timer = new Timer();
		double startTime = timer.get();
		if(this.feet > 0)
			Robot.drivingSubsystem.setSpeed(DrivingSubsystem.BASE_SPEED);
		else
			Robot.drivingSubsystem.setSpeed(-1 * DrivingSubsystem.BASE_SPEED);
		while(timer.get() - startTime < this.secondsToDriveFor) {}
		this.isFinished = true;
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
	protected void interrupted() {}

}
