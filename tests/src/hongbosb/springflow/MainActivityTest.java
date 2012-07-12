package hongbosb.springflow;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class hongbosb.springflow.MainActivityTest \
 * hongbosb.springflow.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("hongbosb.springflow", MainActivity.class);
    }

    public void testDivide() throws Exception {
        LazyScrollView view = new LazyScrollView(getActivity(), null);
        assertEquals(4, view.getFallCnt());
        assertTrue(view.getFallWidth() <= LazyScrollView.EXPECTED_WIDTH && view.getFallWidth() > 0);
    }

    public void testLoadImage() throws Exception {
        ImageView view = new ImageView(getActivity());

        ItemLoader loader = new ItemLoader(getActivity());
        loader.loadImage(view, "images/1.jpg");

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(view.getDrawable());
    }
}
