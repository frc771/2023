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

  private final Drive m_subsystem;

  double myStartTime;
  double myTime;
  boolean myAutoFinished = false;

  /**
   * Creates a new DriveCommand.
   *
   * 
   * @param subsystem The subsystem used by this command. */


  // Called when the command is initially scheduled.

public auto(Drive subsystems) {

  m_subsystem = subsystems;

  getRequirements(m_subsystem);

}

private void getRequirements(Drive subsystem){}

@Override
public void initialize() {
   // myStartTime = System.currentTimeMillis();
   // System.out.println("myStartTime " + myStartTime);
  //  myTime = 0.0;
  System.out.println("Auto Initialized");
  }

  // Called every time the scheduler runs while the command is scheduled.

  @Override
public void execute() {

  System.out.println("Auto Execute");
  //myTime = (System.currentTimeMillis()-myStartTime)/1000;
    //System.out.println("myTime " + myTime);
    

    // Drive.MotorControllerGroup.set(0.8);
    // Drive.MotorControllerGroup2.set(-0.8);
 
   //}

  // if((myTime>5.1)&&(myTime<10.0)) {
  //   System.out.println("Stage 2");
 
  //  Drive.MotorControllerGroup.set(0);
  //  Drive.MotorControllerGroup2.set(0);
 //  }
 /*   myTime = (System.currentTimeMillis()-myStartTime)/1000;
   System.out.println("myTime " + myTime);
   
   if((myTime>-0.0)&&(myTime<5.0)) {

    System.out.println("Stage 1");

    MotorControllerGroup.set(0.8);
    MotorControllerGroup2.set(0.5);

  }
  if((myTime>5.1)&&(myTime<-10.0)) {
    System.out.println("Stage 2");

    MotorControllerGroup.set(0);
    MotorControllerGroup2.set(0);
  }
  if((myTime>-10)){

    myAutoFinished = true;
  }*/
  
}

public boolean isFinished(){
  return myAutoFinished;

}

}
  
    
  

