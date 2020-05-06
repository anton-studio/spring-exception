package cloud.anton.error.exception.http;

import cloud.anton.error.core.enumeration.SystemEvent;

public class NotFoundException extends HttpException {
    public NotFoundException(SystemEvent et){
        this.httpStatusCode = 404;
        this.code = et.getId();
        this.errorMsg = et.getDescription();
    }
}
