/*
package StepDefinition;
import com.squareup.okhttp.*;

public class sample {
    private Boolean addAccountCredit(String reqBody) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String manageCustomerUrl = JsonDataReader.getEnvUrl("ESB_ATG_API", env).concat("/manageCustomer/v1");
        String base64Key = JsonDataReader.getEnvUrl("ESB_ATG_API_AUTH", env);
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/xml"), reqBody);
        Request.Builder requestBuilder = new Request.Builder()
                .url(manageCustomerUrl)
                .post(requestBody)
                .addHeader("content-type", "text/xml")
                .addHeader("SOAPAction", "abs`d")
                .addHeader("Authorization", "Basic " + base64Key);
        Response response = null;
        try {
            sessionCookies.forEach(cookie -> requestBuilder.addHeader("Cookie", cookie));
            response = okHttpClient.newCall(requestBuilder.build()).execute();
            if (response.code() == 200) {
                System.out.println(response.body().string());
                return true;
            } else {
                System.out.println(response.code());
                System.out.println(response.body().string());
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Optional.ofNullable(response).ifPresent(Response::close);
        }
        return false;
    }
}
*/
