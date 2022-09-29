// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.OnBoardIO;
import frc.robot.subsystems.RomiDrivetrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class backUp extends SequentialCommandGroup {
  /** Creates a new backUp. */
  public backUp(RomiDrivetrain drivetrain, OnBoardIO boardIO) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
       new ParallelRaceGroup(
            new runMotor(drivetrain),
            new buttonPress(boardIO)
        ), 
    
        new runBack(drivetrain)
  //       new runMotor(drivetrain).raceWith(new buttonPress(drivetrain)
  //       ),
  //     new stopMotor(drivetrain)
     );
    }
}
