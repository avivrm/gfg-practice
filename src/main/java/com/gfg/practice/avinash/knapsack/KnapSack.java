package com.gfg.practice.avinash.knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Item{
    int w;
    int val;
    int cost;

    Item(int w, int val){
        this.w = w;
        this.val = val;
        this.cost = val/w;
    }

}

public class KnapSack {

    public static void main(String[] args) {

        int[]  wArr= {10,20,30};
        int[] vArr ={60,100,120};
        int capacity = 50;
        List<Item> itemLst = new ArrayList<>();

        for(int i=0;i<wArr.length;i++)
            itemLst.add(new Item(wArr[i],vArr[i]));

        Collections.sort(itemLst, (o1,o2) ->
        {
            if(o2.cost>o1.cost){
                return 1;
            }else if (o2.cost == o1.cost){
                return 0;
            }else{
                return -1;
            }
        });


        System.out.println(getTotal(itemLst, capacity));
    }

    static int getTotal(List<Item> itemList, int capacity){
        int totalVal = 0;

        for(int i=0;i<itemList.size();i++){
            Item item = itemList.get(i);

            if(capacity - item.w  > 0) {
                totalVal += item.val;
                capacity = capacity - item.w;
            }
            else{
                int leftW = item.w - (item.w - capacity);
                int newVal = item.cost * leftW;
                totalVal += newVal;
            }
        }
        return totalVal;
    }


}
