package BaiTap7_Collection_Bai8;

import java.util.ArrayList;

public class InArrayListChiaHet2 {
    public static void main(String[] args) {

        //Tạo mảng
        ArrayList<Integer> arrList = new ArrayList<>();

        //Duyêt lấy phần tử bé hơn hoặc bằng 50 chia hết cho 2
        for(int i=0 ; i<=50; i++){
            if(i%2 == 0){
                arrList.add(i);  //Thêm giá trị đó vào ArayList
            }
        }

        //rồi mới duyệt arraylít in phần tử ra
        for(int value : arrList){ //value là giá trị của phần tử
            System.out.println(value);
        }

        // for thường, giá trị index = lenght -1
//        for (int j=0; j< arrList.size();j++){
//            System.out.println(arrList.get(j));
//        }
    }
}
