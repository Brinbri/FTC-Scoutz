package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.SCOUTZMotor.MotorType;

/**
 * Created by Brian Estevez on 11/19/2017.
 */

public class SCOUTZ {

    //motors
    public SCOUTZMotor leftFrontDrive;
    public SCOUTZMotor leftBackDrive;
    public SCOUTZMotor rightFrontDrive;
    public SCOUTZMotor rightBackDrive;
    public SCOUTZMotor intakeL;
    public SCOUTZMotor intakeR;
    public SCOUTZMotor winch;

    public SCOUTZDrivetrain drivetrain;
    public SCOUTZElevator elevator;

    public SCOUTZGyro gyro;

    public SCOUTZ(HardwareMap hardwareMap, Telemetry telemetry){
        SCOUTZMap hardware = new SCOUTZMap();
        hardware.init(hardwareMap);

        rightFrontDrive = new SCOUTZMotor(hardware.rightFrontDrive, MotorType.RevHDHex);
        rightBackDrive = new SCOUTZMotor(hardware.rightBackDrive, MotorType.RevHDHex);
        leftFrontDrive = new SCOUTZMotor(hardware.leftFrontDrive, MotorType.RevHDHex);
        leftBackDrive = new SCOUTZMotor(hardware.leftBackDrive, MotorType.RevHDHex);
        intakeL = new SCOUTZMotor(hardware.intakeL, MotorType.NeveRest);
        intakeR = new SCOUTZMotor(hardware.intakeR, MotorType.NeveRest);
        winch = new SCOUTZMotor(hardware.winch, MotorType.NeveRest);
        gyro = new SCOUTZGyro(hardware.gyro);

        drivetrain = new SCOUTZDrivetrain(leftFrontDrive, leftBackDrive, rightFrontDrive, rightBackDrive, gyro, telemetry);
        elevator = new SCOUTZElevator(intakeL, intakeR, winch);

    }

}

