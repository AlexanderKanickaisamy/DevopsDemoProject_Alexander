package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Ticket.class)
public abstract class Ticket_ {

	public static volatile SingularAttribute<Ticket, Seat> seat;
	public static volatile SingularAttribute<Ticket, TicketCategory> ticketCategory;
	public static volatile SingularAttribute<Ticket, Float> price;
	public static volatile SingularAttribute<Ticket, Long> id;

}

