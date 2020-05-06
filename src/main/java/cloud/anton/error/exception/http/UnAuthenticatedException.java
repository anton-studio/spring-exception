package cloud.anton.error.exception.http;

import cloud.anton.error.core.enumeration.SystemEvent;

public class UnAuthenticatedException extends HttpException{
    public UnAuthenticatedException(SystemEvent et){
        this.code = et.getId();
        this.httpStatusCode = 401;
        this.errorMsg = et.getDescription();
    }
}
