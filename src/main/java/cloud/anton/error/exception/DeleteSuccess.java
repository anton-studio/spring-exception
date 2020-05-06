package cloud.anton.error.exception;

import cloud.anton.error.core.enumeration.SystemEvent;
import cloud.anton.error.exception.http.HttpException;

public class DeleteSuccess extends HttpException {
    public DeleteSuccess(SystemEvent et){
        this.httpStatusCode = 200;
        this.code = et.getId();
        this.errorMsg = et.getDescription();
    }
    // 200 201 204 200
    // 200 201 200 200

    // Create：201 资源本身
    // Get: 200
    // Put: 200
    // Delete: 200
}
