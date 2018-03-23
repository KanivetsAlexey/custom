/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23.03.2018 11:04:09                         ---
 * ----------------------------------------------------------------
 */
package myextension.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import myextension.constants.MyextensionConstants;
import myextension.jalo.Parking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ParkingPlace}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedParkingPlace extends GenericItem
{
	/** Qualifier of the <code>ParkingPlace.placed</code> attribute **/
	public static final String PLACED = "placed";
	/** Qualifier of the <code>ParkingPlace.estimate</code> attribute **/
	public static final String ESTIMATE = "estimate";
	/** Qualifier of the <code>ParkingPlace.parking</code> attribute **/
	public static final String PARKING = "parking";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARKING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedParkingPlace> PARKINGHANDLER = new BidirectionalOneToManyHandler<GeneratedParkingPlace>(
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
		tmp.put(PLACED, AttributeMode.INITIAL);
		tmp.put(ESTIMATE, AttributeMode.INITIAL);
		tmp.put(PARKING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PARKINGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.estimate</code> attribute.
	 * @return the estimate - Estimate time
	 */
	public Integer getEstimate(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ESTIMATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.estimate</code> attribute.
	 * @return the estimate - Estimate time
	 */
	public Integer getEstimate()
	{
		return getEstimate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.estimate</code> attribute. 
	 * @return the estimate - Estimate time
	 */
	public int getEstimateAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEstimate( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.estimate</code> attribute. 
	 * @return the estimate - Estimate time
	 */
	public int getEstimateAsPrimitive()
	{
		return getEstimateAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.estimate</code> attribute. 
	 * @param value the estimate - Estimate time
	 */
	public void setEstimate(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ESTIMATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.estimate</code> attribute. 
	 * @param value the estimate - Estimate time
	 */
	public void setEstimate(final Integer value)
	{
		setEstimate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.estimate</code> attribute. 
	 * @param value the estimate - Estimate time
	 */
	public void setEstimate(final SessionContext ctx, final int value)
	{
		setEstimate( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.estimate</code> attribute. 
	 * @param value the estimate - Estimate time
	 */
	public void setEstimate(final int value)
	{
		setEstimate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.parking</code> attribute.
	 * @return the parking
	 */
	public Parking getParking(final SessionContext ctx)
	{
		return (Parking)getProperty( ctx, PARKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.parking</code> attribute.
	 * @return the parking
	 */
	public Parking getParking()
	{
		return getParking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.parking</code> attribute. 
	 * @param value the parking
	 */
	public void setParking(final SessionContext ctx, final Parking value)
	{
		PARKINGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.parking</code> attribute. 
	 * @param value the parking
	 */
	public void setParking(final Parking value)
	{
		setParking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.placed</code> attribute.
	 * @return the placed - Start count from
	 */
	public Integer getPlaced(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PLACED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.placed</code> attribute.
	 * @return the placed - Start count from
	 */
	public Integer getPlaced()
	{
		return getPlaced( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.placed</code> attribute. 
	 * @return the placed - Start count from
	 */
	public int getPlacedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPlaced( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ParkingPlace.placed</code> attribute. 
	 * @return the placed - Start count from
	 */
	public int getPlacedAsPrimitive()
	{
		return getPlacedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.placed</code> attribute. 
	 * @param value the placed - Start count from
	 */
	public void setPlaced(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PLACED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.placed</code> attribute. 
	 * @param value the placed - Start count from
	 */
	public void setPlaced(final Integer value)
	{
		setPlaced( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.placed</code> attribute. 
	 * @param value the placed - Start count from
	 */
	public void setPlaced(final SessionContext ctx, final int value)
	{
		setPlaced( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ParkingPlace.placed</code> attribute. 
	 * @param value the placed - Start count from
	 */
	public void setPlaced(final int value)
	{
		setPlaced( getSession().getSessionContext(), value );
	}
	
}
