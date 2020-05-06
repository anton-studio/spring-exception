package cloud.anton.error.exception;

import cloud.anton.error.core.enumeration.SystemEvent;
import cloud.anton.error.exception.http.HttpException;

public class UpdateSuccess extends HttpException {
    public UpdateSuccess(SystemEvent et){
        this.httpStatusCode = 200;
        this.code = et.getId();
        this.errorMsg = et.getDescription();
    }
//    201 202 204
}
