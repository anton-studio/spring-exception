package cloud.anton.error.exception.http;

import cloud.anton.error.core.enumeration.SystemEvent;

public class ForbiddenException extends HttpException {
    public ForbiddenException(SystemEvent et){
        this.code = et.getId();
        this.httpStatusCode = 403;
        this.errorMsg = et.getDescription();
    }
}
