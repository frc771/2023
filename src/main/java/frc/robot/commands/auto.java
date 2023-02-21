// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.Commands;
import java.util.DoubleSummaryStatistics;
import edu.wpi.first.wpilibj.Timer;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Robot;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

//public class auto extends Drive {
public class auto extends CommandBase {

 // double startTime
 double startTime = Timer.getFPGATimestamp();
  //startTime = Timer.getFPGATimestamp();

  private final Drive m_subsystem;

  
  /**
   * Creates a new DriveCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public auto(Drive subsystem) {
    m_subsystem = subsystem;
    
    //startTime = Timer.getFPGATimestamp();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   // double startTime;
    
    //startTime = Timer.getFPGATimestamp();
    //m_subsystem.broombroom();
    double time = Timer.getFPGATimestamp();
    double leftSpeed = -0.3;
    double rightSpeed = -0.27;
    if(time-startTime < 5){
      Drive.MotorControllerGroup.set(-leftSpeed);
      Drive.MotorControllerGroup2.set(rightSpeed);
      ((Drive)m_subsystem).DriveStraight(1,0);
      //if(time-startTime == 5){

        // Drive.MotorControllerGroup.set(0);
        // Drive.MotorControllerGroup2.set(0); //If we want to make it go forwards switch the negative sign

      //}
     
    }
    else{
      if(time-startTime < 8.5){
        Drive.MotorControllerGroup.set(leftSpeed);
        Drive.MotorControllerGroup2.set(-rightSpeed);
        ((Drive)m_subsystem).DriveStraight(0,-0.2);

      }

      else{
      ((Drive)m_subsystem).DriveBackward(0); //If we want to make the robot go forward during auto, change 1 to -1
      }
    }  
    
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
  
    
  

