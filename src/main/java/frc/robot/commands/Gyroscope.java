package frc.robot.commands;

import frc.robot.subsystems.Drive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;

public class Gyroscope extends CommandBase {
    ADXRS450_Gyro gyro = new ADXRS450_Gyro();
    double kP = 1;

@Override
public void initialize(){

}

@Override
public void execute(){
    double error= -gyro.getRate();
    Drive.tankDrive(.5 +kP * error, .5 -kP * error);
}

}