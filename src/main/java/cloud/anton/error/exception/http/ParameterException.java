package cloud.anton.error.exception.http;

import cloud.anton.error.core.enumeration.SystemEvent;

public class ParameterException extends HttpException {
    public ParameterException(SystemEvent et){
        this.code = et.getId();
        this.httpStatusCode = 400;
        this.errorMsg = et.getDescription();
    }
}
