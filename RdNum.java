package 容器;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RdNum {
    public static void main(String[] args) {
        Random rd=new Random();
        //<k,v>:k和v均为数字，v统计有多少个k产生，0-19数，产生10000个随机数，到底各个数有多少个
        Map<Integer,Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<10000;i++){
            int rdNum=rd.nextInt(20);
            System.out.println(rdNum);
            Integer freg=map.get(rdNum);
            if (freg==null){
                freg=1;
            }else {
                freg++;
            }
            map.put(rdNum,freg);
        }
        System.out.println(map);
    }
}
