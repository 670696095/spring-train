package com.yto1114;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2018/11/28 13:37
 */
public enum ETest  {
    SUCCESS(200,"成功"),
    FAIL(500,"失败");

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Integer code;
    private String  msg;

    ETest(Integer code,String  msg){
        this.code = code;
        this.msg = msg;
    }

}
