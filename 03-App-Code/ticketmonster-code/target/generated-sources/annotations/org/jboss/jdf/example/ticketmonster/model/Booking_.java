package org.jboss.jdf.example.ticketmonster.model;

import java.util.Date;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Booking.class)
public abstract class Booking_ {

	public static volatile SetAttribute<Booking, Ticket> tickets;
	public static volatile SingularAttribute<Booking, Performance> performance;
	public static volatile SingularAttribute<Booking, String> contactEmail;
	public static volatile SingularAttribute<Booking, Long> id;
	public static volatile SingularAttribute<Booking, Date> createdOn;
	public static volatile SingularAttribute<Booking, String> cancellationCode;

}

