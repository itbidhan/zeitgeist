// ============================================================================
//   Copyright 2009-2010 Daniel W. Dyer
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
// ============================================================================
package org.uncommons.zeitgeist;

import java.net.URL;
import java.net.MalformedURLException;
import org.testng.annotations.Test;

/**
 * Unit test for the {@link Image} class.
 * @author Daniel Dyer
 */
public class ImageTest
{
    @Test
    public void testImageCredit() throws MalformedURLException
    {
        Image image = new Image(new URL("http://images.example.com/image.jpg"),
                                new URL("http://www.uncommons.org/article.html"));
        String credit = image.getImageCredit();
        // Image credit should be derived from the article URL, not the URL of the image.
        assert credit.equals("uncommons.org") : "Incorrect image credit: " + credit;
    }
}