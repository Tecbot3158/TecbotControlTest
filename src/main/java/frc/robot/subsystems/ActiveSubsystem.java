// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;

public class ActiveSubsystem extends SubsystemBase {
  /** Creates a new ActiveSubsystem. */

  private CommandPS4Controller control;
  public ActiveSubsystem( CommandPS4Controller c1) {

    control = c1;

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    
    //System.out.println("executing " + control.getL2Axis() + "  " + control.getR2Axis() );


  }
}
