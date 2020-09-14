package blanco.constants;


import blanco.constants.task.BlancoConstantsProcessImpl;
import blanco.constants.task.valueobject.BlancoConstantsProcessInput;
import org.junit.Test;

import java.io.IOException;

/**
 * blancoConstants の試験
 * @author tueda
 */
public class BlancoConstantsTest {

    @Test
    public void testBlancoConstants() {
        BlancoConstantsProcessInput input = new BlancoConstantsProcessInput();
        input.setMetadir("meta/constants");
        input.setEncoding("UTF-8");
        input.setTmpdir("tmpTest");
        input.setTargetdir("sample/blanco");
        input.setTargetStyle("maven");
        input.setVerbose(true);
        input.setLineSeparator("LF");


        BlancoConstantsProcessImpl imple = new BlancoConstantsProcessImpl();
        try {
            imple.execute(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBlancoConstantsLegacy() {
        BlancoConstantsProcessInput input = new BlancoConstantsProcessInput();
        input.setMetadir("meta/constants");
        input.setEncoding("UTF-8");
        input.setTmpdir("tmpTest");
        input.setTargetdir("sample/blanco");
        input.setVerbose(true);
        input.setLineSeparator("CR");

        BlancoConstantsProcessImpl imple = new BlancoConstantsProcessImpl();
        try {
            imple.execute(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
