package org.geolatte.maprenderer.util;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Optional;

import org.geolatte.test.TestSupport;

import org.junit.Test;

/**
 * Created by Karel Maesen, Geovise BVBA on 09/04/2018.
 */
public class ImageUtilsTest {

	@Test
	public void testReadImageFromData() throws IOException {
		Optional<BufferedImage> bufferedImage = ImageUtils.readImageFromBase64String( imageData );
		TestSupport.writeImageToDisk( bufferedImage.get(), "traffic_sign_70km", "png" );
	}

	private static String imageData = "iVBORw0KGgoAAAANSUhEUgAAAC8AAAAxCAYAAABK+/BHAAAEdUlEQVR42u1aLVAqURTeN0MgEAwGA8FgMBgIBgJhg8FgMBgMBgPBQDAYCMzojMFgJBiIBAKBYCAQCASCgWAgEAgEA4FAMDDjefeD3TuX5f7tsuDw5p2ZM6OX3bvfvfec7/zsOs5/2VEhx0kyzTItMK0y7TAdMJ0xJU9H3lidaZGpi/t+E3SGaYXpRAAZRifeYk+3CRq71gzs7LqK+dxNgj5g2ooRsEwxfzpu4Pk1zCOsTuE/cQEvbwl0UOFPiaigEx47hH/w/j7R6SmR6xLlckQHB1EX0GCaigLeHvjhIVGxSNRuE319kVQmE6Jul+jpiejoKOwCEvGbCnb1/Z1oNqNQgutxH07G0oTCOKd+slSK6O0tPGiZ1OsLMzMvoGBDhxOjifR6FKuMxzanMNXSqJHHYSZ40CZkOiU6OzPGAV3k1O/4poCLCzCfgCsD39TauGcq/X6fkUrbqN/f3yvYMH5zc0PHx8d0cnJC+XyeTdtbNSG9D7RkSZY6V6lU+Ny3t7e0uEWvw+FwCdPLywslEomV6zBWEebnTqzf/UUy92cxS0Vr5wKrRAFfr9f5eIqd4vX1NV1dXS0tposYIIrefKpiPq5mGPCxICJ40Uywe/743t4eM98pv+eURVt/fDAY8PFOp8MXcHl5GbQxUzqddLxCQu2kAS4XbV6Ui4sLDr5cLguBdcIB3t/fr/hBNpvlC1sR5hdax/UqIPkFpZIVSbRaLQ4czjgTFgzz8X97fHxcudd1Xf77ijw/68AXcVdNeUFgd+WRfjYH7APAQkRZC/zHhw583fFqTvkFqiRLkNfXV/5wOGFQ1gKPZE4Nvut4hbE8rTVG9fHcVvHgZDK55IyxgIeo0+mRo+R35kgmQZDxH1xS+Mfa4EHVit13lMcCntXIB7NHn0UOGSuJ1BgreA3fR975HNsR/6HValV5HdIEmJSUywl1yRHfgCg7Pwxr8wDrA8ciZoa8HqD965EmYEE4qUKhwMfxdxSb74dhGzw0nU7zvKRnkdvDdPbZZqhSCcw3lmWserYZ6Hmehe+gwDH9h8JhbeXz83MpHviKCIuorXAsbW0bOsIigfLTA4T+cKXrbB7EYDqID8httCZnEWFD5TYqpxyNRvEXJxa5TaisUiY4BSVbRBWbrNIx5fMGvg+CB//DvmFSMLFmszk3FfyPtLlnW7zb5PNWlVStZgUe4FBsYAEYAxuh8MBvoFTUAhjD4oztEE0l9RNsi3udKfkNyLU1SRqAIhAhz+l4DCWeBiIrgEMw1tZlq+YatikrwHNR2x7+Lot8HQm8XfvDjd63kdCjD/Tu7o4ymcw8kIUGD+Dn59H6NtYdM8kJIMg8PDzMORthvtFo8DEI/vc7BBhbCUqYz7zjU+OLB6teJXwAThWHYB67Fngh3i4x6MyiVFTyeNxd4kj9eZazzPvuYBpVSxC+glyFpQbMMTbXn4/lzQjqgd96M7LT76T+ibeBO/8edktvwM927tuDn21+e2D46qPmdeCGgZP58ppbYI9SXF99/AX+KnfqQtkm6gAAAABJRU5ErkJggg==";

}
