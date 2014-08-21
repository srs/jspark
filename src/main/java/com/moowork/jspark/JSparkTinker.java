package com.moowork.jspark;

public final class JSparkTinker
{
    public enum Pin
    {
        A0,
        A1,
        A2,
        A3,
        A4,
        A5,
        A6,
        A7,
        D0,
        D1,
        D2,
        D3,
        D4,
        D5,
        D6,
        D7
    }

    private final JSpark spark;

    public JSparkTinker( final JSpark spark )
    {
        this.spark = spark;
    }

    public int analogRead( final Pin pin )
    {
        return Integer.parseInt( this.spark.executeFunction( "analogread", pin.toString() ) );
    }

    public int digitalRead( final Pin pin )
    {
        return Integer.parseInt( this.spark.executeFunction( "digitalread", pin.toString() ) );
    }

    public int analogWrite( final Pin pin, final int value )
    {
        return Integer.parseInt( this.spark.executeFunction( "analogwrite", pin.toString() + "," + value ) );
    }

    public int digitalWrite( final Pin pin, final boolean value )
    {
        return Integer.parseInt( this.spark.executeFunction( "digitalwrite", pin.toString() + "," + ( value ? "HIGH" : "LOW" ) ) );
    }
}
