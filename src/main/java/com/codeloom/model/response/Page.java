package com.codeloom.model.response;

public class Page<T> {
    private Integer total;
    private Integer pages;
    private T list;

    public Page(Integer total, Integer pages, T list) {
        this.total = total;
        this.pages = pages;
        this.list = list;
    }


    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public T getList() {
        return list;
    }

    public void setList(T list) {
        this.list = list;
    }
}
