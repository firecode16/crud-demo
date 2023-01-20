package com.company.crud.response;

/**
 *
 * @author FireCode16
 */
public class Response {

    private String result;
    private String message;
    private Object data;

    public Response() {
    }

    public Response(String result, Object data) {
        this.result = result;
        this.data = data;
    }

    public Response(String result, String message) {
        this.result = result;
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
