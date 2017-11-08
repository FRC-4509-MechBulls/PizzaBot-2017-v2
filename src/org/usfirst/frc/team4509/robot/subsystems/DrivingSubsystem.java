package org.usfirst.frc.team4509.robot.subsystems;

import org.usfirst.frc.team4509.robot.Robot;
import org.usfirst.frc.team4509.robot.RobotMap;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Governs the talons that are in charge of driving
 * 
 * @author Kyle Brott
 */
public class DrivingSubsystem extends Subsystem {
	
	public static final int BASE_SPEED = 4;
	private CANTalon frontLeft, frontRight, backLeft, backRight;
	private int leftSpeed = 0, rightSpeed = 0;

	public void initDefaultCommand() {
		this.frontLeft  = new CANTalon(RobotMap.TALON_DRIVE_FRONT_LEFT);
		this.frontRight = new CANTalon(RobotMap.TALON_DRIVE_FRONT_RIGHT);
		this.backLeft   = new CANTalon(RobotMap.TALON_DRIVE_BACK_LEFT);
		this.backRight  = new CANTalon(RobotMap.TALON_DRIVE_BACK_RIGHT);
		this.frontLeft.changeControlMode(CANTalon.TalonControlMode.Voltage);
		this.frontRight.changeControlMode(CANTalon.TalonControlMode.Voltage);
		this.backLeft.changeControlMode(CANTalon.TalonControlMode.Voltage);
		this.backRight.changeControlMode(CANTalon.TalonControlMode.Voltage);
	}
	
	public int getLeftSpeed() {
		return this.leftSpeed;
	}
	public int getRightSpeed() {
		return this.rightSpeed;
	}
	
	public void setSpeed() {
		this.setSpeed(Robot.oi.getLeftSpeed(), Robot.oi.getRightSpeed()); // get speed from controls
	}
	public void setSpeed(int speed) {
		this.setSpeed(-1 * speed, speed);
	}
	public void setSpeed(int leftSpeed, int rightSpeed) {
		this.leftSpeed = leftSpeed;
		this.rightSpeed = rightSpeed;
	}
	
}
