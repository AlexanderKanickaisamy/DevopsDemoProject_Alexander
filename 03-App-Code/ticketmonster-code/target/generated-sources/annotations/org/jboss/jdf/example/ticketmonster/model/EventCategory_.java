package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(EventCategory.class)
public abstract class EventCategory_ {

	public static volatile SingularAttribute<EventCategory, String> description;
	public static volatile SingularAttribute<EventCategory, Long> id;

}

