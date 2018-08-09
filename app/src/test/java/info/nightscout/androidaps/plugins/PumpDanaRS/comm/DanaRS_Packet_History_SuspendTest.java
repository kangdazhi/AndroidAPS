package info.nightscout.androidaps.plugins.PumpDanaRS.comm;


import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import info.AAPSMocker;
import info.SPMocker;
import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.db.DatabaseHelper;
import info.nightscout.androidaps.logging.L;
import info.nightscout.utils.SP;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rumen Georgiev on 8/9/2018.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({MainApp.class, SP.class, L.class})
public class DanaRS_Packet_History_SuspendTest {

    @Test
    public void runTest() {
        AAPSMocker.mockMainApp();
        AAPSMocker.mockApplicationContext();
        AAPSMocker.mockSP();
        AAPSMocker.mockL();
        DanaRS_Packet_History_Suspend packet = new DanaRS_Packet_History_Suspend(new Date(System.currentTimeMillis()));

        assertEquals("REVIEW__SUSPEND", packet.getFriendlyName());
    }

}