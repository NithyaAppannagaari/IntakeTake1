// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

// CHANGE LATER!!!!!

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    /*public static final int PIVOT_ID = 0;
    public static final int ROLLER_ID = 0;
    public static final int FUNNEL_ID = 31;*/

    /*public static final int LIMIT_SWITCH_ID = 0;

    public static final int PIVOT_SIM_ID = 1;
    public static final int ROLLER_SIM_ID = 2;
    public static final int FUNNEL_SIM_ID = 4;*/

    public static final double TICKS_TO_BOTTOM = 0;
    // the # of ticks it takes to be at the bottom when pivoting
    public static final double TICKS_TO_TOP = 0; // the # of ticks it takes to be at the top when pivoting
  /*  public static final double PIVOT_DEPLOYED_TICKS = 900;*/

    public static final int PIVOT_ID = 0; // change later
    public static final int ROLLER_ID = 0; // change later

    public static final double WHEELS_SPEED = 0.6;

    public static final double PIVOT_SPEED = 0.4;
    public static final double PIVOT_STOP_SPEED_WHEN_UP = 0.23;
    public static final double PIVOT_STOP_SPEED_WHEN_DOWN = 0.0; // change if needed

   /* public static final double PIVOT_TICKS_PER_REVOLUTION = 4096;
    public static final double PIVOT_GEAR_RATIO = 10;*/

    public static final double MARGIN_OF_ERROR_TICKS = 0;

 /*   public static final double P = 0.57;
    public static final double I = 0;
    public static final double D = 0;*/
    public static final double FF = 0.31;
    /*public static final double ROTATIONAL_INERTIA = 0.1;
    public static final double PIVOT_MASS = 68.03;
    public static final double PIVOT_LENGTH = 0.1;
    public static final double PIVOT_MIN_ANGLE = -Math.PI/12;
    public static final double PIVOT_MAX_ANGLE = Math.PI/2 + Math.PI/12;*/
}
