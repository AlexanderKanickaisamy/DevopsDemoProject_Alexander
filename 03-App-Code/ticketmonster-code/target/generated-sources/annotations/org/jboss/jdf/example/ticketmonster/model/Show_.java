package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Show.class)
public abstract class Show_ {

	public static volatile SingularAttribute<Show, Venue> venue;
	public static volatile SetAttribute<Show, TicketPriceCategory> priceCategories;
	public static volatile SingularAttribute<Show, Long> id;
	public static volatile SingularAttribute<Show, Event> event;
	public static volatile SetAttribute<Show, Performance> performances;

}

