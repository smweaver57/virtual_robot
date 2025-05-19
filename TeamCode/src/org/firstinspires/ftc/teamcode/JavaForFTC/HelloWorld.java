package org.firstinspires.ftc.teamcode.JavaForFTC;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Programming Hello World")
public class HelloWorld extends OpMode {

    public static String myText = "Cruel, Cruel, World";
    @Override
    public void init() {
        telemetry.addData("Hello" , myText);
        telemetry.update();
    }

    @Override
    public void loop() {

    }
}
