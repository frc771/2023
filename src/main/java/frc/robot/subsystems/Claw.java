// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Claw extends SubsystemBase {
  private WPI_TalonSRX talonSRX9;
  /** Creates a new Claw. */
  public Claw() {
    talonSRX9 = new WPI_TalonSRX(9); //configure roboRIO to assign SparkMax to ID 9
  }

  public void Up(){
    talonSRX9.set(0.35);
  }

  public void Down(){
    talonSRX9.set(-0.35);
  }

  public void Kill(){
    talonSRX9.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
