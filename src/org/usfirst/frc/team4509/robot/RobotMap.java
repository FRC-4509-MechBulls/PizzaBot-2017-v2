package org.usfirst.frc.team4509.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int XBOX_CONTROLLER = 0;
	public static final int JOYSTICK_LEFT = 0;
	public static final int JOYSTICK_RIGHT = 0;
	
	public static final int TALON_DRIVE_FRONT_LEFT = 8;
	public static final int TALON_DRIVE_FRONT_RIGHT = 0;
	public static final int TALON_DRIVE_BACK_LEFT = 5;
	public static final int TALON_DRIVE_BACK_RIGHT = 3;

	public static final int TALON_CLIMB_LEFT = 7;
	public static final int TALON_CLIMB_RIGHT = 1;
	
	public static final int SOLENOID = 4;
}
