package org.usfirst.frc.team4509.robot.subsystems;

import org.usfirst.frc.team4509.robot.Robot;
import org.usfirst.frc.team4509.robot.RobotMap;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DrivingSubsystem extends Subsystem {
	
	public CANTalon frontLeft, frontRight, backLeft, backRight;
	private int leftSpeed, rightSpeed;

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
	
	public void setSpeed() {
		this.setSpeed(Robot.oi.getLeftSpeed(), Robot.oi.getRightSpeed());
	}
	public void setSpeed(int speed) {
		this.setSpeed(-1 * speed, speed);
	}
	public void setSpeed(int leftSpeed, int rightSpeed) {
		this.leftSpeed = leftSpeed;
		this.rightSpeed = rightSpeed;
	}
}