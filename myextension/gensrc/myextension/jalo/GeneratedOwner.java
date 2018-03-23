/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23.03.2018 11:04:09                         ---
 * ----------------------------------------------------------------
 */
package myextension.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import myextension.constants.MyextensionConstants;
import myextension.jalo.Car;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.User Owner}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOwner extends User
{
	/** Qualifier of the <code>Owner.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>Owner.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>Owner.cars</code> attribute **/
	public static final String CARS = "cars";
	/**
	* {@link OneToManyHandler} for handling 1:n CARS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Car> CARSHANDLER = new OneToManyHandler<Car>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Owner.cars</code> attribute.
	 * @return the cars
	 */
	public Collection<Car> getCars(final SessionContext ctx)
	{
		return CARSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Owner.cars</code> attribute.
	 * @return the cars
	 */
	public Collection<Car> getCars()
	{
		return getCars( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Owner.cars</code> attribute. 
	 * @param value the cars
	 */
	public void setCars(final SessionContext ctx, final Collection<Car> value)
	{
		CARSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Owner.cars</code> attribute. 
	 * @param value the cars
	 */
	public void setCars(final Collection<Car> value)
	{
		setCars( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cars. 
	 * @param value the item to add to cars
	 */
	public void addToCars(final SessionContext ctx, final Car value)
	{
		CARSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cars. 
	 * @param value the item to add to cars
	 */
	public void addToCars(final Car value)
	{
		addToCars( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cars. 
	 * @param value the item to remove from cars
	 */
	public void removeFromCars(final SessionContext ctx, final Car value)
	{
		CARSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cars. 
	 * @param value the item to remove from cars
	 */
	public void removeFromCars(final Car value)
	{
		removeFromCars( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Owner.firstName</code> attribute.
	 * @return the firstName - First Name
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Owner.firstName</code> attribute.
	 * @return the firstName - First Name
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Owner.firstName</code> attribute. 
	 * @param value the firstName - First Name
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Owner.firstName</code> attribute. 
	 * @param value the firstName - First Name
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Owner.lastName</code> attribute.
	 * @return the lastName - Last Name
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Owner.lastName</code> attribute.
	 * @return the lastName - Last Name
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Owner.lastName</code> attribute. 
	 * @param value the lastName - Last Name
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Owner.lastName</code> attribute. 
	 * @param value the lastName - Last Name
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
}
