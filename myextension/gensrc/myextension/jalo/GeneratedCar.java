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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import myextension.constants.MyextensionConstants;
import myextension.jalo.Owner;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Car}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCar extends GenericItem
{
	/** Qualifier of the <code>Car.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>Car.governmentNumber</code> attribute **/
	public static final String GOVERNMENTNUMBER = "governmentNumber";
	/** Qualifier of the <code>Car.carName</code> attribute **/
	public static final String CARNAME = "carName";
	/** Qualifier of the <code>Car.model</code> attribute **/
	public static final String MODEL = "model";
	/** Qualifier of the <code>Car.carOwner</code> attribute **/
	public static final String CAROWNER = "carOwner";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CAROWNER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCar> CAROWNERHANDLER = new BidirectionalOneToManyHandler<GeneratedCar>(
	MyextensionConstants.TC.CAR,
	false,
	"carOwner",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(GOVERNMENTNUMBER, AttributeMode.INITIAL);
		tmp.put(CARNAME, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		tmp.put(CAROWNER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.carName</code> attribute.
	 * @return the carName - name
	 */
	public String getCarName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.carName</code> attribute.
	 * @return the carName - name
	 */
	public String getCarName()
	{
		return getCarName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.carName</code> attribute. 
	 * @param value the carName - name
	 */
	public void setCarName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.carName</code> attribute. 
	 * @param value the carName - name
	 */
	public void setCarName(final String value)
	{
		setCarName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.carOwner</code> attribute.
	 * @return the carOwner
	 */
	public Owner getCarOwner(final SessionContext ctx)
	{
		return (Owner)getProperty( ctx, CAROWNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.carOwner</code> attribute.
	 * @return the carOwner
	 */
	public Owner getCarOwner()
	{
		return getCarOwner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.carOwner</code> attribute. 
	 * @param value the carOwner
	 */
	public void setCarOwner(final SessionContext ctx, final Owner value)
	{
		CAROWNERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.carOwner</code> attribute. 
	 * @param value the carOwner
	 */
	public void setCarOwner(final Owner value)
	{
		setCarOwner( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CAROWNERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.governmentNumber</code> attribute.
	 * @return the governmentNumber - Goverment number of the car
	 */
	public Integer getGovernmentNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, GOVERNMENTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.governmentNumber</code> attribute.
	 * @return the governmentNumber - Goverment number of the car
	 */
	public Integer getGovernmentNumber()
	{
		return getGovernmentNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.governmentNumber</code> attribute. 
	 * @return the governmentNumber - Goverment number of the car
	 */
	public int getGovernmentNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getGovernmentNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.governmentNumber</code> attribute. 
	 * @return the governmentNumber - Goverment number of the car
	 */
	public int getGovernmentNumberAsPrimitive()
	{
		return getGovernmentNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.governmentNumber</code> attribute. 
	 * @param value the governmentNumber - Goverment number of the car
	 */
	public void setGovernmentNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, GOVERNMENTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.governmentNumber</code> attribute. 
	 * @param value the governmentNumber - Goverment number of the car
	 */
	public void setGovernmentNumber(final Integer value)
	{
		setGovernmentNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.governmentNumber</code> attribute. 
	 * @param value the governmentNumber - Goverment number of the car
	 */
	public void setGovernmentNumber(final SessionContext ctx, final int value)
	{
		setGovernmentNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.governmentNumber</code> attribute. 
	 * @param value the governmentNumber - Goverment number of the car
	 */
	public void setGovernmentNumber(final int value)
	{
		setGovernmentNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.model</code> attribute.
	 * @return the model - Car model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.model</code> attribute.
	 * @return the model - Car model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.model</code> attribute. 
	 * @param value the model - Car model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.model</code> attribute. 
	 * @param value the model - Car model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.type</code> attribute.
	 * @return the type - Car type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.type</code> attribute.
	 * @return the type - Car type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.type</code> attribute. 
	 * @param value the type - Car type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.type</code> attribute. 
	 * @param value the type - Car type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
