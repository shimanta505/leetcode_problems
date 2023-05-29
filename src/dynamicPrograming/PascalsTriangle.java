package dynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i < numRows;i++){ //1 2
            ArrayList<Integer> triangleColumn = new ArrayList<>();
            if(i <2){

                for(int j =0; j <= i;j++){
                    triangleColumn.add(1);
                }
                triangle.add(triangleColumn);
            }else {
                for(int j = 0; j <= i;j++){

                    if(j == 0 || j == i){
                        triangleColumn.add(1);
                    }else {
                        triangleColumn.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                    }
                }
                triangle.add(triangleColumn);
            }
        }


        return triangle;
    }

    public static void print2dList(List<List<Integer>> list){

        for(int i =0;i < list.size();i++){

            for(int j =0;j<list.get(i).size();j++){
                System.out.println(list.get(i).get(j));

            }
            System.out.println(" ");
        }
    }


}
