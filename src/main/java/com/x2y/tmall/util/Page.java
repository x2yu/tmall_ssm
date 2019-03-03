package com.x2y.tmall.util;

public class Page {
   private int start ;//开始页数
   private int count ;//每页数量
   private int total;//总个数
   private String param;//参数

   private static final int defaultCount = 5;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    //配置初始化page
    public Page(){
        count = defaultCount;
    }

    public Page(int start,int count){
        this();
        this.start = start;
        this.count = count;
    }

    //判断是否有前一页
    public boolean isHasPreviouse(){
        if(start==0)
        return false;
        return  true;
    }

    //判断时候有下一页
    public boolean isHasNext(){
        if(start==getLast())
            return false;
            return true;
    }

    //获取总页数
    public int getTotalPage(){
        int totalPage;
        if(0==total%count)
            totalPage = total/count;
        else
            totalPage = total/count + 1;

        if(0==totalPage)
            totalPage=1;

        return totalPage;
    }

    //获取最后一页开始
    public int getLast(){
        int last;
        if(0==total%count)
            last = total - count;
        else
            last = total -total%count;
        last = last<0?0:last;
        return last;
    }

    @Override
    public String toString() {
        return "Page{" +
                "start=" + start +
                ", count=" + count +
                ", total=" + total +
                ", param='" + param + '\'' +
                '}';
    }
}
