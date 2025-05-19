/*
 *  A Description of the program should go here.
 *  This program shows the basic structure and components of a simple OpMode defined by a single class.
 */

/*
 * Add Packages here.
 * A package ia directory in JAVA where the code is located. Files in the same package have special privileges with each other.
 */
package org.firstinspires.ftc.teamcode.JavaForFTC;

/*
 * Add import statements here.
 * Import statements allow code from the FTC SDK (Software Development Kit) and other installed libraries to be used here.
 * Android Studio will automatically include the import statement as you add a class so you don't need to add them manually.
 */

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/*
 * OpMode annotations go next.
 * An OpMode is a program for an FTC robot. We can have multiple OpModes. They are all stored in the TeamCode package.
 * Any line that starts with an @ is called an annotation. You can choose from @TeleOp() or @Autonomous() as OpModes.
 * @TeleOp is required here before the class for this program to show up on the driver station as an OpMode to select from.
 * You can optionally give it a name and a group, but if you leave those off then it will use your class name as the OpMode name.
 * Another useful annotation is @Disabled. Adding this after @TeleOp allows code to compile but show the OpMode on the driver station.
 * Note that the import statement for OpMode and TeleOp
 */
@TeleOp(name="Hello Steve")
/*
 * A class declaration for the OpMode goes next.
 * All Java code is grouped together in classes. Each class is in its own file that is named the same as the class with .java extension.
 * By convention, a class name should be started with a capital letter and each new word is a capital letter (Pascal case).
 * A class serves as a blueprint for creating objects. It defines the attributes (data) and methods (actions) for objects of that class.
 * The "extends" keyword means this class is a child of another class and inherits all of the attributes and methods of that class.
 * This class is a child of OpMode. A child gets all of the behavior of its parent and then can add/replace functionality.
 * The "public" keyword makes the class accessible to other classes.
 */
public class HelloWorldCommented extends OpMode {
    /* Parts of an OpMode:
     * OpModes are required to have two methods.  A method is a group of code within a class.
     * Methods are the smallest group of code that can be executed:
     *  1. init() - This is run once when the driver presses INIT.
     *  2. loop()- This is run repeatedly after driver presses PLAY but before STOP or the timer expires.
     *      Loops execute about 50,000 times per second on the robot controller (control hub).
     * OpModes may also have three optional methods:
     *  1. init_loop() - This is run repeatedly after driver presses INIT but before PLAY.
     *  2. start() - This is run once when the driver presses PLAY.
     *  3. stop()- This is run once when the driver presses STOP.
     */

    String myName = "Steve";

    // @Override tells the compiler that we may override (replace) some functionality of this method in our parent class.
    @Override

    // This method is called when the driver presses INIT.
    public void init() {
        /* Keyword "public" allows the init() method to be called from outside of the class.
         * Parameters may be passed into the method inside the ().  This init() method requires none.
         * A return type "void" means the method doesn't return anything to the class.
         */

        // Send a message to the driver station using the telemetry method from the OpMode class
        telemetry.addData("Hello" , myName);
    }

    @Override
    // This method is called when the driver presses PLAY.  It currently doesn't do anything but a loop is required here
    public void loop() {
        // intentionally left blank
    }
}
