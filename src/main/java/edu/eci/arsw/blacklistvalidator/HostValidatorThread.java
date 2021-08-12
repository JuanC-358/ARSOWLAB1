/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;

/**
 *
 * @author ADMIN
 */
public class HostValidatorThread extends Thread {
    private int A;
    private int B;
    private int contador=0;
    private String ipaddress;
    HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
    LinkedList<Integer> blackListOcurrences=new LinkedList<>();
    /*
    public CountThread(){
        run();
    }*/
    public void run(){  
        for (int i=A;i<=B;i++){
            if (skds.isInBlackListServer(i, ipaddress)){
                blackListOcurrences.add(i);
                //System.out.println(i);
                contador++;
            }
        } 
    } 
    public int getContador(){
        return contador;
    }
    public LinkedList<Integer> getLista(){
        return blackListOcurrences;
    }
   public HostValidatorThread(int a,int b,String ip) {
        A=a;
        B=b;
        ipaddress=ip;
        //start();
        run();
   }
}
