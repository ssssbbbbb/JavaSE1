import java.util.ArrayList;

/*
    泛型与File中，为什么要有泛型的例子
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("漩涡鸣人");
        arrayList1.add("木大木大木大");
        arrayList1.add(250);

        for (Object o : arrayList1){
            System.out.println(o);
        }

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("小明");
        arrayList2.add("小红");
        // arrayList2.add(380); 报错！


        // 集合可以储存 继承了泛型类型的 对象
        ArrayList<AAA> arrayList3 = new ArrayList<>();
        BBB bbb = new BBB();
        arrayList3.add(bbb);
        arrayList3.add(new BBB());
    }
}

class AAA {

}

class BBB extends AAA {

}