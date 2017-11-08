package org.usfirst.frc.team4509.robot.commands;

import org.usfirst.frc.team4509.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous_GoAroundAirshipFromLeftCommand extends CommandGroup {

	public Autonomous_GoAroundAirshipFromLeftCommand() {
		super.addSequential(new DriveForFeetCommand(7.77083));
		super.addSequential(new TurnCommand(Robot.gyroSubsystem.getAngle() + 45));
		super.addSequential(new DriveForFeetCommand(5));
		super.addSequential(new DriveForFeetCommand(-5));
		super.addSequential(new TurnCommand(Robot.gyroSubsystem.getAngle() - 45));
		super.addSequential(new DriveForFeetCommand(10));
	}
	
}
