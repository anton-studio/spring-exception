package cloud.anton.error.exception.http;

import cloud.anton.error.core.enumeration.SystemEvent;

public class ServerErrorException extends HttpException {
    public ServerErrorException(SystemEvent et){
        this.code = et.getId();
        this.httpStatusCode = 500;
        this.errorMsg = et.getDescription();
    }
}
