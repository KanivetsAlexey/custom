/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23.03.2018 11:04:09                         ---
 * ----------------------------------------------------------------
 */
package myextension.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import myextension.constants.MyextensionConstants;
import myextension.jalo.Car;
import myextension.jalo.Owner;
import myextension.jalo.Parking;
import myextension.jalo.ParkingOrder;
import myextension.jalo.ParkingPlace;

/**
 * Generated class for type <code>MyextensionManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyextensionManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Car createCar(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyextensionConstants.TC.CAR );
			return (Car)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Car : "+e.getMessage(), 0 );
		}
	}
	
	public Car createCar(final Map attributeValues)
	{
		return createCar( getSession().getSessionContext(), attributeValues );
	}
	
	public Owner createOwner(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyextensionConstants.TC.OWNER );
			return (Owner)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Owner : "+e.getMessage(), 0 );
		}
	}
	
	public Owner createOwner(final Map attributeValues)
	{
		return createOwner( getSession().getSessionContext(), attributeValues );
	}
	
	public Parking createParking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyextensionConstants.TC.PARKING );
			return (Parking)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Parking : "+e.getMessage(), 0 );
		}
	}
	
	public Parking createParking(final Map attributeValues)
	{
		return createParking( getSession().getSessionContext(), attributeValues );
	}
	
	public ParkingOrder createParkingOrder(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyextensionConstants.TC.PARKINGORDER );
			return (ParkingOrder)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ParkingOrder : "+e.getMessage(), 0 );
		}
	}
	
	public ParkingOrder createParkingOrder(final Map attributeValues)
	{
		return createParkingOrder( getSession().getSessionContext(), attributeValues );
	}
	
	public ParkingPlace createParkingPlace(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyextensionConstants.TC.PARKINGPLACE );
			return (ParkingPlace)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ParkingPlace : "+e.getMessage(), 0 );
		}
	}
	
	public ParkingPlace createParkingPlace(final Map attributeValues)
	{
		return createParkingPlace( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return MyextensionConstants.EXTENSIONNAME;
	}
	
}
