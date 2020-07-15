package com.ardumagic.engrave;

public class Registry
{
    public static void register (Class cls)
    {
        System.out.println ("*** Class " + cls.getCanonicalName () + " registered.");
    }
}
