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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import myextension.constants.MyextensionConstants;
import myextension.jalo.ParkingPlace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Parking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedParking extends GenericItem
{
	/** Qualifier of the <code>Parking.capacity</code> attribute **/
	public static final String CAPACITY = "capacity";
	/** Qualifier of the <code>Parking.parkingPlace</code> attribute **/
	public static final String PARKINGPLACE = "parkingPlace";
	/**
	* {@link OneToManyHandler} for handling 1:n PARKINGPLACE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ParkingPlace> PARKINGPLACEHANDLER = new OneToManyHandler<ParkingPlace>(
	MyextensionConstants.TC.PARKINGPLACE,
	false,
	"parking",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CAPACITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Parking.capacity</code> attribute.
	 * @return the capacity - Capacity
	 */
	public Integer getCapacity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CAPACITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Parking.capacity</code> attribute.
	 * @return the capacity - Capacity
	 */
	public Integer getCapacity()
	{
		return getCapacity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Parking.capacity</code> attribute. 
	 * @return the capacity - Capacity
	 */
	public int getCapacityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCapacity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Parking.capacity</code> attribute. 
	 * @return the capacity - Capacity
	 */
	public int getCapacityAsPrimitive()
	{
		return getCapacityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Parking.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CAPACITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Parking.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final Integer value)
	{
		setCapacity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Parking.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final SessionContext ctx, final int value)
	{
		setCapacity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Parking.capacity</code> attribute. 
	 * @param value the capacity - Capacity
	 */
	public void setCapacity(final int value)
	{
		setCapacity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Parking.parkingPlace</code> attribute.
	 * @return the parkingPlace
	 */
	public Collection<ParkingPlace> getParkingPlace(final SessionContext ctx)
	{
		return PARKINGPLACEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Parking.parkingPlace</code> attribute.
	 * @return the parkingPlace
	 */
	public Collection<ParkingPlace> getParkingPlace()
	{
		return getParkingPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Parking.parkingPlace</code> attribute. 
	 * @param value the parkingPlace
	 */
	public void setParkingPlace(final SessionContext ctx, final Collection<ParkingPlace> value)
	{
		PARKINGPLACEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Parking.parkingPlace</code> attribute. 
	 * @param value the parkingPlace
	 */
	public void setParkingPlace(final Collection<ParkingPlace> value)
	{
		setParkingPlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to parkingPlace. 
	 * @param value the item to add to parkingPlace
	 */
	public void addToParkingPlace(final SessionContext ctx, final ParkingPlace value)
	{
		PARKINGPLACEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to parkingPlace. 
	 * @param value the item to add to parkingPlace
	 */
	public void addToParkingPlace(final ParkingPlace value)
	{
		addToParkingPlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from parkingPlace. 
	 * @param value the item to remove from parkingPlace
	 */
	public void removeFromParkingPlace(final SessionContext ctx, final ParkingPlace value)
	{
		PARKINGPLACEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from parkingPlace. 
	 * @param value the item to remove from parkingPlace
	 */
	public void removeFromParkingPlace(final ParkingPlace value)
	{
		removeFromParkingPlace( getSession().getSessionContext(), value );
	}
	
}
