package org.usfirst.frc.team340.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoGetBins extends CommandGroup {
	
	public  AutoGetBins() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
    	
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addSequential(new DriveStraight(-.75,5));
    	addParallel(new StackerToMin());
    	addSequential(new BinGrabberGetBin());
    	addSequential(new DriveStraight(.5,2.5));
    	addSequential(new MO_BinGrabberContractGrabber());
    	addSequential(new MO_BinGrabberTop());
    }
}