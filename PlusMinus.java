package missionHackerRank;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(-1);
		list.add(0);
		
		plusMinusMethod(list);
	}
	
    public static void plusMinusMethod(List<Integer> arr) {
    	   
        float pRatio = 0f, nRatio = 0f, zRatio = 0f;
        
        for(int i = 0; i< arr.size(); i++)
        {
            if(arr.get(i) > 0)
            {
                pRatio++;
            }
            else if(arr.get(i) < 0)
            {
                nRatio++;
            }
            else
            {
                zRatio++;
            }
        }
       
        pRatio = pRatio / arr.size();
        nRatio = nRatio / arr.size();
        zRatio = zRatio / arr.size();
        
        System.out.printf("%.6f",pRatio );
        System.out.printf("\n%.6f",nRatio);
        System.out.printf("\n%.6f",zRatio);
    }

}

