package com.tencent.common.exception;

public class BaseException extends Exception {

  private static final long serialVersionUID = 1L;

  private final String requestId;

  private final String errorCode;

  public BaseException(String message) {
    this(message, "");
  }

  public BaseException(String message, String requestId) {
    this(message, requestId, "");
  }

  public BaseException(String message, String requestId, String errorCode) {
    super(message);
    this.requestId = requestId;
    this.errorCode = errorCode;
  }

  public String getRequestId() {
    return requestId;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String toString() {
    return "[BaseException]"
        + "code: "
        + this.getErrorCode()
        + " message:"
        + this.getMessage()
        + " requestId:"
        + this.getRequestId();
  }
}
