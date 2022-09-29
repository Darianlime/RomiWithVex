// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.OnBoardIO;
import frc.robot.subsystems.RomiDrivetrain;

public class buttonPress extends CommandBase {
  //private final RomiDrivetrain drivetrain;
  private final OnBoardIO boardIO;
  //private final Timer timer;
  /** Creates a new buttonStop. */
  public buttonPress(OnBoardIO boardIO) {
   // this.drivetrain = drivetrain;
    this.boardIO = boardIO;
   // timer = new Timer();
    addRequirements(boardIO);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}
    

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // if (timer.hasElapsed(5)) {
    //   drivetrain.run(-0.5);
    }
  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return !boardIO.getButton();
  }
}
