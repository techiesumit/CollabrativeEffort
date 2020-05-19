public class Utils {
    public static void main(String[] args) {
        Message message = new Message();
        message.setLogMessage("Some Messagae");
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setcId("CC");
        errorDetails.setRequestId("RRR");
        errorDetails.setMessage(message);
    }


}
