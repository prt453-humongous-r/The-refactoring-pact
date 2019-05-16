import java.util.Map;



public class RequestHandler_Before {
    private static final String ERROR = "error";
    private static final String SUCCESS = "success";
    private static final String WAITING = "pending";

    protected void handle (String actionNAme, Map<String, String> parameters){

        if (actionNAme.equals(ERROR)) {
            DefaultLogger logger  = DefaultLogManager.getLogger();
            String errorMessage = getMessage(parameters);
            logger.addEntry(errorMessage);

            GUIManager guiManager = GUIManager.getInstance();
            guiManger.sendUSerFeedBack(errorMessage);

        }
        else if (actionNAme.equals(SUCCESS)) {
            Email email = prepareEmail(parameters);
            EmailSender sender = new EmailSender(email);
            sender.send();
        }

    }
}
