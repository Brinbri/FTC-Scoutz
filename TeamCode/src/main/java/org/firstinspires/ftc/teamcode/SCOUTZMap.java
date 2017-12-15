package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Brian Estevez on 11/19/2017.
 */

public class SCOUTZMap {

    DcMotor leftFrontDrive;
    DcMotor leftBackDrive;
    DcMotor rightFrontDrive;
    DcMotor rightBackDrive;
    DcMotor intakeL;
    DcMotor intakeR;
    DcMotor winch;
    BNO055IMU gyro;


    HardwareMap hMap;

    public SCOUTZMap() {

    }

    public void init(HardwareMap hardwareMap){
        this.hMap = hardwareMap;

        leftFrontDrive = hMap.get(DcMotor.class, "leftF");
        leftBackDrive = hMap.get(DcMotor.class, "leftB");
        rightFrontDrive = hMap.get(DcMotor.class, "rightF");
        rightBackDrive = hMap.get(DcMotor.class, "rightB");
        intakeL = hMap.get(DcMotor.class, "intakeL");
        intakeR = hMap.get(DcMotor.class, "intakeR");
        winch = hMap.get(DcMotor.class, "winch");S
        gyro = hMap.get(BNO055IMU.class, "gyro");

    }
}


