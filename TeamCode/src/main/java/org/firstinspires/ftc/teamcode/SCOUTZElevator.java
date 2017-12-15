package org.firstinspires.ftc.teamcode;

/**
 * Created by Brian Estevez on 12/13/2017.
 */

public class SCOUTZElevator {
    public SCOUTZMotor intakeL;
    public SCOUTZMotor intakeR;
    public SCOUTZMotor winch;


    public SCOUTZElevator( SCOUTZMotor intakeL, SCOUTZMotor intakeR, SCOUTZMotor winch){
        this.intakeL = intakeL;
        this.intakeR = intakeR;
        this.winch = winch;
    }

    public void runWinch(double pow){
        winch.setPower(pow);
    }

    public void runWinchReverse(double pow){
        winch.setPower(-pow);
    }

    public void runIntake(double pow){
        intakeL.setPower(pow);
        intakeR.setPower(-pow);
    }

    public void runIntakeReverse(double pow){
        intakeL.setPower(-pow);
        intakeR.setPower(pow);
    }
}
