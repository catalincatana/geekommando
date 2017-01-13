package unitTests.geekommando;

import com.endava.geekommando.model.User;
import com.endava.geekommando.service.GeneralService;
import com.endava.geekommando.service.GeneralServiceImpl;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by ccatana on 10/19/2016.
 */
public class MockitoCheckNameTest {


    @Test
    public void checkDate(){
        GeneralService generalService = mock(GeneralServiceImpl.class);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        when(generalService.getDate()).thenReturn(reportDate);
        assertEquals(generalService.getDate(),reportDate);
    }
}
