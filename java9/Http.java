package java9;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * @author hazel
 */
public class Http {
    public static void main(String[] args) {
        Http http = new Http();
        http.newHttpClient();


    }

    public void newHttpClient() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = (HttpRequest.newBuilder().GET().
                    timeout(Duration.ofSeconds(10)).uri(URI.create("https://www.google.com")).build());//서버 연결이 안 될때 계속 기다리게 되므로 타입아웃 조건을 넣어줄것 .

            //해당 url에 요청을 보내 응답 받기
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("-======");
            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
