package JavaConcepts.JavaConcepts;//package JavaConcepts;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//
//public class BrokenLinks {
//
//        public static void main(String[] args) throws IOException
//        {
//            // Providing The Location Of ChromeDriver
//            System.setProperty("webdriver.chrome.driver",
//                    "E:\\ECLIPSE WORKSPACE\\GeeksforGeeks\\resources\\chromedriver.exe");
//
//            WebDriver driver = new ChromeDriver();
//
//            // Maximizing Driver Window
//            driver.manage().window().maximize();
//
//            // Checking The Google Link
//            driver.get("http://www.google.co.in/");
//
//            // Getting All The Links In One List
//            List <WebElement>links =
//                    driver.findElements(By.tagName("a"));
//
//            // Printing The Total Links Number
//            System.out.println("Total Link Size: " +
//                    links.size());
//            for(int i = 0; i < links.size(); i++)
//            {
//                // Checking Each & Every Links
//                WebElement element = links.get(i);
//
//                String url = element.getAttribute("href");
//
//                URL link = new URL(url);
//                HttpURLConnection httpConn =
//                        (HttpURLConnection) link.openConnection();
//                httpConn.connect();
//
//                // Getting The Response Code
//                int code = httpConn.getResponseCode();
//
//                // If The Number Is Greater Than 400,
//                // Then It Is Broken Link
//                if(code >= 400)
//                {
//                    System.out.println("Broken Link: " +
//                            url);
//                }
//                else
//                {
//                    System.out.println("Valid Link: " +
//                            url);
//                }
//            }
//
//            System.out.println();
//            System.out.println("All Links Checked");
//
//            // Closing The Driver
//            driver.quit();
//        }
//    }
////
//System.setProperty("W")
