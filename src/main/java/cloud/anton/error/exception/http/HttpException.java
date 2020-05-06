package cloud.anton.error.exception.http;

import lombok.Getter;

@Getter
public class HttpException extends RuntimeException {
    protected Integer code;
    protected Integer httpStatusCode = 500;
    protected String errorMsg;
}
