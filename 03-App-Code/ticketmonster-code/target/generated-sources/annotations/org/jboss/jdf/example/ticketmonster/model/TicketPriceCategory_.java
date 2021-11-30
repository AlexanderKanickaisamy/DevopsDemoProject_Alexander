package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TicketPriceCategory.class)
public abstract class TicketPriceCategory_ {

	public static volatile SingularAttribute<TicketPriceCategory, TicketCategory> ticketCategory;
	public static volatile SingularAttribute<TicketPriceCategory, Float> price;
	public static volatile SingularAttribute<TicketPriceCategory, Show> show;
	public static volatile SingularAttribute<TicketPriceCategory, Section> section;
	public static volatile SingularAttribute<TicketPriceCategory, Long> id;

}

