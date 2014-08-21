package com.moowork.jspark;

import org.json.JSONObject;

import com.goebl.david.Request;
import com.goebl.david.Webb;

final class JSparkImpl
    implements JSpark
{
    private final static String DEFAULT_BASE_URI = "https://api.spark.io/v1";

    protected String baseUri = DEFAULT_BASE_URI;

    protected String accessToken;

    protected String deviceId;

    @Override
    public String getVariable( final String name )
    {
        return doExecute( name, null );
    }

    @Override
    public String executeFunction( final String name, final String param )
    {
        return doExecute( name, param );
    }

    private String doExecute( final String name, final String param )
    {
        final Webb webb = Webb.create();
        final Request request = webb.post( buildCommandUrl( name ) );
        request.param( "access_token", "2ad27019e6de659db4cea9f0718c8d139eb6802a" );

        if ( param != null )
        {
            request.param( "param", param );
        }

        final JSONObject json = request.asJsonObject().getBody();

        try
        {
            return json.getString( "return_value" );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException( e );
        }
    }

    private String buildCommandUrl( final String name )
    {
        return this.baseUri + "/devices/" + this.deviceId + "/" + name;
    }
}
