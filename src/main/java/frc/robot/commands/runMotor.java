// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.OnBoardIO;
import frc.robot.subsystems.RomiDrivetrain;

public class runMotor extends CommandBase {
  private final RomiDrivetrain drivetrain;
  //private final OnBoardIO boardIO;
  private final Timer timer;
 // private final Timer timer;
  /** Creates a new ledOn. */
  public runMotor(RomiDrivetrain drivetrain) {
    this.drivetrain = drivetrain;
    //this.boardIO = boardIO;
    timer = new Timer();

    addRequirements(drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.reset();
    timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.run(0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
   // System.out.println(!boardIO.getButton());
    return false;
  }
}
