package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.Range;

/**
 * Created by Brian Estevez on 11/21/2017.
 */

public class SCOUTZDrivetrain {
    public SCOUTZMotor leftFrontDrive;
    public SCOUTZMotor leftBackDrive;
    public SCOUTZMotor rightFrontDrive;
    public SCOUTZMotor rightBackDrive;

    public SCOUTZGyro gyro;

    public SCOUTZDrivetrain(SCOUTZMotor leftFrontDrive, SCOUTZMotor leftBackDrive, SCOUTZMotor rightBackDrive, SCOUTZMotor rightFrontDrive, SCOUTZGyro gyro) {
        this.rightFrontDrive = rightFrontDrive;
        this.rightBackDrive = rightBackDrive;
        this.leftFrontDrive = leftFrontDrive;
        this.leftBackDrive = leftBackDrive;

        this.gyro = gyro;
    }

    public void drive(float gamepad1LeftX, float gamepad1LeftY, float gamepad1RightX ) {
        float lfPow = gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
        float lbPow = gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
        float rfPow = -gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
        float rbPow = -gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
        rfPow = Range.clip(rfPow, -1, 1);
        lfPow = Range.clip(lfPow, -1, 1);
        lbPow = Range.clip(lbPow, -1, 1);
        rbPow = Range.clip(rbPow, -1, 1);

        leftFrontDrive.setPower(lfPow);
        leftBackDrive.setPower(lbPow);
        rightFrontDrive.setPower(rfPow);
        rightBackDrive.setPower(rbPow);
    }

}




