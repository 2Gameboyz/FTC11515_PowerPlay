package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;

public class FullAutonomous extends BaseAutonomous {
    @Override
    public BaseHardwareMap initializeHardwareMap() { return new FullHardwareMap(hardwareMap); }

    @Override
    public void run() {
        detectSignal();
        driveToJunction();
        driveToZone();
    }
};
