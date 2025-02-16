package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://exmaple.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
        }

        client.disconnect();
    }
}
