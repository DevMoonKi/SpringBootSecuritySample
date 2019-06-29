package com.devmk.test.vo;

import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
	
    private Map<String, Object> attribute = new HashMap<>();

    private boolean result;
    private Object obj;
    private String failMsg;
    
    private Result(boolean result, Object obj) {
        this.result = result;
        this.obj = obj;
    }

    private Result(boolean result) {
        this.result = result;
    }

    public static Result success(Object obj) {
        return new Result(true, obj);
    }

    public static Result success() {
        return new Result(true);
    }

    public static Result fail(String failMsg) {
        Result result = new Result(false);
        result.failMsg = failMsg;
        return result;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Object getObj() {
        return obj;
    }

    public <T> T getObj(Class<T> clazz) {
        return clazz.cast(getObj());
    }

}
