package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TicketCategory.class)
public abstract class TicketCategory_ {

	public static volatile SingularAttribute<TicketCategory, String> description;
	public static volatile SingularAttribute<TicketCategory, Long> id;

}

