package cn.itsource.aigou.common;

/**
 * 返回结果类的封装：
 * success:
 * msg:
 *
 */
public class AjaxResult {

    public static void main(String[] args) {
        //三个熟悉的设置：
        AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject("sdfsfds");
    }

    private boolean success=true;//操作是否成功

    private  String msg ="操作成功";//默认的操作结果的文字提示


    private  Object object=null;//返回的后台的数据信息

    public static  AjaxResult me(){

        return new AjaxResult();
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }


    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
