package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

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
    public SCOUTZMotor intake;

    public SCOUTZDrivetrain drivetrain;
    public SCOUTZElevator elevator;


    public SCOUTZ(HardwareMap hardwareMap){
        SCOUTZMap hardware = new SCOUTZMap();
        hardware.init(hardwareMap);

        rightFrontDrive = new SCOUTZMotor(hardware.rightFrontDrive, MotorType.RevHDHex);
        rightBackDrive = new SCOUTZMotor(hardware.rightBackDrive, MotorType.RevHDHex);
        leftFrontDrive = new SCOUTZMotor(hardware.leftFrontDrive, MotorType.RevHDHex);
        leftBackDrive = new SCOUTZMotor(hardware.leftBackDrive, MotorType.RevHDHex);
        intake = new SCOUTZMotor(hardware.intake, MotorType.NeveRest);

        drivetrain = new SCOUTZDrivetrain(leftFrontDrive, leftBackDrive, rightFrontDrive, rightBackDrive);
        elevator = new SCOUTZElevator(intake);

    }

}

