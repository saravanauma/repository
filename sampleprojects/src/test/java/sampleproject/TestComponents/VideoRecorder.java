package sampleproject.TestComponents;


	import org.monte.media.Format;
	import org.monte.media.math.Rational;
	import org.monte.screenrecorder.ScreenRecorder;

	import java.awt.*;
	import java.io.File;

	import static org.monte.media.FormatKeys.*;
	import static org.monte.media.VideoFormatKeys.*;

	public class VideoRecorder extends BaseTest
	{
	    private ScreenRecorder screenRecorder;

	    public void startRecording(String testName) throws Exception {
			File file = new File(System.getProperty("user.dir")+"//reports//");
	        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        Rectangle captureSize = new Rectangle(screenSize);
	        screenRecorder = new ScreenRecorder(
	        	    GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration(),
	        	    captureSize,
	        	    new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_QUICKTIME), // Change to MOV MIME type
	        	    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	        	        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24,
	        	        FrameRateKey, Rational.valueOf(15), QualityKey, 1.0f,
	        	        KeyFrameIntervalKey, 15),
	        	    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
	        	        FrameRateKey, Rational.valueOf(30)),
	        	    null,
	        	    file
	        	);
	     screenRecorder.start();
	    }
	    public void stopRecording() throws Exception {
	        screenRecorder.stop();
	    }
	

}

