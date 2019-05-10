ßßß
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;


public class RequestHandler_After {

    private Map<String, Handler> handlers;

    private static final String ERROR = "error";
    private static final String SUCCESS = "success";
    private static final String WAITING = "pending";

    protected void handle (String actionName, Map<String, String> parameters){

        Handler handler = lookupHandlerBy(actionName);
        handler.execute(parameters);
    }

    public RequestHandler_After(){
        createHandlers();
    }

    private void createHandlers(){
        handlers = new HashMap<String, Handler>();
        handlers.put(ERROR, new ErrorHandler());
        handlers.put(SUCCESS, new SuccessHandler());
    }

    private Handler lookupHandlerBy(String handlerName){
        return handlers.get(handlerName);
    }


}
