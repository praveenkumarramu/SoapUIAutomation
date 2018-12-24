package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.squareup.okhttp.*;

public class steps {
    WebDriver driver;

    @Given("^Setup the XMl Request$")
    public void setup_the_xml_request()
    {

     // Reading the XMl and framing it for making the request
        ///Todo Needs to be coded


    }

    @When("^Validate the Response Code$")
    public void validate_the_response_code()
    {

        // this methods vaidate the response code for the particular request
        //this displays the response code with message

        //TODO needs to be Coded

    }

    @Then("^Validate the Response Message$")
    public void validate_the_response_message()
    {
        // this methods vaidate the response message  for the particular request
        //this displays the response message and validates whether the response is being is updated correctly or  not

        //TODO need to be Coded

    }

@When("^make post request$")
    public void make_post_request()
    {
        try {

//This post  the  request
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("text/xml");

            String body = "";//request body

            RequestBody body1 = RequestBody.create(mediaType, body);
            Request request = new Request.Builder()
                    .url("https://www.google.com")
                    .post(body1)
                    .addHeader("content-type", "text/xml")
                    .build();

            Response response = client.newCall(request).execute();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
@When("^make get request$")
    public void make_get_request()
    {
        try{
//This get the request
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("text/xml");

            String body = "";

            RequestBody body1 = RequestBody.create(mediaType, body);
            Request request = new Request.Builder()
                    .url("urls")
                    .build();

            Response response = client.newCall(request).execute();
        }catch (Exception e)
        {

        }
    }
    @Given("^Setup the XML$")
    public void setup_the_xml()
    {

//Framing the XMl in required format
        // TODO needs to be coded

    }



}
