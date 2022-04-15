package com.ripples.collections.list.tksystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TicketList {

	public static void main(String[] args) {
		
		//create objects
		Ticket ticket1 = new Ticket(1001, "Polar Express", 6985.26, "Express", "GTB", "Bostan");
		Ticket ticket2 = new Ticket(1002, "Panda Express", 7985.26, "Passanger", "Downtown", "NYK");
		Ticket ticket3 = new Ticket(1003, "Phionix Express", 8985.26, "Fast", "New Jersy", "NYK");
		Ticket ticket4 = new Ticket(1004, "Amtrack", 9985.26, "Fast", "Goleta", "Anahem");
		Ticket ticket5 = new Ticket(1005, "GrayHound", 8885.26, "Bus", "LA", "san jose");
		
		//create groupd of objects (List collection)
		List<Ticket> tlist = new ArrayList<Ticket>();
		
		//add 
		tlist.add(ticket1);
		tlist.add(ticket2);
		tlist.add(ticket3);
		
//		System.out.println(tlist);
		//iterator
		
		 Iterator<Ticket> itr = tlist.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 //counter loop
		 System.out.println(" ");
		 for(int i=0; i<tlist.size(); i++) {
			 System.out.println(i+": "+tlist.get(i));
		 }
		 
		 tlist.set(0, ticket5);
		 //counter loop
		 System.out.println(" ");
		 for(int i=0; i<tlist.size(); i++) {
			 System.out.println(i+": "+tlist.get(i));
		 }
		 
		 tlist.remove(0);
		 
		 //update
		 tlist.get(0).destination = "santa clara";
		 tlist.get(0).price =569.23;
		
		 //enhanced for loop
		 System.out.println(" ");
		 for(Ticket tk : tlist) {
			 System.out.println(tk);
		 }
	


	}

}
