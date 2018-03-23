/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23.03.2018 11:04:09                         ---
 * ----------------------------------------------------------------
 */
package myextension.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import myextension.constants.MyextensionConstants;
import myextension.jalo.Car;
import myextension.jalo.ParkingPlace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ParkingOrder}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedParkingOrder extends GenericItem
{
	/** Qualifier of the <code>ParkingOrder.priceInHour</code> attribute **/
	public static final String PRICEINHOUR = "priceInHour";
	/** Qualifier of the <code>ParkingOrder.arrivalTime</code> attribute **/
	public static final String ARRIVALTIME = "arrivalTime";
	/** Qualifier of the <code>ParkingOrder.endTime</code> attribute **/
	public static final String ENDTIME = "endTime";
	/** Qualifier of the <code>ParkingOrder.total</code> attribute **/
	public static final String TOTAL = "total";
	/** Qualifier of the <code>ParkingOrder.car</code> attribute **/
	public static final String CAR = "car";
	/** Qualifier of the <code>ParkingOrder.parkingPlace</code> attribute **/
	public static final String PARKINGPLACE = "parkingPlace";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRICEINHOUR, AttributeMode.INITIAL);
		tmp.put(ARRIVALTIME, AttributeMode.INITIAL);
		tmp.put(ENDTIME, AttributeMode.INITIAL);
		tmp.put(TOTAL, AttributeMode.INITIAL);
		tmp.put(CAR, AttributeMode.INITIAL);
		tmp.put(PARKINGPLACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.arrivalTime</code> attribute.
	 * @return the arrivalTime - time when car arrived
	 */
	public Date getArrivalTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ARRIVALTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.arrivalTime</code> attribute.
	 * @return the arrivalTime - time when car arrived
	 */
	public Date getArrivalTime()
	{
		return getArrivalTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.arrivalTime</code> attribute. 
	 * @param value the arrivalTime - time when car arrived
	 */
	public void setArrivalTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ARRIVALTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.arrivalTime</code> attribute. 
	 * @param value the arrivalTime - time when car arrived
	 */
	public void setArrivalTime(final Date value)
	{
		setArrivalTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.car</code> attribute.
	 * @return the car - car
	 */
	public Car getCar(final SessionContext ctx)
	{
		return (Car)getProperty( ctx, CAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.car</code> attribute.
	 * @return the car - car
	 */
	public Car getCar()
	{
		return getCar( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.car</code> attribute. 
	 * @param value the car - car
	 */
	public void setCar(final SessionContext ctx, final Car value)
	{
		setProperty(ctx, CAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.car</code> attribute. 
	 * @param value the car - car
	 */
	public void setCar(final Car value)
	{
		setCar( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.endTime</code> attribute.
	 * @return the endTime - end time
	 */
	public Date getEndTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.endTime</code> attribute.
	 * @return the endTime - end time
	 */
	public Date getEndTime()
	{
		return getEndTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.endTime</code> attribute. 
	 * @param value the endTime - end time
	 */
	public void setEndTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.endTime</code> attribute. 
	 * @param value the endTime - end time
	 */
	public void setEndTime(final Date value)
	{
		setEndTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.parkingPlace</code> attribute.
	 * @return the parkingPlace - parking place
	 */
	public ParkingPlace getParkingPlace(final SessionContext ctx)
	{
		return (ParkingPlace)getProperty( ctx, PARKINGPLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.parkingPlace</code> attribute.
	 * @return the parkingPlace - parking place
	 */
	public ParkingPlace getParkingPlace()
	{
		return getParkingPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.parkingPlace</code> attribute. 
	 * @param value the parkingPlace - parking place
	 */
	public void setParkingPlace(final SessionContext ctx, final ParkingPlace value)
	{
		setProperty(ctx, PARKINGPLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.parkingPlace</code> attribute. 
	 * @param value the parkingPlace - parking place
	 */
	public void setParkingPlace(final ParkingPlace value)
	{
		setParkingPlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.priceInHour</code> attribute.
	 * @return the priceInHour - price for parking till one hour
	 */
	public Integer getPriceInHour(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRICEINHOUR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.priceInHour</code> attribute.
	 * @return the priceInHour - price for parking till one hour
	 */
	public Integer getPriceInHour()
	{
		return getPriceInHour( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.priceInHour</code> attribute. 
	 * @return the priceInHour - price for parking till one hour
	 */
	public int getPriceInHourAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPriceInHour( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.priceInHour</code> attribute. 
	 * @return the priceInHour - price for parking till one hour
	 */
	public int getPriceInHourAsPrimitive()
	{
		return getPriceInHourAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.priceInHour</code> attribute. 
	 * @param value the priceInHour - price for parking till one hour
	 */
	public void setPriceInHour(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRICEINHOUR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.priceInHour</code> attribute. 
	 * @param value the priceInHour - price for parking till one hour
	 */
	public void setPriceInHour(final Integer value)
	{
		setPriceInHour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.priceInHour</code> attribute. 
	 * @param value the priceInHour - price for parking till one hour
	 */
	public void setPriceInHour(final SessionContext ctx, final int value)
	{
		setPriceInHour( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.priceInHour</code> attribute. 
	 * @param value the priceInHour - price for parking till one hour
	 */
	public void setPriceInHour(final int value)
	{
		setPriceInHour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.total</code> attribute.
	 * @return the total - total price
	 */
	public Integer getTotal(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.total</code> attribute.
	 * @return the total - total price
	 */
	public Integer getTotal()
	{
		return getTotal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.total</code> attribute. 
	 * @return the total - total price
	 */
	public int getTotalAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotal( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingOrder.total</code> attribute. 
	 * @return the total - total price
	 */
	public int getTotalAsPrimitive()
	{
		return getTotalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.total</code> attribute. 
	 * @param value the total - total price
	 */
	public void setTotal(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.total</code> attribute. 
	 * @param value the total - total price
	 */
	public void setTotal(final Integer value)
	{
		setTotal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.total</code> attribute. 
	 * @param value the total - total price
	 */
	public void setTotal(final SessionContext ctx, final int value)
	{
		setTotal( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingOrder.total</code> attribute. 
	 * @param value the total - total price
	 */
	public void setTotal(final int value)
	{
		setTotal( getSession().getSessionContext(), value );
	}
	
}
