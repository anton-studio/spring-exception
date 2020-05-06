package cloud.anton.error.core;

import cloud.anton.error.core.enumeration.SystemEvent;
import cloud.anton.error.exception.CreateSuccess;
import lombok.Getter;

@Getter
public class UnifyResponse {
    private int code;
    private String message;
    private String request;

    public UnifyResponse(int code, String message, String request){
        this.code = code;
        this.message = message;
        this.request = request;
    }

    public static void createSuccess(SystemEvent et) {
        throw new CreateSuccess(et);
    }
}
