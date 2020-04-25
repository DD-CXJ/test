package 容器;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

//Map<key,value>==>键，值
public class Dict {
    public static void main(String[] args) {
        //中英文字典 英文--》中文，key==>value
        /**
         * Map 应用在泛型类，非关系数据库 Redis,NoSQL
         */
        HashMap<String,String> dict = new HashMap<String, String>();
        dict.put("apple","苹果");//添加
        dict.put("banana","香蕉");
        dict.put("tomato","番茄");
        dict.put("potato","土豆·");
        dict.put("dog","狗");
        dict.put("cat","猫");
        System.out.println(dict);
        dict.remove("dog");//删除
        System.out.println(dict);
        dict.replace("cat","猫咪");//修改
        System.out.println(dict);
        //遍历，迭代器，forEach
        Iterator<String> it=dict.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Iterator<String> ia=dict.values().iterator();
        while (ia.hasNext()){
            System.out.println(ia.next());
        }
        dict.forEach((k,v)->System.out.println(k+"="+v));
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个英文：");
        String word =in.next();
        System.out.println(dict.containsKey(word));//查询Key，返回一个布尔值
        if (dict.containsKey(word)){
            System.out.println(word+dict.get(word));//通过Key-->找到values
        }else{
            System.out.println("查询不到");
        }
        System.out.println("Key:"+dict.keySet());//返回一个数组
        System.out.println("values:"+dict.values());

    }
}
