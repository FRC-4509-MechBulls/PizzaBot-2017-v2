package org.usfirst.frc.team4509.robot.commands;

import org.usfirst.frc.team4509.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ToggleGateCommand extends Command {
	
	private boolean isFinished;
	
	public ToggleGateCommand() {
		requires(Robot.gateSubsystem);
		this.isFinished = false;
	}
	
	@Override
	protected void initialize() {}
	
	@Override
	protected void execute() {
		if(Robot.gateSubsystem.isOpen())
			Robot.gateSubsystem.close();
		else
			Robot.gateSubsystem.open();
		this.isFinished = true;
	}

	@Override
	protected boolean isFinished() {
		return this.isFinished;
	}

	@Override
	protected void end() {}
	
	@Override
	protected void interrupted() {}

}
