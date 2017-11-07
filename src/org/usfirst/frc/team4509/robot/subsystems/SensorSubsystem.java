package org.usfirst.frc.team4509.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;

public class SensorSubsystem extends Subsystem {
	
	private ADXRS450_Gyro gyro;

	@Override
	protected void initDefaultCommand() {
		this.gyro = new ADXRS450_Gyro();
	}
	
	public double getAngle() {
		return this.gyro.getAngle();
	}

}
