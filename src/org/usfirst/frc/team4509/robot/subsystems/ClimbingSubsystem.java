package org.usfirst.frc.team4509.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4509.robot.RobotMap;
import com.ctre.CANTalon;

/**
 * Governs the talons that are in charge of climbing
 * 
 * @author Kyle Brott
 */
public class ClimbingSubsystem extends Subsystem {
	
	private CANTalon left, right;

	@Override
	protected void initDefaultCommand() {
		this.left  = new CANTalon(RobotMap.TALON_CLIMB_LEFT);
		this.right = new CANTalon(RobotMap.TALON_CLIMB_RIGHT);
		this.left.changeControlMode(CANTalon.TalonControlMode.Voltage);
		this.right.changeControlMode(CANTalon.TalonControlMode.Voltage);
	}

}
