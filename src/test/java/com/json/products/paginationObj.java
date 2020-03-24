package com.json.products;

public class paginationObj {
    private long page;
    private long pageSize;
    private long productsCount;

    public paginationObj() {
    }

    public paginationObj(long page, long pageSize, long productsCount) {
        this.page = page;
        this.pageSize = pageSize;
        this.productsCount = productsCount;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getProductsCount() {
        return productsCount;
    }

    public void setProductsCount(long productsCount) {
        this.productsCount = productsCount;
    }

    @Override
    public String toString() {
        return "{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", productsCount=" + productsCount +
                '}';
    }
}
