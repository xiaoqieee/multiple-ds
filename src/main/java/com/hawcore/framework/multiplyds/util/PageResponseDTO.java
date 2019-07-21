package com.hawcore.framework.multiplyds.util;

import java.io.Serializable;
import java.util.List;

public class PageResponseDTO<T> implements Serializable {

    private long total;

    private int current;

    private List<T> list;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
