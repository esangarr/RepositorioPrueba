// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {
 
  //private SparkMax sparkMax;

  Encoder encoder = new Encoder(0, 1);

  //ESTE ES UN CAMBIO QUE HICE EN EL CODIGO QUE SE VERA REFLEJADO EN EL COMMIT

  //Encoder de cuadraturatura
  //Encoder encoder = new Encoder(0, 1, false, Encoder.EncodingType.k2X);

  
  
  double encoderValue;
  double encoderValue2;
  double encoderValue3;
  double encoderValue4;


  public Robot() {}
    

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    encoder.setDistancePerPulse(4.0 / 256.0);

  }

  @Override
  public void teleopPeriodic() {

    // Devuelve la distancia recorrida, en las unidades que definiste con setDistancePerPulse().
    encoderValue = encoder.getDistance();

    encoderValue2 = encoder.getDistancePerPulse();
    // Devuelve la velocidad, en unidades por segundo
    encoderValue3 = encoder.getRate();  

    encoderValue4 = encoder.get();

    SmartDashboard.putNumber("Encoder Value Distance", encoderValue);
    SmartDashboard.putNumber("Encoder Value Per Pulse", encoderValue2);
    SmartDashboard.putNumber("Encoder Value Rate", encoderValue3);
    SmartDashboard.putNumber("enc", encoderValue4);
    
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}