package org.usfirst.frc.team4509.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4509.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;

public class GateSubsystem extends Subsystem {
	
	private Solenoid solenoid;

	@Override
	protected void initDefaultCommand() {
		this.solenoid = new Solenoid(RobotMap.SOLENOID);
	}
	
	public boolean isOpen() {
		return solenoid.get();
	}
	public void open() {
		this.solenoid.set(true);
	}
	public void close() {
		this.solenoid.set(false);
	}

}