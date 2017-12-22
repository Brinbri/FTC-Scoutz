package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by Brian Estevez on 11/21/2017.
 */

public class SCOUTZDrivetrain {
    public SCOUTZMotor leftFrontDrive;
    public SCOUTZMotor leftBackDrive;
    public SCOUTZMotor rightFrontDrive;
    public SCOUTZMotor rightBackDrive;

    private float p;

    private boolean lastHeadingButton = false;

    private static final float MAX_DRIVE = .5f;
    private static final float MIN_DRIVE = -.5f;
    private double lastHeading = 0;

    public SCOUTZGyro gyro;
    private Telemetry telemetry;
    public SCOUTZDrivetrain(SCOUTZMotor leftFrontDrive, SCOUTZMotor leftBackDrive, SCOUTZMotor rightBackDrive, SCOUTZMotor rightFrontDrive, SCOUTZGyro gyro, Telemetry telemetry) {
        this.rightFrontDrive = rightFrontDrive;
        this.rightBackDrive = rightBackDrive;
        this.leftFrontDrive = leftFrontDrive;
        this.leftBackDrive = leftBackDrive;
        this.p = 0.001f;
        this.telemetry = telemetry;
        this.gyro = gyro;
    }

    public void drive(float gamepad1LeftX, float gamepad1LeftY, float gamepad1RightX, boolean holdHeading ) {
        float turn = gamepad1RightX;
        if (!lastHeadingButton && holdHeading){
            lastHeading = gyro.getAngle();
        }
        telemetry.addData("Gyro Angle", gyro.getAngle());

        if(holdHeading){
            turn = (float)(gyro.getAngle() - lastHeading) * p;
            telemetry.addData("Desired Angle", lastHeading);
        }

        telemetry.addData("Turn Magnitude", turn);

        driveHelper(gamepad1LeftX, gamepad1LeftY, turn);
        lastHeadingButton = holdHeading;
    }

    private void driveHelper(float gamepad1LeftX, float gamepad1LeftY, float turnMagnitude ) {
        float lfPow = gamepad1LeftY + gamepad1LeftX - turnMagnitude;
        float lbPow = gamepad1LeftY - gamepad1LeftX - turnMagnitude;
        float rfPow = -gamepad1LeftY + gamepad1LeftX - turnMagnitude;
        float rbPow = -gamepad1LeftY - gamepad1LeftX - turnMagnitude;
        rfPow = Range.clip(rfPow*MAX_DRIVE, MIN_DRIVE, MAX_DRIVE);
        lfPow = Range.clip(lfPow*MAX_DRIVE, MIN_DRIVE, MAX_DRIVE);
        lbPow = Range.clip(lbPow*MAX_DRIVE, MIN_DRIVE, MAX_DRIVE);
        rbPow = Range.clip(rbPow*MAX_DRIVE, MIN_DRIVE, MAX_DRIVE);

        leftFrontDrive.setPower(lfPow);
        leftBackDrive.setPower(lbPow);
        rightFrontDrive.setPower(rfPow);
        rightBackDrive.setPower(rbPow);
    }

}




