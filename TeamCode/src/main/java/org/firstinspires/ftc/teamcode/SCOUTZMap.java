package org.firstinspires.ftc.teamcode;

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
    DcMotor intake;

    HardwareMap hMap;

    public SCOUTZMap() {

    }

    public void init(HardwareMap hardwareMap){
        this.hMap = hardwareMap;

        leftFrontDrive = hMap.get(DcMotor.class, "leftF");
        leftBackDrive = hMap.get(DcMotor.class, "leftB");
        rightFrontDrive = hMap.get(DcMotor.class, "rightF");
        rightBackDrive = hMap.get(DcMotor.class, "rightB");
        intake = hMap.get(DcMotor.class, "intake");

    }
}


