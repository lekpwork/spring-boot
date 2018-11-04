package com.example.test;

import com.example.Log.LogUtil;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2018/8/19</div>
 *
 * @author lekp
 * @since 1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {
        String str=System.currentTimeMillis()+"";
        LogUtil.debug(Integer.valueOf(str.substring(str.length()-5))+"");
//        TreeSet<Student> treeSet=new TreeSet<>();
//        treeSet.add(new Student("zhangsan","16"));
//        treeSet.add(new Student("lisi","12"));
//        treeSet.add(new Student("wangwu","13"));
//        LogUtil.debug(treeSet+"");
//        List list=new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1,100);
//        LogUtil.debug(list+"");
    }
}
