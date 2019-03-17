package com.java;

import java.util.ArrayList;
import java.util.List;

public class TicketPurchase {

	
	public static long waitingTime(List<Integer> tickets,int p){
		
		 Long count = 0L;
	        List<Integer> list = tickets;
	        int size=tickets.size();
	        boolean done = false;
	        for (int j = 0; j < size; j++) {

                if (list.get(j) == 0) {
                    list.remove(j);
                    size--;
                    if(j<p)
                    {
                    	p--;
                    }
                    j--;
                	continue;
                }

                list.set(j, list.get(j) - 1);
                count++;

                if (list.get(p) == 0) {
                    done = true;
                    break;
                }
            }
	        return count;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ticketslist = new ArrayList<Integer>();
		
		ticketslist.add(2);
		ticketslist.add(6);
		ticketslist.add(3);
		ticketslist.add(4);
		ticketslist.add(5);
		
		System.out.println(waitingTime(ticketslist,2));
		

	}

}
