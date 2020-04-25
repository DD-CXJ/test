package 容器;

import java.util.ArrayList;
import java.util.Iterator;

public class Staff {
    public static void main(String[] args) {

        //String[] studentName=new String[100]; 一般数组的模板
       ArrayList<String> list = new ArrayList<String>();//泛型，可大可小，具有弹性，规定了Object类型
        list.add("CXJ");//添加String类型的值
        list.add("hh");//添加String类型的值
        list.add("CXZ");//添加String类型的值
        list.add("CXJun");//添加String类型的值
        System.out.println(list);//打印一下list容器
        System.out.println("容器大小" + list.size());//打印容器有多大
        System.out.println("提取（1）" + list.get(1));//打印提取在索引1的值
        System.out.println("删除前查询:" + list.contains("hh"));//打印查询有没有hh，是boolean值
        System.out.println("删除" + list.remove(1));//删除索引为1的值
        System.out.println("删除后查询:" + list.contains("hh"));
        System.out.println("list" + list);
        list.set(1,"诚信基");//修改
        System.out.println("把索引为1的元素，修改成诚信基"+list);
        list.add("陈兴基");
        list.add("陈兴皮");
        System.out.println("list" + list);
        System.out.println("----------forEach---------");
        for (String l : list) {
            System.out.println(list.indexOf(l) + l);
        }
        System.out.println("-----------lterator---------");
        Iterator<String> ll = list.iterator();
        while (ll.hasNext()){
            System.out.println(ll.next());
        }
    }
}
