package com.moowork.jspark;

public interface JSpark
{
    public int analogRead( String pin );

    public boolean digitalRead( String pin );

    public int analogWrite( String pin, int value );

    public boolean digitalWrite( String pin, boolean value );

    public String getVariable( String name );

    public String executeFunction( String name, String param );
}
