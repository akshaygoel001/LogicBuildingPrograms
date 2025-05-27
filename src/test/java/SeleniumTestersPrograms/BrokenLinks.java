package SeleniumTestersPrograms;

import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class BrokenLinks {

    public static void firstStrategy(String url, String linktext){
            //System.out.println(link.getAttribute("href"));
            try{
                int responseCode = given()
                        .when()
                        .get(url)
                        .then()
                        .extract()
                        .statusCode();
//                URL urlConn = new URL(url);
//                HttpURLConnection conn = (HttpURLConnection)urlConn.openConnection();
//                conn.setRequestMethod("HEAD");
//                conn.connect();
//                int responseCode = conn.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println(url + " is a broken link"+" with response code: " + responseCode);
                } else {
                    System.out.println(url + " is a valid link"+" with response code: " + responseCode);
                }
            }
            catch (Exception e){
                System.out.println(url + ", Text: " +linktext +" - " + "is a broken link");
            }
//            System.out.println("Status code for the link :"+linkStatusCode);
    }
    public static void secondStrategy(String link){
        try {
            URL url = new URL(link);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(url + " is a broken link"+" with response code: " + httpURLConnection.getResponseCode());
            } else {
                System.out.println(url + " is a valid link"+" with response code: " + httpURLConnection.getResponseCode());
            }
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(link + " - " + "is a broken link");
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.in/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links are: " + elements.size());
        List<String> links = new ArrayList<>();
        List<String> linkTexts = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(WebElement element:elements){
            String url = element.getAttribute("href");
            String linkText = element.getText();
            links.add(url);
            linkTexts.add(linkText);
            firstStrategy(url,linkText);//1st Try:- Total time taken(in ms): 59308//2nd Try:- Total time taken(in ms): 58305
            //secondStrategy(url);//1st Try:- Total time taken(in ms): 84696
        }
        //links.stream().parallel().forEach(e -> secondStrategy(e));//Total time taken(in ms): 23947
        //links.parallelStream().forEach(e -> secondStrategy(e));//Total time taken(in ms): 22017
        //links.stream().forEach(e -> secondStrategy(e));//Total time taken(in ms): 75908
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken(in ms): "+(endTime - startTime));
    }
}
