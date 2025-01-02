package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.util.DoubleSolenoidToggler;
import frc.robot.util.FloatableSolenoid;

public class BallDelivery extends SubsystemBase{

    private CANSparkMax leftMotor = new CANSparkMax(0, MotorType.kBrushless);
    private CANSparkMax rightMotor = new CANSparkMax(0, MotorType.kBrushless);

    private DoubleSolenoidToggler pistons = new DoubleSolenoidToggler(6,7);
}
