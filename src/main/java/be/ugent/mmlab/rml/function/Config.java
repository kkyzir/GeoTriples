package be.ugent.mmlab.rml.function;

import java.util.HashMap;

/***************************************************************************
*
* @author: dimis (dimis@di.uoa.gr)
* 
****************************************************************************/
public class Config {
	public static String EPSG_CODE = "4326";
	public static boolean useGML3=true;
	public static final HashMap<String, String> user_namespaces=new HashMap<String, String>();
	public static final String GEOTRIPLES_AUTO_ID = "GeoTriplesID";
}
