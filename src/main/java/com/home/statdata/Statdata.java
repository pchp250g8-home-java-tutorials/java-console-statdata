/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.statdata;
import java.util.*;

/**
 *
 * @author PC
 */
public class Statdata 
{

    public static void main(String[] args) 
    {
        int []AData=new int[10];
        var rnd = new Random();
        var nArrayLen = AData.length;
        var nMediane = 0;
        ArrayList nModes = new ArrayList();
        //----------------------------------------------------------------------
        nModes.clear();
        System.out.println("Generating Statictic Data:");
        for(int i = 0; i < nArrayLen; i++)
        {
            AData[i] = rnd.nextInt(40);
            System.out.print(AData[i] + " ");
        }
        //----------------------------------------------------------------------
        Arrays.sort(AData);
        System.out.println();
        System.out.println("Sorted data:");
        for(int i = 0; i < nArrayLen; i++)
        {
            System.out.print(AData[i] + " ");
        }
        //----------------------------------------------------------------------
        if (nArrayLen % 2 == 0)
        {
            var nIndex1 = (nArrayLen) / 2 - 1;
            var nIndex2 = nIndex1 + 1;
            nMediane = (AData[nIndex1] + AData[nIndex2]) / 2;
        }
        else
        {
            var nIndex = (nArrayLen + 1) / 2 - 1;
            nMediane = AData[nIndex];
        }
        for (int i = 0; i < nArrayLen; i++)
        {
            var nSameElems = 0;
            for (int j = 0; j < nArrayLen; j++)
            {
                if (AData[i] == AData[j])
                {
                    nSameElems++;
                }
            }
            if(nSameElems > 1)
            {
                nModes.add(AData[i]);
            }
        }
        var statData = Arrays.stream(AData).summaryStatistics();
        var nMin = statData.getMin();
        var nMax = statData.getMax();
        var dblAverage = statData.getAverage();
        //----------------------------------------------------------------------
        System.out.println();
        System.out.println("Statistic Charectiristics:");
        System.out.printf("Count:%d\n", nArrayLen);
        System.out.printf("Minimum:%d\n", nMin);
        System.out.printf("Maximum:%d\n", nMax);
        System.out.printf("Amplitude:%d\n", nMax - nMin);
        System.out.printf("Average Value:%f\n", dblAverage);
        System.out.printf("Mediane:%d\n", nMediane);
        //----------------------------------------------------------------------
        if(!nModes.isEmpty())
        {
            int nModesCount = nModes.size();
            System.out.println("Mode:");
            for(int i = 0;i < nModesCount;i++)
            {
                System.out.print(nModes.get(i)+" ");
            }
            System.out.println();
        }
    }
}