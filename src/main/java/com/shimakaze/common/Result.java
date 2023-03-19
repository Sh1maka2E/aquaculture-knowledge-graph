package com.shimakaze.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/20 00:03:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Boolean success;
    private String errorMsg;
    private Object data;

    public static Result ok(){
        return new Result(true, null, null);
    }
    public static Result ok(Object data){
        return new Result(true, null, data);
    }
    public static Result ok(List<?> data){
        return new Result(true, null, data);
    }
    public static Result fail(String errorMsg){
        return new Result(false, errorMsg, null);
    }
}
