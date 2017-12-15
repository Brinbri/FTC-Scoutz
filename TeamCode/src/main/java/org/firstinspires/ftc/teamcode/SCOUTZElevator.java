package org.firstinspires.ftc.teamcode;

/**
 * Created by Brian Estevez on 12/13/2017.
 */

public class SCOUTZElevator {
    public SCOUTZMotor intake;


    public SCOUTZElevator( SCOUTZMotor intake){
        this.intake = intake;
    }

    public void runIntake(double pow){
        intake.setPower(pow);
    }

    public void runIntakeReverse(double pow){
        intake.setPower(pow);
    }
}
