package cloud.anton.error.exception;

import cloud.anton.error.core.enumeration.SystemEvent;
import cloud.anton.error.exception.http.HttpException;

public class CreateSuccess extends HttpException {
    public CreateSuccess(SystemEvent et){
        this.httpStatusCode = 201;
        this.code = et.getId();
        this.errorMsg = et.getDescription();
    }
//    201 202 204
}
