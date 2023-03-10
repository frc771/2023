// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drive;
import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.DoubleSummaryStatistics;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Robot;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

public class IntakeOut extends CommandBase {
  private final Intake m_Intake;
  /** Creates a new IntakeOut. */
  public IntakeOut(Intake intake) {
    m_Intake = intake;
    addRequirements(m_Intake);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Intake.Out();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}