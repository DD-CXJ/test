package 容器;


import java.util.HashSet;
import java.util.Iterator;

public class Staff2 {
    public static void main(String[] args) {
        //HashSet容器是一个交集容器，没有重复的元素，且没有索引，是乱的，删除元素时不能用索引删除
        HashSet<String> set = new HashSet<String>();

        set.add("CXJ");//添加String类型的值
        set.add("hh");//添加String类型的值
        set.add("CXZ");//添加String类型的值
        set.add("CXJun");//添加String类型的值
        System.out.println("set1:"+set);//打印一下set容器
        System.out.println("容器大小" + set.size());//打印容器有多大
   //     System.out.println("提取（1）" + set.get(1));//打印提取在索引1的值
        System.out.println("删除前查询:" + set.contains("hh"));//打印查询有没有hh，是boolean值
        System.out.println("删除" + set.remove("hh"));
        System.out.println("删除后查询:" + set.contains("hh"));
        System.out.println("set2:" + set);
        set.add("皮皮怪");
        set.add("马皮");
        System.out.println("set3:" + set);
        System.out.println("----------forEach---------");
        for (String l : set) {
          //  System.out.println(set.indexOf(l) + l);
            System.out.println(l);
        }
        System.out.println("-----------lterator---------");
        Iterator<String> ll = set.iterator();
        while (ll.hasNext()) {
            System.out.println(ll.next());
        }
    }
}
