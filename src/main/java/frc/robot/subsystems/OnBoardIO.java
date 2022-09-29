// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnBoardIO extends SubsystemBase {
  private final DigitalInput buttonVex = new DigitalInput(8); 
  /** Creates a new OnBoardIO. */
  public OnBoardIO() {}

  public boolean getButton()
  {
    return buttonVex.get();
  } 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
