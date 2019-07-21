package com.hawcore.framework.multiplyds.framework.config;

import com.hawcore.framework.multiplyds.framework.util.Stack;

public class DbContextHolder {

    private static final ThreadLocal contextHolder = new ThreadLocal<>();

    private static final ThreadLocal<Stack<String>> dsContextHolder = new InheritableThreadLocal<Stack<String>>() {
        @Override
        protected Stack<String> initialValue() {
            return new Stack<>();
        }
    };

    /**
     * 设置数据源
     *
     * @param serviceName
     */
    public static void setDbType(String serviceName) {
        contextHolder.set(serviceName);
        dsContextHolder.get().push(serviceName);
        System.out.println("切换到数据源:" + serviceName);
    }

    /**
     * 取得当前数据源
     *
     * @return
     */
    public static String getDbType() {
        return (String) contextHolder.get();
    }

    /**
     * 方法执行完，需要回退至上一个数据源
     */
    public static void reback() {
        String serviceName = dsContextHolder.get().pop();
        System.out.println("释放数据源:" + serviceName);
        contextHolder.set(dsContextHolder.get().getTop());
        System.out.println("切换回数据源:" + dsContextHolder.get().getTop());
    }

    /**
     * 清除上下文数据
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
}
