package com.moowork.jspark;

// https://github.com/KevinGrandon/sparky/blob/master/index.js
public final class JSparkBuilder
{
    private final JSparkImpl spark;

    public JSparkBuilder()
    {
        this.spark = new JSparkImpl();
    }

    public JSparkBuilder baseUri( final String baseUri )
    {
        this.spark.baseUri = baseUri;
        return this;
    }

    public JSparkBuilder token( final String token )
    {
        this.spark.token = token;
        return this;
    }

    public JSparkBuilder deviceId( final String deviceId )
    {
        this.spark.deviceId = deviceId;
        return this;
    }

    public JSpark build()
    {
        return this.spark;
    }
}
