package org.firstinspires.ftc.teamcode;

/**
 * Created by Brian Estevez on 12/13/2017.
 */

public class SCOUTZElevator {
    public SCOUTZMotor intakeL;
    public SCOUTZMotor intakeR;


    public SCOUTZElevator( SCOUTZMotor intakeL, SCOUTZMotor intakeR){
        this.intakeL = intakeL;
        this.intakeR = intakeR;
    }

    public void runIntake(double pow){
        intakeL.setPower(pow);
        intakeR.setPower(pow);
    }

    public void runIntakeReverse(double pow){
        intakeL.setPower(pow);
        intakeR.setPower(pow);
    }
}
